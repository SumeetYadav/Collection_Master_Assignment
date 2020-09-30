/*Hotel serves delicious Menus to its Customers. It maintains list of Orders given on daily basis. 
 * Order list is maintained as ArrayList<Order>. Each Order contains orderid, MenuName, price,  qtyOrdered. 
 * (Price of same Menu may vary according hours).
From ArrayList of Orders create a map <String,Float> where Menu Name is key and total sale in a day for theMenu as Value.
 (sale for the menu is Price*qty ordered).Eg. Order List for a day is :
[(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10),   (92,”Hakka Noodles”,220.00,2), (96,”Pav Bhajee”,125.00,8), 
       (101,”Grilled Sandwitch”,70.00,2)]
Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}} */
import java.util.*;
class Order
{
	int orderid;
	String MenuName;
	float price;
	int qtyOrdered;
	
	public Order(int orderid, String menuName, float price, int qtyOrdered) 
	{
		super();
		this.orderid = orderid;
		MenuName = menuName;
		this.price = price;
		this.qtyOrdered = qtyOrdered;
	}
	@Override
	public String toString() 
	{
		return "Order [orderid=" + orderid + ", MenuName=" + MenuName + ", price=" + price + ", qtyOrdered="
				+ qtyOrdered + "]";
	}
}
public class Q11 
{
	public static void main(String[] args) 
	{
		ArrayList<Order>order=new ArrayList<>();
		order.add(new Order(80,"Pav Bhajee",120.00f,5));
		order.add(new Order(90,"Grilled Sandwitch",72.00f,10));
		order.add(new Order(92,"Hakka Noodles",220.00f,2));
		order.add(new Order(96,"Pav Bhajee",125.00f,8));
		order.add(new Order(101,"Grilled Sandwitch",70.00f,2));

		HashMap<String,Float>hm=new HashMap<>();
		Iterator itr=order.iterator();
		float HakkaNoodlesSale=0f;
		float GrilledSandwitchSale=0f;
		float PavBhajeeSale=0f;
		
		while(itr.hasNext())
		{
			Order o=(Order) itr.next();
			
			if(o.MenuName=="Pav Bhajee")
			{
				PavBhajeeSale=PavBhajeeSale+o.price*o.qtyOrdered;
			}
			else if(o.MenuName=="Grilled Sandwitch")
			{
				GrilledSandwitchSale=GrilledSandwitchSale+o.price*o.qtyOrdered;
			}
			else if(o.MenuName=="Hakka Noodles")
			{
				HakkaNoodlesSale=HakkaNoodlesSale+o.price*o.qtyOrdered;
			}
		}
		hm.put("Pav Bhajee",PavBhajeeSale);
		hm.put("Grilled Sandwitch",GrilledSandwitchSale);
		hm.put("Hakka Noodles", HakkaNoodlesSale);
		
		System.out.println(hm);
	}
}