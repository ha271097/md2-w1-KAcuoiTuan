package com.company;

public class NhanVienPartTime extends Nhanvien {
    protected double timeWork;

    public NhanVienPartTime(String codemember, String name, int age, String phone, String email, double timeWork) {
        super(codemember, name, age, phone, email);
        this.timeWork = timeWork;
    }

    public NhanVienPartTime() {
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }
}
