/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[];
        int n,min;
        System.out.print("Nhap so luong phan tu: ");
        n=sc.nextInt();
        a=new int [n];
        for(int i=0;i<n;i++) {
            System.out.print("Nhap pt thu "+i+": ");
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep: "+Arrays.toString(a));
        min=a[0];
        System.out.println("pt nho nhat la: "+min);
        int tong=0;
        int dem=0;
        double TB;
        for(int i=0;i<n;i++) {
            if(a[i]%3==0) {
                tong+=a[i];
                dem++;
            }
        }
        if(dem>0) {
            TB=tong/dem;
            System.out.println("Trung binh cac pt chia het cho 3 la: "+TB);
        } else {
            System.out.println("Khong co pt nao chia het cho 3");
        }
    }
}
