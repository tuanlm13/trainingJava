public class try_catch {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try{
            int c=a/b;
            System.out.println(" ket qua = "+c);
        } catch(Exception ex) {
            System.out.println("co loi roi dcmm");
            ex.printStackTrace();
        } finally {
            System.out.println("end============");
        }
    }
}
