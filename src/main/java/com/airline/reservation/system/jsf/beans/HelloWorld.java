package com.airline.reservation.system.jsf.beans;

import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@ManagedBean(name = "helloWorld", eager = true)
@Component
public class HelloWorld {
    private String country;
    private List<String> countries;

    public HelloWorld() {
        this.countries = new ArrayList<>();
        System.out.println("HelloWorld bean started!!!");
    }

    public String getCountry() {
        return country;
    }

    public List<String> getCountries() {
        this.countries.add("Spain");
        this.countries.add("Ukraine");
        this.countries.add("America");
        return countries;
    }
}
