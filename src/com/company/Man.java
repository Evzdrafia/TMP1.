package com.company;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Man {

    private int age;
    private String name;

    public Man() {
    }

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @XmlAttribute
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
