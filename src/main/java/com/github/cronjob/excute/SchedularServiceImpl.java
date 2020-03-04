package com.github.cronjob.excute;

import com.github.cronjob.annotation.CronJobHandler;
import com.github.cronjob.annotation.ReturnT;
import com.github.cronjob.jobconfig.MultiJob;
import com.github.cronjob.protocol.entity.ExecuteRequest;
import com.github.cronjob.protocol.entity.ExecuteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: wy
 * @Date: Created in 21:48 2020/2/28
 * @Description:
 * @Modified: By：
 */
@Component(value = "schedularService")
public class SchedularServiceImpl extends AbstractJobExecuter {

    @Resource
    private MultiJob multiJob;

    @Override
    protected ExecuteResult doExecute(ExecuteRequest request) {
        CronJobHandler<?> cronJobHandler = multiJob.getExecuteHandlerMap().get(request.getHandlerName());
        long start = System.nanoTime();
        ReturnT<?> execute = cronJobHandler.execute(request.getParameter());
        return ExecuteResult.newBuilder().
                setMessage(execute.getMsg()).
                setSuccess(execute.getSuccess()).
                setStartTime(start + "").
                setEndTime(System.nanoTime() + "").
                build();
    }
}
