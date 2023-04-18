package study;

import java.util.*;

public class list_col {
    public static void main(String[] args) {
        ArrayList<Integer> lst_1=new ArrayList<>();
        System.out.println(lst_1);
        lst_1.add(10);
        lst_1.add(11);
        lst_1.add(12);
        lst_1.add(13);
        lst_1.add(14);
        lst_1.add(2,5);
        System.out.println(lst_1);

        ArrayList<Integer> lst_2 = new ArrayList<>(List.of(1,4,5,3,2,1,34,54,23,4,54,3));
        System.out.println(lst_2);
        boolean vl=lst_2.contains(25);
        System.out.println("ton tai hay khong: "+vl);
        for(int a:lst_2){
            System.out.println(a);
        }



//        list
        Scanner sc=new Scanner(System.in);
        System.out.println(" so luong study.mang: ");
        int n=sc.nextInt();

        //random:

        Random rd=new Random();

        //khoi tao list:
        ArrayList<Integer> list=new ArrayList<>();
        for (int ab=0;ab<n;ab++){
            int ngaunhien=rd.nextInt(100);
            list.add(ngaunhien);

        }
        System.out.println(list);


    }
}
