package javaBasic.javaBasic02;

public class Caculator {
    // function sum int:

    public static void sumInt(int a,int b){
        int sum=a+b;
        System.out.println("Sum a+b= "+ sum);
    }

    //function multiplicationFloat Float:
    public static void multiplicationFloat(double a, double b){
        double mul=a*b;
        System.out.println("multiplication float a*b="+mul);
    }

    public String test(String abcd){
        return abcd;
    }

    public static void main(String[] args) {
        Caculator.sumInt(14,65);
        Caculator.multiplicationFloat(123.3,354.442);

        Caculator ct=new Caculator();
        System.out.println(ct.test("gffggfg"));

    }
}
