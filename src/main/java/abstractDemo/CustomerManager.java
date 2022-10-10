package abstractDemo;

public class CustomerManager {
    private final BaseDatabaseManager baseDatabaseManager;
    public CustomerManager(BaseDatabaseManager baseDatabaseManager){
        this.baseDatabaseManager = baseDatabaseManager;
    }
    public void getCustomers(){
        baseDatabaseManager.getData();
    }
}
