/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
map which has alphabets as keys and integers as values. If alphabet is
repeated add integer to old value*/
import java.util.*;
public class Q17 
{
	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		System.out.println(al);
		
		HashMap<String,Integer>hm=new HashMap<>();
		int temp;
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String s=(String) itr.next();
			String sarr[]=s.split("\\+");
			temp=Integer.parseInt(sarr[1]);
			hm.put(sarr[0],temp);
		}
		System.out.println("HashMap="+hm);
	}
}