package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size All Member");
//        int size = sc.nextInt();
//        System.out.println(" Enter CategoryMember : ");
//        System.out.println(" Number 1: Full Time ");
//        System.out.println(" Number 2: Part Time ");
//        int num = sc.nextInt();
        Nhanvien listMember [] = new Nhanvien[10];
//        switch (num){
//            case 1:
//                for (int i = 0 ; i < listMember.length ; i++) {
//                    System.out.println("Enter Information of Member" + (i +1));
//                    listMember[i] = new NhanVienFullTime(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine(),sc.nextLine(),sc.nextDouble(), sc.nextDouble(),sc.nextDouble());
//                }
//                break;
//            case 2:
//
//        }

        listMember[0] = new NhanVienFullTime("m1", "member1", 24 ,"0918898980", "member1@gmail.com", 500000,10000000, 100000  );
        listMember[1] = new NhanVienFullTime("m2", "member2", 22 ,"0918898981", "member2@gmail.com", 1000000,10000000, 100000  );
        listMember[2] = new NhanVienFullTime("m3", "member3", 23 ,"0918898982", "member3@gmail.com", 500000,10000000, 0  );
        listMember[3] = new NhanVienFullTime("m4", "member4", 25 ,"0918898983", "member4@gmail.com", 1000000,10000000, 0  );
        listMember[4] = new NhanVienFullTime("m5", "member5", 24 ,"0918898984", "member5@gmail.com", 500000,10000000, 500000  );
        listMember[5] = new NhanVienPartTime("m6", "member6", 19, "0988775755", "member6@gmail.com", 4);
        listMember[6] = new NhanVienPartTime("m6", "member6", 20, "0988775755", "member6@gmail.com", 8);
        listMember[7] = new NhanVienPartTime("m6", "member6", 20, "0988775755", "member6@gmail.com", 4);
        listMember[8] = new NhanVienPartTime("m6", "member6", 18, "0988775755", "member6@gmail.com", 4);
        listMember[9] = new NhanVienPartTime("m6", "member6", 21, "0988775755", "member6@gmail.com", 4);
        Manager haanh = new Manager(listMember);
        haanh.displayMember();
        haanh.thisSalaryFullTime();
        haanh.thisSalaryPartTime();
        haanh.totalSlaryPartTime();
    }
}
