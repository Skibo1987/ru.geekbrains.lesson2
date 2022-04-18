package ru.geekbrains.less2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class Box {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public Box(String color) {

        this.color = color;
    }

    @PostConstruct
    public void init() {

        this.color = "red";
    }

    public Box() {

    }

}
