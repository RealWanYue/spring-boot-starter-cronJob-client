package com.github.cronjob.remote.etcd;

import com.github.cronjob.jobconfig.CronJobProperties;
import io.etcd.jetcd.Client;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: wy
 * @Date: Created in 19:02 2020/2/29
 * @Description: 生成Etcd Client
 * @Modified: By：
 */
@Component
@EnableConfigurationProperties(CronJobProperties.class)
public class EtcdClientFactoryBean extends AbstractFactoryBean<Client> {

    @Resource
    private CronJobProperties cronJobProperties;

    @Override
    public Class<?> getObjectType() {
        return Client.class;
    }

    @Override
    protected Client createInstance() {
        return Client.builder().endpoints(cronJobProperties.getEndpoints()).build();
    }

    @Override
    protected void destroyInstance(Client instance) {
        if (instance != null) {
            instance.close();
        }
    }
}