package com.java.oop.bt1;

import java.util.Scanner;

public class NhanVien extends CanBo{

    private String congViec;

    public NhanVien(String hoTen, String gioiTinh, int tuoi, String diaChi, String congViec){
        super(hoTen,gioiTinh,tuoi,diaChi);
        this.congViec=congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    protected void nhapThongTinRieng() {
        System.out.print("Nhap ho ten:");
        Scanner sc = new Scanner(System.in);
        this.congViec = sc.nextLine();
    }

    @Override
    protected void xuatThongTinRieng() {
        System.out.print(this.congViec);
    }

    @Override
    protected String layThongTinRieng() {
        return this.congViec;
    }
}
