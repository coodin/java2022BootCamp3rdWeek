package interfaces;

public class MySqlCustomerDal implements  ICostumerDal,IRepository{
    @Override
    public void Add() {
        System.out.println("My sql is added");
    }
}
