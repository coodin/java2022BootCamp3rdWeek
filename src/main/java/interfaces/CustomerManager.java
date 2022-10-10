package interfaces;

public class CustomerManager {
    private final ICostumerDal iCostumerDal ;
    public CustomerManager(ICostumerDal iCostumerDal){
        this.iCostumerDal = iCostumerDal;
    }
    public void add(){
        iCostumerDal.Add();
    }
}
