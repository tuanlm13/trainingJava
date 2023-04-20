package javaBasic;

import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static void main(String[] args) {
        Loop loop = new Loop();
        loop.forLoop(50);

    }

    public static void forLoop(int end) {

        List<Integer> loopArray = new ArrayList<Integer>();

        for (int i = 1; i <= end; i++) {
            //System.out.println(i);
            loopArray.add(i);
        }
        //print array:
        loopArray.forEach(System.out::println);

        //cach khac de in tung phan tu trong list ra man hinh:

//        for (int inter : loopArray) {
//            System.out.println(inter);
//        }

    }

}
