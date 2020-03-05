package com.github.cronjob.jobconfig;

/**
 * @Author: wy
 * @Date: Created in 12:16 2020/3/5
 * @Description:
 * @Modified: By：
 */

import com.github.cronjob.annotation.CronJobHandler;
import com.github.cronjob.annotation.JobHandler;
import com.github.cronjob.exception.CronJobException;
import com.github.cronjob.excute.SchedularServiceImpl;
import com.github.cronjob.remote.etcd.EtcdClientFactoryBean;
import com.github.cronjob.remote.grpc.JobServer;
import com.google.common.collect.Maps;
import io.netty.util.internal.StringUtil;
import org.reflections.Reflections;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Set;

@Configuration
@EnableConfigurationProperties(CronJobProperties.class)
@ConditionalOnProperty(prefix = CronJobProperties.PREFIX, name = "enabled", havingValue = "true", matchIfMissing = false)
@Slf4j
public class CronJobAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public EtcdClientFactoryBean etcdClientFactoryBean() {
        return new EtcdClientFactoryBean();
    }

    @Bean
    @ConditionalOnMissingBean
    public MultiJob multiJob() throws IllegalAccessException, InstantiationException {

        Set<Class<?>> typesAnnotatedWith = new Reflections().getTypesAnnotatedWith(JobHandler.class);

        HashMap<String, CronJobHandler<?>> executeHandlers = Maps.newHashMapWithExpectedSize(typesAnnotatedWith.size());

        for (Class<?> e : typesAnnotatedWith) {
            String handlerName = e.getAnnotation(JobHandler.class).name();
            if (StringUtil.isNullOrEmpty(handlerName)) {
                handlerName = e.getName();
            }
            //生产handler实例
            Object executeHandler = e.newInstance();
            if (executeHandler instanceof CronJobHandler) {
                executeHandlers.put(handlerName, (CronJobHandler<?>) executeHandler);
            } else {
                throw new CronJobException("使用@JobHandler必须要实现 CronJobHandler");
            }
        }
        return new MultiJob(executeHandlers);
    }

    @Bean
    @ConditionalOnMissingBean
    public JobServer jobServer() {
        return new JobServer();
    }

    @Bean
    @ConditionalOnMissingBean
    public SchedularServiceImpl schedularService() {
        return new SchedularServiceImpl();
    }
}
