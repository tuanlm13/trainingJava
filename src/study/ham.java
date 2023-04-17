package study;

public class ham {
    public static void main(String[] args) {
        int ketqua=tong(1,4);
        System.out.println("tong_1 = "+ ketqua);
        //gọi hàm không return void:
        no_return("no content");
    }
/*
* hàm không trả về thì không gán biến được, chỉ gọi hàm rồi truyền tham số để xử lý hàm
* hàm có trả về có thể gán được với 1 biến
*
* */

    // hàm có trả về data: thì cần return giá trị cần trả về:
    public static int tong(int a, int b){
        return a+b;
    }
    //hàm không trả về:
    public static void no_return(String a){
        System.out.println(" study.ham khong tra ve gi cả====="+a);
    }
}
