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
public class tiepthi extends nhanvien{
    double doanhSo,hueHong;
   
    public tiepthi( String manv, String Hoten, String chucvu, double luong, double doanhSo, double hueHong ) {
        super(manv,Hoten,"Tiếp thị",luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public tiepthi() {
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.printf("Nhập doanh số: ");
        this.doanhSo = sc.nextDouble();
        System.out.printf("Nhập huê hồng: ");
        this.hueHong = sc.nextDouble();
    }
    
    

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    @Override
    public double getThunhap(){
        return luong - this.getThue() + this.getHueHong() + this.getDoanhSo();
    }    
    @Override
    public void xuatTT(){
        
        System.out.printf("%15s|%12s|%20s|%20.2f|%5.2f|%17.1f|%15.1f|%15.2f|%15.2f|\n","Tiếp thị",this.manv,this.Hoten,this.luong,this.getThue(),this.getHueHong(),this.getDoanhSo(),0F,this.getThunhap());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
