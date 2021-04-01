/*///      Given a linked list of integers , find out number of missing elements in linked list. E.g. list
         contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } . missing
         elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list.                  */
import java.util.*;
public class Q3 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>al=new LinkedList<>();
		al.add(3);
		al.add(13);
		al.add(7);
		al.add(2);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Sorted List is "+al);
		System.out.println("Min Element is "+al.getFirst());
		System.out.println("Max Element is "+al.getLast());
		
		int start=al.getFirst();
		int end=al.getLast();
		int j=0;
		int c1=0,c2=0;
		for(int i=start ; i<=end ; i++)
		{
			if(al.get(j)==i)
			{
				System.out.println("Element present is "+al.get(j));
				j++;
				c1++;
			}
			
			else
			{
				System.out.println("Missing element is "+i);
				c2++;
			}
		}
		System.out.println("Total present elements are "+c1);
		System.out.println("Total absent elements are "+c2);
	}
}