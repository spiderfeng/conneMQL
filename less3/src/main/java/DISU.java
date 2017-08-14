import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by fqlive on 2017/8/14.
 */
public class DISU {
    public void driver(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
