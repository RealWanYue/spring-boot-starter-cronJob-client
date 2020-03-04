package com.github.cronjob.annotation;


import java.lang.annotation.*;

/**
 * @Author: wy
 * @Date: Created in 22:00 2020/2/28
 * @Description: 标记任务执行器
 * @Modified: By：
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JobHandler {

    /**
     * 任务名称
     *
     * @return
     */
    String name();

}
