package week3.day2;

public class Connection extends MySqlConnection implements DatabseConnection {
    @Override
    public void executeQuery() {
        System.out.println("Connection Executed");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Connection Updated");
    }
    public static void main(String[] args) {
        Connection j= new Connection();
        j.connect();
        j.executeQuery();
        j.executeUpdate();
        j.disconnect();
    }
}
