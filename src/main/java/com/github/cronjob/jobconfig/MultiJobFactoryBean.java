package com.github.cronjob.jobconfig;

import com.github.cronjob.annotation.CronJobHandler;
import com.github.cronjob.annotation.JobHandler;
import com.github.cronjob.exception.CronJobException;
import com.google.common.collect.Maps;
import io.etcd.jetcd.Client;
import io.netty.util.internal.StringUtil;
import org.reflections.Reflections;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Set;

/**
 * @Author: wy
 * @Date: Created in 13:15 2020/3/1
 * @Description: 扫描所有任务信息
 * @Modified: By：
 */
@Component
public class MultiJobFactoryBean implements FactoryBean<MultiJob> {


    @Override
    public MultiJob getObject() throws Exception {
        return createInstance();
    }

    @Override
    public Class<?> getObjectType() {
        return MultiJob.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    protected MultiJob createInstance() throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections();

        Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(JobHandler.class);

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

}


