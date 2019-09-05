
public class Product {
	int pId;
//	int pPrice;
	int soldPrice;
	int costPrice;
	String pName;
	

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(int soldPrice) {
		this.soldPrice = soldPrice;
	}

	public int getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Product(int pId,  String pName, int costPrice) {
		super();
		this.pId = pId;
		this.soldPrice = costPrice;
		this.costPrice = costPrice;
		this.pName = pName;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Product [id= " + pId + ", Product Name= "+ pName +", Product Price= " + costPrice + ", Sold Price= " + soldPrice + "]\n";
	}
}
