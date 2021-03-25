package com.wustzdy.spring.event.bean.controller;

import com.wustzdy.spring.event.bean.SpringContextHolder;
import com.wustzdy.spring.event.bean.event.PayEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class payController {
    @GetMapping("/pay")
    public void pay() {
        log.info("开始支付");
        log.info("支付成功，开始发布事件");
        SpringContextHolder.publishEvent(new PayEvent("支付成功"));
        log.info("保存支付记录");
    }
}
