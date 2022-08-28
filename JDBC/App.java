
import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "1234";

        String query = "select sname from stu where roll_no=2";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();
        PreparedStatement per = con.prepareStatement(query);
        // per.setString(1, name);
        // per.executeQuery();
        // per.executeUpdate();

        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("sname");
        System.out.println(name);

        st.close();
        con.close();
    }
}
