package polymorphismDemo;

public class EmailLogger extends  BaseLogger {
    @Override
    public void log(String message) {
        //super.Log(message);
        System.out.println("Logged to Email " + message);
    }
}
