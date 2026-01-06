import java.lang.*;
import entity.*;
import manager.*;
public class Start {
    public static void main(String[] args) {
		Product p= new Electronics();
		Inventory i1= new Inventory(500);
		
		i1.addProduct(2, new Electronics("103","E1",3000,12));
		i1.addProduct(3, new Electronics("104","E2",2500,12));
		i1.addProduct(4, new Clothing("105","C1",1500,"XL","Cotton"));
		i1.addProduct(5, new Clothing("106","C2",800,"L","Cotton"));
		i1.showInventory();
	}
}