public class TestDatabaseConnection {

    public static void main(String[] args) {
        boolean connx = DatabaseConnection.connxToJAVA_FS();
        if (connx) {
            System.out.println("Connection Successful");
        } else {
            System.out.println("Connection Failed");
        }
    }
}
