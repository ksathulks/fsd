import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(11,"tv",25000);
		Product p2= new Product(12,"mobile",15000);
		Product p3 = new Product(13,"fridge",12000);
		List<Product> pSellListMain = new ArrayList<Product>();
		pSellListMain.add(p1); pSellListMain.add(p2); pSellListMain.add(p3);
		
		Seller s1 = new Seller(100, pSellListMain);		
		s1.updatePrice(11, 22000);
		s1.updatePrice(12, 13000);
		s1.updatePrice(13, 8000);
		
		
		Buyer b1 = new Buyer(111,s1);
		b1.buyProduct(11, s1);
		b1.buyProduct(12, s1);
		b1.buyProduct(11, s1);
		
		
		b1.hottestItem(s1);
		
		Buyer b2 = new Buyer(112,s1);
		b2.buyProduct(13, s1);
		b2.buyProduct(13, s1);
		b2.buyProduct(12, s1);
		
		b2.hottestItem(s1);
		
		s1.salesRevenue(b1, b2);
		
		System.out.println("\n///////////////////////////\n\n");
		
		Product p4 = new Product(14,"watch",3000);
		Product p5= new Product(15,"sun glasses",2500);
		Product p6 = new Product(16,"cosmetics",5000);
		pSellListMain.add(p4); pSellListMain.add(p5); pSellListMain.add(p6);

		Seller s2 = new Seller(200, pSellListMain);
		s2.updatePrice(15, 2000);
		s2.updatePrice(16, 4000);
		
		Buyer b3 = new Buyer(123,s2);
		b3.buyProduct(14, s2);
		b3.buyProduct(14, s2);
		b3.buyProduct(14, s2);
				
		b3.hottestItem(s2);
		
		Buyer b4 = new Buyer(123,s2);
		b4.buyProduct(16, s2);
		b4.buyProduct(16, s2);
		b4.buyProduct(14, s2);
		
		b4.hottestItem(s2);
		
		s2.salesRevenue(b3, b4);
	}
}
