package overriding;

public class StudentCreditManager extends BaseCreditManager{
    @Override
    public double Calculate(double amount) {
        return amount * 1.10;
    }
}
