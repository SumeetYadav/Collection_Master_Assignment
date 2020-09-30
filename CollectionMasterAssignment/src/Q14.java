/*Given two LinkedList, we need to combine two LinkedList  in such a way that the combined a List has alternate elements of both.
 *  If one list has extra element, then these elements are appended at the end of the combined list.

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}*/
import java.util.*;
public class Q14 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>l=new LinkedList<>();
		LinkedList<Integer>l1=new LinkedList<>();
		LinkedList<Integer>l2=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		
		int a=0;
		for(int i=0;i<l.size();i++)
		{
			l2.add(l.get(i));
			for(int j=1;j<2;j++)
			{
				if(a>=l1.size())
				{
					break;
				}
				l2.add(l1.get(a));
				a++;
			}
		}
		System.out.println(l2);
	}
}