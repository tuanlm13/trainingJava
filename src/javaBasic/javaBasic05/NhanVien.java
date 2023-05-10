package javaBasic.javaBasic05;

import java.util.ArrayList;
import java.util.Collection;

import static javax.swing.text.html.HTML.Attribute.N;

public class NhanVien {
    public static Collection<String> staffInfor=new ArrayList<>();

    public static void main(String[] args) {
        NhanVien.nameNV("Tuan");
        NhanVien.addressNV("Nghe An");
        NhanVien.majorNV("Developer");

        //print staff information:
        staffInfor.forEach(System.out::println);
    }
    public static void nameNV(String name){
        staffInfor.add(name);
    }

    public static void addressNV(String address){
        staffInfor.add(address);
    }

    public static void majorNV(String major){
        staffInfor.add(major);
    }
}
