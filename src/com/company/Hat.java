package com.company;
import java.io.Serializable;

public class Hat implements Serializable{
    String name;
    int size;
    public Hat(String name, int size){
        this.name=name;
        this.size=size;
    }
}
