package com.example.demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
public class CornSchedular {

    public void task(){
        log.info("cron task - " + System.currentTimeMillis() / 1000);
    }
}
