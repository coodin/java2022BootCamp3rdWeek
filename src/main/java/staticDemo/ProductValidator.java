package staticDemo;

public class ProductValidator {

    static {
        System.out.println("Static constructor has been called");
    }

    public ProductValidator(){
        System.out.println("Constructor has been called");
    }
    public static boolean isValid(Product product){
        return product.price > 0 && !product.name.isEmpty();
    }

    public void someting(){

    }
}
