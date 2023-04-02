import java.util.HashMap;

public class train_hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> has=new HashMap<>();
        has.put("charge",1000);
        has.put("charge1",1001);
        has.put("charge2",1002);

        System.out.println(has);

        has.get(1);
        System.out.println(has.size());

        HashMap<String,String,Integer> has_1=new HashMap<>();




    }
}
