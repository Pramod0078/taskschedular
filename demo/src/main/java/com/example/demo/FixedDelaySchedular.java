package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class FixedDelaySchedular {

    public void task(){

        log.info("Fixed delay task - " + System.currentTimeMillis() / 1000);
    }
}
