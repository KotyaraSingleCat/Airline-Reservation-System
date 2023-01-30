package com.airline.reservation.system;

import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class Test {

    public String getMsg() {
        return "Test!";
    }
}
