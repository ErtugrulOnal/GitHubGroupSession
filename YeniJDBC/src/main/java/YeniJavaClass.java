import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class YeniJavaClass {
          public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Kaiser2019");
            Statement st = con.createStatement();
            System.out.println("Connection Success");
        }
    }

