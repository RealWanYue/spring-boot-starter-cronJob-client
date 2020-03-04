package com.github.cronjob.jobconfig;

import com.github.cronjob.annotation.CronJobHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiJob {
    HashMap<String, CronJobHandler<?>> executeHandlerMap;
}