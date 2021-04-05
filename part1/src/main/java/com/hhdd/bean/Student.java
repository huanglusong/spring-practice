package com.hhdd.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author HuangLusong
 * @Date 2021/4/5 14:19
 */
@Component
public class Student {
    //属性注入方式
    @Autowired
    private Book book;

    private Dog dog;

    private Money money;
    //构造器注入
    @Autowired
    public Student(Money money){
        this.money = money;
    }
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Dog getDog() {
        return dog;
    }
    //setter注入
    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "book=" + book +
                ", dog=" + dog +
                ", money=" + money +
                '}';
    }
}
