package polymorphismDemo;

public class Main {
    public static void main(String[] args) {
    EmailLogger emailLogger = new EmailLogger();
    DatabaseLogger databaseLogger = new DatabaseLogger();
    FileLogger fileLogger = new FileLogger();
    ConsoleLogger consoleLogger =new ConsoleLogger();
    BaseLogger [] baseLoggers = new BaseLogger[]{fileLogger,emailLogger,databaseLogger,consoleLogger};
//        for (BaseLogger logger:baseLoggers) {
//            logger.Log("Message");
//        }
        CustomerManager customerManager = new CustomerManager(consoleLogger);
        customerManager.Add();

    }
}
