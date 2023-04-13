import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class dataBaseFunction {
        private static final String SSH_USER = "root";
        private static final String SSH_PASSWORD = "Minhtuan";
        private static final String SSH_HOST = "trainingfresher.ddns.net";
        private static final int SSH_PORT = 22;
        private static final String DB_USER = "tuanlm2";
        private static final String DB_PASSWORD = "Gmo@2021~!@#";
        private static final String DB_NAME = "testdb";
        private static final int DB_PORT = 3306;
        private static final String DB_HOST = "localhost";
        private static final int LOCAL_PORT = 4321;

        public static void sshConnect()throws Exception{
            // Tạo SSH tunnel
            JSch jsch = new JSch();
            Session session = jsch.getSession(SSH_USER, SSH_HOST, SSH_PORT);
            session.setPassword(SSH_PASSWORD);
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();
            session.setPortForwardingL(LOCAL_PORT, DB_HOST, DB_PORT);
            System.out.println("Establishing Connection...");

            if (session.isConnected()) {
                System.out.println("SSH connection established.");
            }


            //DB:
            try{

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:" + LOCAL_PORT + "/" + DB_NAME, DB_USER, DB_PASSWORD);

                if (connection != null) {
                    System.out.println("Connected to the database!");
                }else{
                    System.out.println("Failed to connect to the database!");
                }

                Statement st = connection.createStatement();
                //String sql = "SELECT * FROM categories";
                ResultSet rs = st.executeQuery("SELECT * FROM categories");
                //System.out.println(rs);
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3));
                }

            }catch(Exception ex){
                ex.printStackTrace();
            }

        }

        public static void dbConnect()throws Exception{
            // Kết nối tới cơ sở dữ liệu
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:" + LOCAL_PORT + "/" + DB_NAME, DB_USER, DB_PASSWORD);


        }

        public static void runSql(String sql){
            try{

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:" + LOCAL_PORT + "/" + DB_NAME, DB_USER, DB_PASSWORD);

                if (connection != null) {
                    System.out.println("Connected to the database!");
                }else{
                    System.out.println("Failed to connect to the database!");
                }

                Statement st = connection.createStatement();
                //String sql = "SELECT * FROM categories";
                ResultSet rs = st.executeQuery(sql);
                //System.out.println(rs);
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3));
                }

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }


}
