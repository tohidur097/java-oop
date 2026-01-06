package manager;
import entity.*;
public class Cart{
    private CartItem[] cartItems;

    public Cart(){
        cartItems=new CartItem[1000];
    }
    public Cart(int size){
        cartItems=new CartItem[size];
    }
    public void addProduct(int itemNo,Product p,double quantity){               //double quantitys
        if(itemNo>=0 && itemNo<=cartItems.length && p.getQuantity()>=quantity ){
            cartItems[itemNo]=new CartItem(p,quantity);
        }
        else {
            p.displayDetails();
            System.out.println("Out of Stock for Quantity : ");
        }
    }

    public CartItem getProduct(int itemNo){
		return cartItems[itemNo];
	}

    public void remove(int itemNo){
		cartItems[itemNo] = null;
	}

    public void showCart(){
        System.out.println("----------------------cart details-----------------");
        double totalCost=0;
        for(CartItem item : cartItems){
			if(item!=null){
				totalCost += item.getBill();
				item.showItem();
			}
        }
        System.out.println("-------------------------------------------");
		System.out.println("# Total Bill: "+totalCost);
		System.out.println("-------------------------------------------");
	

    }
    public void confirmOrder(){
		showCart();
		for(CartItem item : cartItems){
			if(item!=null){
				item.sellProduct();
			}
		}
	}

}
