package com.company;

public class NhanVienFullTime extends Nhanvien {
    protected double bonus;
    protected double salary;
    protected double forfeit;

    public NhanVienFullTime(String codemember, String name, int age, String phone, String email, double bonus, double salary, double forfeit) {
        super(codemember, name, age, phone, email);
        this.bonus = bonus;
        this.salary = salary;
        this.forfeit = forfeit;
    }

    public NhanVienFullTime() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getForfeit() {
        return forfeit;
    }

    public void setForfeit(double forfeit) {
        this.forfeit = forfeit;
    }
}
