/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
method which accepts a String eg D in input and will return
associated number value eg in this case 4 by looping the arraylist and
finding matching pattern*/
import java.util.*;
public class Q18 
{
	static ArrayList get(ArrayList al,String s)
	{
		ArrayList al2=new ArrayList<>();
		int temp;
		for(int i=0;i<al.size();i++)
		{
			String a=(String) al.get(i);
			String sarr[]=a.split("\\+");
			if(sarr[0].equals(s))
			{
				temp=Integer.parseInt(sarr[1]);
				al2.add(temp);
			}
		}
		return al2;	
	}
	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		System.out.println((get(al,"D")));
	}
}