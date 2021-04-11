package com.company;

public class Manager {
    public static  Nhanvien [] listMember;
    public Manager(Nhanvien [] listMember){
        this.listMember = listMember;
    }
    public void displayMember(){
        for (int i = 0 ; i < listMember.length ; i++) {
            if(listMember[i] instanceof NhanVienFullTime){
                NhanVienFullTime downCasting = (NhanVienFullTime) listMember[i];
                System.out.println("Information of member full time : \n" + "code member: " + downCasting.getCodemember() + downCasting.getCodemember() + "\n name: " + downCasting.getName() + "\n age: " + downCasting.getAge() + "\n phone: " + downCasting.getPhone() + "\n email: " + downCasting.getEmail() + "\n bonus: " + downCasting.getBonus() + "\n salary: " + downCasting.getSalary() + "\n forfeit: " + downCasting.getForfeit());
            }
        }
        for (int j = 0 ; j < listMember.length ; j++) {
            if(listMember[j] instanceof NhanVienPartTime){
                NhanVienPartTime downCasting = (NhanVienPartTime) listMember[j];
                System.out.println("Information of member part time : \n" + "code member: " + downCasting.getCodemember() + "\n name: " + downCasting.getName() + "\n age: " + downCasting.getAge() + "\n phone: " + downCasting.getPhone() + "\n email: " + downCasting.getEmail() + "\n time Work: " + downCasting.getTimeWork() + "hours");
            }
        }
    }
    public void thisSalaryFullTime(){
        double Salary = 0;
        for (Nhanvien a: listMember
             ) {
            if(a instanceof NhanVienFullTime){
                Salary = ((NhanVienFullTime) a).getSalary() + ((NhanVienFullTime) a).getBonus() - ((NhanVienFullTime) a).getForfeit();
                System.out.println(" Salary of " + a.getName() + " in Member Full Time = " + Salary);
            }
        }
    }
    public void thisSalaryPartTime(){
        double Salary = 0;
        for (Nhanvien a: listMember
             ) {
            if(a instanceof NhanVienPartTime){
                Salary = ((NhanVienPartTime) a).getTimeWork() * 100000;
                System.out.println("Salary of " + a.getName() + " in Member Part Time = " + Salary );
            }
        }
    }
    public void totalSlaryPartTime(){
        double total = 0;
        for (int i = 0 ; i < listMember.length ; i++) {
            if(listMember[i] instanceof  NhanVienPartTime){
                total += ((NhanVienPartTime) listMember[i]).getTimeWork() *100000;
            }
        }
        System.out.println("Total Salary of Member Part Time = " + total);
    }
//    public double tbMemberLowSalary(){
//        double count = 0;
//        double tb = 0 ;
//        for (int i = 0 ; i < listMember.length ; i++) {
//            if( listMember[i] instanceof NhanVienFullTime){
//                count++;
//
//            }
//        }
//        tb = totalSlaryFullTime()/count;
//        return tb;
//    }
//    public void displayMemberLowSalary(){
//        for (int i = 0 ; i < listMember.length ; i++) {
//            if (listMember[i] instanceof NhanVienFullTime){
//                {listMember[i].
//            }
//        }
//    }
}
