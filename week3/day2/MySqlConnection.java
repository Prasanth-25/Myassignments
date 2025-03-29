package week3.day2;

public abstract class MySqlConnection implements DatabseConnection{
    public abstract void executeQuery();
    public void disconnect(){
        System.out.println("Connection Closed");
    }
    public void connect(){
        System.out.println("Connection Opened");
    }
}
