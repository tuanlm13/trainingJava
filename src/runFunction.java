public class runFunction {

    public static void main(String[] args) throws Exception {


        dataBaseFunction cn=new dataBaseFunction() ;
        cn.sshConnect();

        // connect DB
        //cn.dbConnect();
        //cn.runSql("SELECT * FROM categories");


    }

}
