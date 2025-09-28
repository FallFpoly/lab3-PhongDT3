/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {
public static String xeploai(double diem) {
        if(diem>=9) {
            return "Xuat sac";
        } else if(diem>=7.5) {
            return "Gioi";
        } else if(diem>=6.5) {
            return "Kha";
        } else if(diem>=5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hoten[];
        double diem[];
        int n;
        System.out.print("Nhap so luong sinh vien: ");
        n=sc.nextInt();
        sc.nextLine();
        hoten=new String[n];
        diem=new double[n];
        for(int i=0;i<n;i++) {
            System.out.println("Nhap thong tin sv thu "+(i+1)+": ");
            System.out.print("Nhap ten: ");
            hoten[i]=sc.nextLine();
            System.out.print("Nhap diem: ");
            diem[i]=sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("");
        System.out.println("+---------------------+");
        System.out.println("| DANH SACH SINH VIEN |");
        System.out.println("+---------------------+");
        for(int i=0;i<n;i++) {
            System.out.println("Sinh vien thu "+(i+1)+":");
            System.out.println("Ho ten: "+hoten[i]);
            System.out.println("Diem: "+diem[i]);
            System.out.println("Xep loai: "+xeploai(diem[i]));
            System.out.println("-----------------------");
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(diem[i]>diem[j]) {
                    double x=diem[i];
                    diem[i]=diem[j];
                    diem[j]=x;
                    String y=hoten[i];
                    hoten[i]=hoten[j];
                    hoten[j]=y;
                }
            }
        }
        System.out.println("");
        System.out.println("+----------------------------------------------+");
        System.out.println("| DANH SACH SINH VIEN SAU KHI SAP XEP TANG DAN |");
        System.out.println("+----------------------------------------------+");
        for(int i=0;i<n;i++) {
            System.out.println("Sinh vien thu "+(i+1)+":");
            System.out.println("Ho ten: "+hoten[i]);
            System.out.println("Diem: "+diem[i]);
            System.out.println("Xep loai: "+xeploai(diem[i]));
            System.out.println("-----------------------");
        }
    }
}
