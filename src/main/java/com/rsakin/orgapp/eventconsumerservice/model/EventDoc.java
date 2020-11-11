package com.rsakin.orgapp.eventconsumerservice.model;

import lombok.Value;

@Value
public class EventDoc {
    Integer id;
    String subject;
    Integer duration;
    Integer organization;
}
