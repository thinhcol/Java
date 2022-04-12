/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class dulieu {

    static ArrayList<nhanvien> list = new ArrayList<>();

//    public static void nhap(int b) {
//        /*Scanner sc = new Scanner(System.in);
//        System.out.println("Mời bạn phân loại chức vụ nhân viên");
//        System.out.println("1.Chức vụ hành chính");
//        System.out.println("2.Chức vụ tiếp thị");
//        System.out.println("3.Chức vụ trưởng phòng");
//        int num = sc.nextInt();
//        switch (num) {
//            case 1: {
//                hanhchinh hc = new hanhchinh();
//                hc.nhap();
//                list.add(hc);
//            }
//            case 2: {
//                tiepthi tt = new tiepthi();
//                tt.nhap();
//                list.add(tt);
//
//            }
//            case 3: {
//                truongphong tp = new truongphong();
//                tp.nhap();
//                list.add(tp);
//
//            }
//        }*/
//        Scanner sc = new Scanner(System.in);
//        nhanvien nv = new nhanvien();
//        truongphong tp = new truongphong();
//        tiepthi tt = new tiepthi();
//
//        System.out.print("Nhập mã nhân viên: ");
//        String manv = sc.nextLine();
//        nv.setManv(manv);
//        System.out.print("Nhập họ và tên  của nhân viên: ");
//        String Hoten = sc.nextLine();
//        nv.setHoten(Hoten);
//        System.out.print("Nhập lương của nhân viên: ");
//        double luong = sc.nextDouble();
//        nv.setLuong(luong);
//        if (b == 2) {
//            System.out.printf("Nhập doanh số:");
//            double doanhSo = sc.nextDouble();
//            tt.setDoanhSo(doanhSo);
//            System.out.printf("Nhập huê hồng:");
//            double hueHong = sc.nextDouble();
//            tt.setHueHong(hueHong);
//            nv = new tiepthi(manv, Hoten, "Huê Hồng", luong, doanhSo, hueHong);
//            list.add(tt);
//        } else if (b == 3) {
//            System.out.print("Nhập lương trách nhiệm");
//            double luongtrachnhiem = sc.nextDouble();
//            tp.setLuongtrachnhiem(luongtrachnhiem);
//            nv = new truongphong(manv, Hoten, "Trưởng Phòng", luong, luongtrachnhiem);
//            list.add(tp);
//        }
//        list.add(nv);
//    }
    public void nhapnv() {

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("1.Hành chính");
            System.out.println("2.Tiếp thị");
            System.out.println("3.Trưởng Phòng");
            System.out.println("Mời bạn chọn chức vụ: ");
            int num = sc.nextInt();
            switch (num) {
                case 1: {
                    nhanvien nv = new nhanvien();
                    nv.nhap();
                    list.add(nv);
                    break;
                }
                case 2: {
                    tiepthi tt = new tiepthi();
                    tt.nhap();
                    list.add(tt);
                    break;
                }
                case 3: {
                    truongphong tp = new truongphong();
                    tp.nhap();
                    list.add(tp);
                    break;
                }
                default: {
                    System.out.print("Mời bạn nhập lại từ 1-3");
                }
            }
            System.out.print("Bạn có muốn tiếp tục không(Y/N): ");
            sc.nextLine();
            String op = sc.nextLine();
            if (!op.equalsIgnoreCase("Y")) {
                break;
            }

        } while (true);
    }


    public void xuatnv() {
        System.out.print("Danh sách nhân viên: \n");
        System.out.printf("%15s|%10s|%20s|%-20s|%-5s|%-15s|%-15s|%-15s|%-15s|\n", "Chức vụ", "Mã nhân viên", "Họ và tên", "Lương", "Thuế", "Lương trách nhiệm", "Huê Hồng", "Doanh số", "Thu nhập");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        for (nhanvien nv : list) {
            if (nv instanceof nhanvien) {
                ((nhanvien) nv).xuatTT();
            } else if (nv instanceof tiepthi) {
                ((tiepthi) nv).xuatTT();
            } else if (nv instanceof truongphong) {
                ((truongphong) nv).xuatTT();
            }

        }

    }

    public void timnv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên cần tìm: ");
        String ma = sc.nextLine();
        nhanvien tim = null;
        for (nhanvien nv : list) {
            if (nv.getManv().equalsIgnoreCase(ma)) { 
                tim = nv;

            }
        }
        if (tim != null) {
            System.out.print("Nhân viên bạn tìm kiếm: ");
            tim.xuatTT();
        } else {
            System.out.print("Nhân viên bạn tìm kiếm không có vui lòng nhập lại mã");
        }
    }

    public void xoanv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên muốn xóa: ");
        String ma = sc.nextLine();
        nhanvien xoa = null;
        for (nhanvien nv : list) {
            if (nv.getManv().equalsIgnoreCase(ma)) {
                xoa = nv;
                break;
            }
        }
        if (xoa != null) {
            list.remove(xoa);
            System.out.print("Danh sách nhân viên sau khi xóa: ");
            xuatnv();
        } else {
            System.out.print("Nhân viên bạn cần xóa không có vui lòng nhập lại mã");
        }
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên muốn cập nhật: ");
        String ma = sc.nextLine();
        nhanvien up = null;
        for (nhanvien nv : list) {
            up = nv;
            if (nv.getManv().equalsIgnoreCase(ma)) {
                if (nv instanceof nhanvien) {
                    ((nhanvien) nv).nhap();
                } else if (nv instanceof tiepthi) {
                    ((tiepthi) nv).nhap();
                } else if (nv instanceof truongphong) {
                    ((truongphong) nv).nhap();
                }
            }
            break;

        }
        if (up == null) {
            System.out.println("Mã nhân viên bạn cần tìm không có");
        }
    }

    public void dsnv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập khoảng lương nhỏ nhất: ");
        double min = sc.nextDouble();
        System.out.print("Mời bạn nhập khoảng lương lớn nhất: ");
        double max = sc.nextDouble();
        boolean ok = false;
        while (min > max) {
            System.out.print("Mời bạn nhập lại khoảng lương nhỏ nhất: ");
            min = sc.nextDouble();
            System.out.print("Mời bạn nhập lại khoảng lương lớn nhất: ");
            max = sc.nextDouble();
        }
        for (nhanvien nv : list) {
            if (min <= nv.getLuong() && nv.getLuong() <= max) {
                nv.xuatTT();
                ok = true;
            }
        }
        if (ok == false) {
            System.out.print("Khoảng lương bạn tìm kiếm không có trong danh sách");
        }
    }

    public void sapxepten() {
        Comparator<nhanvien> boong = new Comparator<nhanvien>() {
            @Override
            public int compare(nhanvien o1, nhanvien o2) {
                return o1.getHoten().compareTo(o2.getHoten());
            }
        };
        Collections.sort(list, boong);

    }

    public void sapxepluong() {
        Comparator<nhanvien> comp;
        comp = new Comparator<nhanvien>() {
            @Override
            public int compare(nhanvien o1, nhanvien o2) {
                return Double.compare(o1.getThunhap(), o2.getThunhap());
            }
        };
        Collections.sort(list, comp);
    }

    public void xuat5nv() {
        Comparator<nhanvien> com;
        com = new Comparator<nhanvien>() {
            @Override
            public int compare(nhanvien o1, nhanvien o2) {
                return Double.compare(o2.getThunhap(), o1.getThunhap());
            }
        };
        Collections.sort(list, com);
        int t = (list.size() < 5) ? list.size() : 5;
        System.out.printf("\n%15s|%10s|%20s|%-20s|%-5s|%-15s|%-15s|%-15s|%-15s|\n", "Chức vụ", "Mã nhân viên", "Họ và tên", "Lương", "Thuế", "Lương trách nhiệm", "Huê Hồng", "Doanh số", "Thu nhập");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        for (int b = 0; b < t; b++) {
            list.get(b).xuatTT();
            
        }
    }

}
