public class runFunction {

    public static void main(String[] args) throws Exception {


        dataBaseFunction cn=new dataBaseFunction() ;
        cn.sshConnect();

        cn.runSql("SELECT * FROM categories");
        cn.closedConnect();

    }

}
