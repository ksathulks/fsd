//import java.util.ArrayList;

public class Buyer {
	int buyerNo;
	int[] timesBuyedArr;
	//List<Integer> timesBuyed = new ArrayList<Integer>();
	
	Buyer() {}
	
	Buyer(int buyerNo,Seller s)
	{
		this.buyerNo = buyerNo;
		this.timesBuyedArr = new int[s.pSellList.size()];
	}
	
	void buyProduct(int pId,Seller s)
	{
		int count=0;		
		for(Product p:s.pSellList)
		{
			if(p.pId==pId)
				{
					this.timesBuyedArr[count]++;
				}
			count++;

		}
	}
	
	
	void hottestItem(Seller s)
	{
		int maxCount=0;
		int index=0;
		for(int i=0;i<this.timesBuyedArr.length;i++)
		{	
			if(timesBuyedArr[i]>maxCount)
			{
				maxCount=timesBuyedArr[i];
				index=i;
			}
		}
		System.out.println("Hottest Item sold " + maxCount + " times");
		System.out.println(s.pSellList.get(index));
	}
	
}
