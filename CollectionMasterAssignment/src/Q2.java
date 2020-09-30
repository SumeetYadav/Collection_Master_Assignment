/*    Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in same order in hashmap.
      E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {“mno” ,2} Given list is (“rst”) (“abc”) so it appears in same order.
      Output should be “true” If given list is (“abc” ) (“pqr” ) then output should be “false”     */
import java.util.*;
import java.util.Map.Entry;
public class Q2 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
		hm.put("pqr",12);
		hm.put("rst",43);
		hm.put("abc",4);
		hm.put("mno",2);
		System.out.println("HashMap = "+hm);
		
		ArrayList<String>al=new ArrayList<>();
		al.add("rst");
		al.add("abc");
		System.out.println("List1 = "+al);
		
		ArrayList<String>al1=new ArrayList<>();
		al1.add("abc");
		al1.add("pqr");
		System.out.println("List2 = "+al1);
		
		int a=0;
		String s1="",s2="",s3="";
		
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Entry) itr.next();
			s1=s1+e.getKey();
			a++;
		}
		
		for(int i=0;i<al.size();i++)
		{
			s2=s2+al.get(i);
		}
		
		for(int i=0;i<al1.size();i++)
		{
			s3=s3+al1.get(i);
		}
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		
		System.out.println("If HashMap elements and List elements are in same order then 'true' comes else 'false'");
		System.out.println("HashMap elements and List elements are in same order so-------------"+s1.contains(s2));
		System.out.println("HashMap elements and List elements are not in same order so---------"+s1.contains(s3));
	}
}