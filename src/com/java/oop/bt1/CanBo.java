package com.java.oop.bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class CanBo {

    //interface extends interface

    private String hoTen;
    private String gioiTinh;
    private int tuoi;
    private String diaChi;

    public CanBo(String hoTen, String gioiTinh,int tuoi,String diaChi){
        this.hoTen=hoTen;
        this.gioiTinh=gioiTinh;
        this.tuoi=tuoi;
        this.diaChi=diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    protected abstract void nhapThongTinRieng();

    protected abstract void xuatThongTinRieng();

    protected abstract String layThongTinRieng();

    protected void nhapThongTinCanBo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        this.hoTen = sc.nextLine();

        System.out.println("Nhap gioi tinh (Nam/Nu/Khac):");
        this.gioiTinh = sc.nextLine().toUpperCase();

        System.out.println("Nhap dia chi:");
        this.diaChi = sc.nextLine();

        System.out.println("Nhap tuoi:");
        this.tuoi = Integer.valueOf(sc.nextLine());

        nhapThongTinRieng();
    }

    protected void xuatThongTinCanBo(){
        System.out.print("\nCan bo: " + this.hoTen + " - " + this.gioiTinh + " - " + this.tuoi + " - " + this.diaChi);
        xuatThongTinRieng();
    }


    @Override
    public String toString() {
        return "\nCan bo: " + this.hoTen + " - " + this.gioiTinh + " - " + this.tuoi + " - " + this.diaChi + " - " + layThongTinRieng();
    }

}
