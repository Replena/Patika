public class App {
    public static void main(String[] args) {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/customermanage", "root", "1234"
        )


    }
}