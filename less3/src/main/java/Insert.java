import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by fqlive on 2017/8/12.
 */
public class Insert {
    public static void main(String[] args) {
       new  DISU().driver();
        try (
                java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://106.14.153.129:3306/lesson1?characterEncoding=UTF-8", "root", "123456");
                Statement s = c.createStatement();
        )
        {
           String sql = "insert into user(id,username,password)"+"values(201407,'garden3','222')";
            boolean execute = s.execute(sql);
            System.out.println("插入成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
