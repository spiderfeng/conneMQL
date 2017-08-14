import java.sql.*;

/**
 * Created by fqlive on 2017/8/12.
 */
public class Select {
    public static void main(String[] args) {
      new DISU().driver();
        try (Connection c = DriverManager
                .getConnection("jdbc:mysql://106.14.153.129:3306/lesson1?characterEncoding=UTF-8", "root", "123456");
             Statement s = c.createStatement();) {
            String sql = "select username  from user where username like 'teemo%';";
            ResultSet rs = s.executeQuery(sql);
            System.out.println("查询结果如下:");
            while (rs.next()) {
                String name = rs.getString("username");// 也可以使用字段的顺序
                System.out.println(name);
            }
            System.out.println("查询操作执行成功 ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
