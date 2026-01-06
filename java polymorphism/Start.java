import java.lang.*;
public class Start {
    public static void main(String[] args) {
		
		Inventory i1 = new Inventory(1000);
		i1.addProduct(0,new Product("111","Item 1",2000));
		//i1.addProduct(11,new Clothing());
		i1.addProduct(1,new Electronics("222","EItem 2",15000,12));
		i1.addProduct(4,new Clothing("335","CItem 5",100,"XL","Cotton"));
		i1.ShowInventory();
		i1.removeProduct(1);
		i1.ShowInventory();
		Inventory i2 = new Inventory(1000);
		i2.addProduct(0,new Product("11","Item 1",2000)); //invalid
		i2.ShowInventory();
	}
}