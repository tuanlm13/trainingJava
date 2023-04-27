package javaBasic.javaBasic03;

public class Conditions {

    public static void pracices(int age){
        if (age<=20){
            System.out.println("very young");
        }else if(age<=30){
            System.out.println("normal young");
        }else if(age<=60){
            System.out.println("normal old");
        }else if(age<=100){
            System.out.println("very old");
        }else if(age>100){
            System.out.println("you are sky's man");
        }
    }


    public static void main(String[] args) {
        Conditions con=new Conditions();
        con.pracices(100);
    }
}
