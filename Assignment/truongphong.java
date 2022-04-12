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
public class truongphong extends nhanvien{
    double luongtrachnhiem;

    public truongphong(String manv, String Hoten, String chucvu, double luong, double luongtrachnhiem) {
        super(manv,Hoten,"Trưởng Phòng",luong);
        this.luongtrachnhiem = luongtrachnhiem;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
    System.out.print("Nhập lương trách nhiệm: ");
        this.luongtrachnhiem = sc.nextDouble();
    }
    public double getLuongtrachnhiem() {
        return luongtrachnhiem;
    }

    public void setLuongtrachnhiem(double luongtrachnhiem) {
        this.luongtrachnhiem = luongtrachnhiem;
    }

    public truongphong() {
    }
    @Override
    public double getThunhap(){
        return luong - this.getThue() + this.getLuongtrachnhiem();
    }
    
    @Override
    public void xuatTT(){
        System.out.printf("%15s|%12s|%20s|%20.2f|%5.2f|%17.1f|%15.1f|%15.2f|%15.2f|\n","Trưởng Phòng",this.manv,this.Hoten,this.luong,this.getThue(),this.getLuongtrachnhiem(),0F,0F,this.getThunhap());
//        System.out.printf("Lương trách nhiệm của nhân viên: %f ",luongtrachnhiem);
         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    
}
