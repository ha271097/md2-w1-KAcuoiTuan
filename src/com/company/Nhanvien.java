package com.company;

public class Nhanvien {
    protected String codemember;
    protected String name;
    protected int age;
    protected String phone;
    protected String email;

    public Nhanvien(String codemember, String name, int age, String phone, String email) {
        this.codemember = codemember;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Nhanvien() {
    }

    public String getCodemember() {
        return codemember;
    }

    public void setCodemember(String codemember) {
        this.codemember = codemember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
