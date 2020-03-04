package com.github.cronjob.exception;

/**
 * @Author: wy
 * @Date: Created in 20:55 2020/3/1
 * @Description:
 * @Modified: By：
 */
public class CronJobException extends RuntimeException {

    public CronJobException(String msg) {
        super(msg);
    }

    public CronJobException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
