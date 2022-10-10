package methodOverloading;

public class Main {
    public static void main(String[] args) {
    FourOperations fourOperations = new FourOperations();
        System.out.println(fourOperations.sum(2,3));
        fourOperations.sum(2,3,5);
    }
}
