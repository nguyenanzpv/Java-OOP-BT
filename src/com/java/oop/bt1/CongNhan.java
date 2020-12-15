package com.java.oop.bt1;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String hoTen, String gioiTinh, int tuoi, String diaChi, int bac){
        super(hoTen,gioiTinh,tuoi,diaChi);
        this.bac=bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    protected void nhapThongTinRieng() {
        System.out.print("Nhap bac can bo:");
        Scanner sc = new Scanner(System.in);
        this.bac  = Integer.valueOf(sc.nextLine());
    }

    @Override
    protected void xuatThongTinRieng() {
        System.out.print(this.bac);
    }

    @Override
    protected String layThongTinRieng() {
        return String.valueOf(this.bac);
    }
}
