package com.github.cronjob.annotation;

/**
 * @Author: wy
 * @Date: Created in 20:33 2020/3/1
 * @Description: 任务调度请实现该接口
 * @Modified: By：
 */

public interface CronJobHandler<T> {

    ReturnT<T> execute(String param);
}
