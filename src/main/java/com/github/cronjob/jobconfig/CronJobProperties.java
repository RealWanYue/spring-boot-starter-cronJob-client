package com.github.cronjob.jobconfig;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: wy
 * @Date: Created in 18:10 2020/2/29
 * @Description: cronJob配置
 * @Modified: By：
 */
@Data
@ConfigurationProperties(CronJobProperties.PREFIX)
@Slf4j
public class CronJobProperties {
    public static final String PREFIX = "cron.job";

    private boolean enabled;
    /**
     * etcd url
     */
    private String[] endpoints;
    /**
     * 本机服务名称
     */
    private String appName;
}
