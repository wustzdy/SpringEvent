package com.wustzdy.spring.event.bean.event;

import org.springframework.context.ApplicationEvent;

public class PayEvent extends ApplicationEvent {

    public PayEvent(Object source) {
        super(source);
    }
}