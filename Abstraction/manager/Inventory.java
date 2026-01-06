package manager;

import entity.Product;
import interfaces.IInventoryOperations;

public class Inventory implements IInventoryOperations {

    private Product[] products;

    public Inventory() {
        products = new Product[1000];
    }

    public Inventory(int size) {
        products = new Product[size];
    }

    @Override
    public void addProduct(int pNo, Product p) {
        if(pNo >= 0 && pNo < products.length) {
            products[pNo] = p;
        }
    }

    @Override
    public Product getProduct(int pNo) {
        return products[pNo];
    }

    @Override
    public Product getProductById(String id) {
        for(Product p : products) {
            if(p != null && p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void remove(int pNo) {
        products[pNo] = null;
    }

    public void showInventory() {
        System.out.println("------------ Inventory Details --------------");
        for(Product p : products) {
            if(p != null) p.displayDetails();
        }
        System.out.println("---------------------------------------------");
    }
}
