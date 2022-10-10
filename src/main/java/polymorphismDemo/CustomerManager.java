package polymorphismDemo;

public class CustomerManager {
    private final BaseLogger baseLogger;
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger = baseLogger;
    }
    public void Add(){
        System.out.println("Customer is added");
        baseLogger.log("Customer is added");
    }
}
