package polymorphismDemo;

public class FileLogger extends  BaseLogger{
    @Override
    public void log(String message) {
        //super.Log(message);
        System.out.println("Logged to File " + message);
    }
}
