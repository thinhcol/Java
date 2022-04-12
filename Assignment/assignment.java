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
public class assignment {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        dulieu tb = new dulieu();
        System.out.print("\nMenu bài tập\n");
        System.out.print("------------------------------------------------------------------");
        System.out.print("\n+\t1.Nhập danh sách nhân viên từ bàn phím                   +");
        System.out.print("\n+\t2.Xuất danh sách nhân viên ra màn hình.                  +");
        System.out.print("\n+\t3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.    +");
        System.out.print("\n+\t4.Xóa nhân viên theo mã nhập từ bàn phím.                +");
        System.out.print("\n+\t5.Cập nhật thông tin nhân viên theo mã nhập từ bàn phím  +");
        System.out.print("\n+\t6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím   +");
        System.out.print("\n+\t7.Sắp xếp nhân viên theo họ và tên                       +");
        System.out.print("\n+\t8.Sắp xếp nhân viên theo thu nhập                        +");
        System.out.print("\n+\t9.Xuất 5 nhân viên có thu nhập cao nhất.                 +");
        System.out.print("\n+\t10.Thoát khỏi chương trình                               +");
        System.out.print("\n------------------------------------------------------------------");
        System.out.print("\nMời bạn chọn bài tập: ");
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.print("Nhập nhân viên\n");
                tb.nhapnv() ;
                menu();
                break;
            }
            case 2: {
                System.out.print("Xuất nhân viên\n");
                tb.xuatnv();
                menu();
                break;
            }
            case 3: {
                System.out.print("Tìm nhân viên\n");
                tb.timnv();
                menu();
                break;
            }
            case 4: {
                System.out.print("Xóa nhân viên\n");
                tb.xoanv();
                menu();
                break;
            }
            case 5: {
                System.out.print("Cập nhật thông tin nhân viên\n");
                tb.update();
                menu();
                break;
            }
            case 6: {
                System.out.print("Tìm danh sách nhân viên qua số lương\n");
                tb.dsnv();
                menu();
                break;
            }
            case 7: {
                System.out.print("Sắp xếp nhân viên theo họ tên\n");
                tb.sapxepten();
                tb.xuatnv();
                menu();
                break;
            }
            case 8: {
                System.out.print("Sắp xếp nhân viên theo lương\n");
                tb.sapxepluong();
                tb.xuatnv();
                menu();
                break;
            }
            case 9: {
                System.out.print("Xuất 5 nhân viên có thu nhập cao nhất");
                tb.xuat5nv();
                menu();
                break;
            }
            case 10: {
                System.out.print("Thoát khỏi chương trình");
                break;
            }
            default: {
                System.out.print("Mời bạn chọn chức năng từ 1-> 10");
                menu();
                break;
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
