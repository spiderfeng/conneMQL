import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by fqlive on 2017/8/12.
 */
public class Delete {
    public static void main(String[] args) {
        new DISU().driver();
        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://106.14.153.129:3306/lesson1?characterEncoding=UTF-8", "root", "123456");
                Statement s = c.createStatement();
        )
        {
            String sql = "delete from user where id =201404 ";
            s.execute(sql);
            System.out.println("删除操作执行成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
