package baiTap;

import java.time.Year;


//- Class SinhVien: khai báo 3 loại biến (local, instance, static)
// gọi lại in ra ở 3 hàm trong class sau đó gọi nó ở hàm main

public class SinhVien {


    public String name;
    public int age;
    public static String majors;

    public static void nameValue(String name){
        System.out.println("student name: "+ name);
    }

    public int ageValue(int year){
        int ageValues= Year.now().getValue()-year;
        return ageValues;
    }

    public static String studentMajors(String student,String majors){
        SinhVien.majors=majors;
        System.out.println("student majors: "+ majors);
        return majors;
    }

    public static void main(String[] args) {
        SinhVien sv=new SinhVien();

        //print name
        sv.nameValue("Trang");

        //print age:
        sv.ageValue (1995);
        System.out.println("Age: "+sv.ageValue (1995));

        //print majors:
        SinhVien.studentMajors("Nam","Tester");

        //get information from the thongTin:

        System.out.println("Address: "+ThongTin.address);
        System.out.println("have girl friend: "+ThongTin.hasGirlFriend);
        System.out.println("number of laptop: "+ThongTin.address);


    }
}
