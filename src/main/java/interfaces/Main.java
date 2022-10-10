package interfaces;


public class Main {
    public static void main(String[] args) {
        ICostumerDal iCostumerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(iCostumerDal);
        customerManager.add();

    }
}
