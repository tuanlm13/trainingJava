package study;

public class continue_ {
    public static void main(String[] args) {
        int tong=0;
        for (int i=0;i<=100;i++){
            if(i==3)
                continue;
            else if (tong>50) {
                break;
            } else
                tong+=i;
            System.out.println("i = "+i);
        }
        System.out.println("tong = "+tong);
    }
}
