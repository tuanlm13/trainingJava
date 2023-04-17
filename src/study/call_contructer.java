package study;

public class call_contructer {
    call_contructer(){

    }
    public static int tinhTong(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void max(int a, int b, int c){
        int Max=a;
        if(Max<b){
            Max=b;
        }
        if(Max<c){
            Max=c;
        }
        System.out.println("MAX="+Max);
    }
}
