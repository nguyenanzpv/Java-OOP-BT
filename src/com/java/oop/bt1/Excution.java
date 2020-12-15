package com.java.oop.bt1;

import java.util.Scanner;

public class Excution {
    //psvm ->tab
    //sout -> tab
    public static void main(String[] args) {
        QuanLyCanBo qlcb=new QuanLyCanBo();

        CanBo cn=new CongNhan("cong nhan","nu",10,"abc",3);
        CanBo nv=new NhanVien("nhan vien", "nam",15,"def","nv");
        CanBo ks=new KySu("kysu","nu",20,"ghi","cntt");

        qlcb.themCanBo(cn);
        qlcb.themCanBo(nv);
        qlcb.themCanBo(ks);

        qlcb.xuatThongTinCanBo();

        qlcb.timCanBoTheoTen("kysu").forEach(cb->{
            System.out.println(cb.toString());
        });

    }

}
