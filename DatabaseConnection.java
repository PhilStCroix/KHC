import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url = "jdbc:postgresql://localhost:5432/KHC";
    private static final String user = "postgres";
    private static final String password = "Olivia2021";

    public static Connection getCon() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static boolean connxToJAVA_FS() {
        boolean connx = false;
        try (Connection con = getCon()) {
            if (con != null) {
                connx = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connx;
    }
}

