package study;

import java.util.Scanner;

public class cauLenhDieuKien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap diem mon:...");
        int diem=sc.nextInt();
        if(diem<5){
            System.out.println(" Ngu");
        } else if (diem <8) {
            System.out.println("Ngu vua");
        } else if (diem<=10) {
            System.out.println("ngu it");
        }
    }
}
