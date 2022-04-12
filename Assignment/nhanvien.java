/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class nhanvien {

    public String manv;
    public String Hoten;
    public String chucvu;
    public double luong;

    public nhanvien(String manv, String Hoten, String chucvu, double luong) {
        this.manv = manv;
        this.Hoten = Hoten;
        this.luong = luong;
        this.chucvu = "Hành chính";
    }

    /*public void nhap(){
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        while(ok){
            System.out.print("Nhập mã nhân viên: ");
            manv = sc.nextLine();
            System.out.print("Nhập họ và tên  của nhân viên: ");
            Hoten = sc.nextLine();
            System.out.print("Nhập lương của nhân viên: ");
            luong = sc.nextDouble();
            sc.nextLine();
            System.out.print("Bạn có muốn nhập tiếp không(Y/N): ");
            String n = sc.nextLine();
            switch (n) {
                case "Y": {
                    ok = true;
                    break;
                }
                case "y": {
                    ok = true;
                    break;
                }
                case "n": {
                    ok = false;
                    break;
                }
                case "N": {
                    ok = false;
                    break;
                }
            }
        }
    }*/
    public void xuat1() {

        System.out.printf("%12s|%-30s|%-20.2f|\n", manv, Hoten, luong);

    }

    public nhanvien() {
        this.Hoten = null;
        this.manv = null;
        this.luong = 0;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã số nhân viên : ");
        this.manv = sc.nextLine();
        System.out.print("Họ và tên : ");
        this.Hoten = sc.nextLine();
        System.out.print("Lương : ");
        this.luong = sc.nextDouble();
    }

    public double getThue() {
        if (luong >= 9000000 && luong <= 15000000) {
            return luong * 0.1;
        } else if (luong > 15000000) {
            return luong * 0.12;
        } else {
            return luong * 0;
        }
    }

    public double getThunhap() {
        return luong - this.getThue();
    }

    public void xuatTT() {
        System.out.printf("%15s|%12s|%20s|%20.2f|%5.2f|%17.1f|%15.1f|%15.2f|%15.2f|\n", "Hành Chính", this.manv, this.Hoten, this.luong, this.getThue(), 0F, 0F, 0F, this.getThunhap());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.printf("Lương trách nhiệm của nhân viên: %f ",luongtrachnhiem);

    }

}
