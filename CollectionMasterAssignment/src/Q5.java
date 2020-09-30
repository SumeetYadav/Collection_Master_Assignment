/*       Assume that there is already a arraylist of Customer objects. Customer { int cid , String name ,int items }. 
         Write a program which creates hashset of customer objects. If there are multiple customer object for same customer in arraylist,
         then items should be added to previous customer’s items. Once set is created sort that set based on no. of items purchased by that customer.
         Customer with maximum items should be first.           */
import java.util.*;
import java.util.Map.Entry;

class Customer {
	int cid;
	String name;
	int items;

	public Customer(int cid, String name, int items) {
		this.cid = cid;
		this.name = name;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", items=" + items + "]";
	}
}

public class Q5 {
	public static void main(String[] args) {
		ArrayList<Customer> al = new ArrayList<>();
		HashMap<Integer,Customer>hm=new HashMap();
		HashSet<Customer> hs = new HashSet<>();
				
		al.add(new Customer(1,"amit",2));
		al.add(new Customer(2,"raj",4));
		al.add(new Customer(1,"amit",7));
		al.add(new Customer(2,"raj",10));
		
		System.out.println("ArrayList-------"+al);
		int keyy=0;
		
		for(Customer a:al)
		{
			keyy=a.cid;
			if(hm.containsKey(keyy))
			{
				Customer b=(Customer) hm.get(keyy);
				hm.put(keyy,new Customer(b.cid,b.name,b.items+a.items));
			}
			else
			{
				hm.put(a.cid,new Customer(a.cid,a.name,a.items));
			}
		}
		/*System.out.println("HashMap");
		System.out.println(hm);*/
		
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Entry) itr.next();
			hs.add((Customer) e.getValue());
		}
		System.out.println("HashSet --------"+hs);
	}
}