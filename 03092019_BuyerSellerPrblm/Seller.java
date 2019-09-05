import java.util.ArrayList;
import java.util.List;

public class Seller {
		int sId;
		int revenue;
		List<Product> pSellList = new ArrayList<Product>();
		
		Seller(){}
		
		public Seller(int sId, List<Product> pSellList) {
			super();
			this.sId = sId;
			this.pSellList=pSellList;
		}
		
		void updatePrice(int pId,int newPrice)
		{	
			pSellList.forEach(p->{if(p.pId==pId) {
				p.setSoldPrice(newPrice);}
			});
			
		}
		
		
		void salesRevenue(Buyer b1,Buyer b2) {
			int max = 0;
			int k=0;
			int index=0;
			for(Product p : this.pSellList) {
				int temp = 0;
				temp = (p.soldPrice*b1.timesBuyedArr[k])+(p.soldPrice*b2.timesBuyedArr[k]);
				System.out.println("Revenue of Product " + p.getpName() + "= " + temp);
				if(temp>max) {
					max = temp;
					index=k;
				}
				k++;
			}
			System.out.println("Most revenue product: "+pSellList.get(index).getpName());
			System.out.println("Revenue : "+max );
			this.revenue =max;
		}
}
