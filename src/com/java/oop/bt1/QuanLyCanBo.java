package com.java.oop.bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyCanBo {
    private List<CanBo> canBos;

    public QuanLyCanBo(){
        this.canBos=new ArrayList<>();
    }

    public void themCanBo(CanBo cb){
        this.canBos.add(cb);
    }

    public List<CanBo> timCanBoTheoTen(String ten){
        return this.canBos.stream().filter(c->c.getHoTen().contains(ten)).collect(Collectors.toList());
    }

    public void xuatThongTinCanBo(){
        this.canBos.stream().forEach(s->System.out.println(s));
    }
}
