package javaBasic.javaBasic03;

public class Conditions {
    public static int age;
    public static String name;
    public static boolean gender;

    public static void pracices(int age){

        if (age<=20){
            System.out.println("very young");
        }else if(age<=30){
            System.out.println("normal young");
        }else if(age<=60){
            System.out.println("normal old");
        }else if(age<=100){
            System.out.println("very old");
        }else if(age<150){
            System.out.println("you are sky's man");
        }else if(age>=150 && age<152){
            System.out.println("you are sky's man x2");
        }else if(age==153 || age ==154){
            System.out.println("you are sky's man x3");
        }

    }


    public static void main(String[] args) {
        Conditions con=new Conditions();
        con.pracices(149);
    }
}
