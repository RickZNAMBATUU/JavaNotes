import java.sql.*;

public class SQLiteTest {
    private static Connection c = null;
    private static Statement state = null;

    private static void connectDatabase() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
        }
    private static void createTable() throws SQLException {
        state = c.createStatement();
        state.executeUpdate("CREATE TABLE regDb(ID INT PRIMARY KEY NOT NULL, NAME TEXT NOT NULL, AGE INT NOT NULL, ADDRESS CHAR(50), SALARY REAL)");
        System.out.println("Table created");
        state.close();
        c.close();
    }
    private static void addUser(int userId, String userName, int userAge, String userAddress, float userSalary) throws SQLException {
        c.setAutoCommit(false);
        state = c.createStatement();
        state.executeUpdate("INSERT INTO user (ID, NAME, AGE, ADDRESS, SALARY) VALUES ( "
                + userId + ", '" + userName + "', " + userAge + ", '"
                + userAddress + "', " + userSalary + ")");
        state.close();
        c.commit();
        c.close();
    }
    private static void deleteUser(String sqlStatement) throws SQLException {
        c.setAutoCommit(false);
        state = c.createStatement();
        state.executeUpdate(sqlStatement);
        c.commit();
    }
    private static void updateUser(String sqlStatement) throws SQLException {
        c.setAutoCommit(false);
        state = c.createStatement();
        state.executeUpdate(sqlStatement);
        c.commit();
    }
    private static void displayUser() throws SQLException {
        state = c.createStatement();
        ResultSet rs = state.executeQuery("SELECT * FROM user");

        while(rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String address = rs.getString("address");
            float salary = rs.getFloat("salary");

            System.out.println("ID = " + id);
            System.out.println("NAME = " + name);
            System.out.println("AGE = " + age);
            System.out.println("ADDRESS = " + address);
            System.out.println("SALARY = " + salary);
            System.out.println();
        }
        rs.close();
        state.close();
        c.close();
    }
    private static void callingAllMethods() throws SQLException {
        createTable();
        addUser(7, "angela", 17, "Mindoro", 12131.0f);
        updateUser("UPDATE user set SALARY = 50000.0 WHERE ID=3");
        deleteUser("DELETE from user where ID = 3");
    }
    public static void main(String[] args) throws SQLException {
        connectDatabase();
//        addUser(6, "gago", 18, "PASIG", 6000.0f);
        displayUser();
    }
}