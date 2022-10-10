package polymorphismDemo;

public class ConsoleLogger extends  BaseLogger{
    @Override
    public void log(String message) {
        //super.Log(message);
        System.out.println("Logged to Console " + message);
    }
}
