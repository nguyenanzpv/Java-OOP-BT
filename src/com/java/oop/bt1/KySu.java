package com.java.oop.bt1;

import java.util.Scanner;

public class KySu extends CanBo{

    private String nganhDaoTao;

    public KySu(String hoTen, String gioiTinh, int tuoi, String diaChi, String nganhDaoTao){
        super(hoTen,gioiTinh,tuoi,diaChi);
        this.nganhDaoTao=nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    protected void nhapThongTinRieng() {
        System.out.print("Nhap nganh dao tao:");
        Scanner sc = new Scanner(System.in);
        this.nganhDaoTao = sc.nextLine();
    }

    @Override
    protected void xuatThongTinRieng() {
        System.out.print(this.nganhDaoTao);
    }

    @Override
    protected String layThongTinRieng() {
        return this.nganhDaoTao;
    }
}
