import java.util.ArrayList;

/**
 * Class representing the Product Cart in supermarket.
 * Customer owns it and performs operation with products(addition or removal) through it
 */
public class ProductCart {
    private ArrayList<ProductPosition> products;

    /** Returns the ArrayList with all product positions in the cart */
    public ArrayList<ProductPosition> getProductList() {
        return products;
    }

    /**
     * Adds the product type in the cart in the cart, the number of products is hold inside the class ProductPosition
     *
     * @param productPosition The product position that we put inside the cart
     */
    public void addProduct(ProductPosition productPosition) {
        products.add(productPosition);
    }

    /**
     * Removes certain amount of product of one type from the cart
     *
     * @param productPosition The product position that we need to take out of cart
     * @param numOfRemoval    Number of products that we take off
     */
    public void removeProduct(ProductPosition productPosition, int numOfRemoval) {
        int temp = productPosition.getQuantity();
        if (numOfRemoval < temp) {
            productPosition.setQuantity(temp - numOfRemoval);
        } else if (numOfRemoval == temp) {
            products.remove(productPosition);
        } else {
            System.out.println("You are trying to remove more products than customer have in the cart");
        }
    }

    /** Passing the cart to the cashBox (terminal), where it will be manipulated further */
    public void createOrder() {

    }
}
