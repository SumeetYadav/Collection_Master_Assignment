/*    Create two Set of students objects where insertion order in maintained. Now accept Studentid from user and 
      check whether in both sets have student with given id at same position    */

import java.util.*;
class Student3
{
	int sid;
	String sname;
	public Student3(int sid, String sname) 
	{
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() 
	{
		return "Student3 [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
public class Q13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashSet<Student3>hs=new HashSet<>();
		HashSet<Student3>hs1=new HashSet<>();
		
		hs.add(new Student3(11,"ram"));
		hs.add(new Student3(12,"anil"));
		hs.add(new Student3(13,"ganesh"));
		hs.add(new Student3(14,"om"));
		hs.add(new Student3(15,"shree"));
		
		
		hs1.add(new Student3(11,"ram"));
		hs1.add(new Student3(12,"anil"));
		hs1.add(new Student3(13,"ganesh"));
		hs1.add(new Student3(14,"om"));
		hs1.add(new Student3(15,"shree"));
		
		int stud1=0;
		int s1Count=0;
		System.out.println("Enter Student Id to find index");
		stud1=sc.nextInt();
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			Student3 s=(Student3) itr.next();
			if(s.sid==stud1)
			{
				s1Count++;
				System.out.println("In set 1 the entered StudentID is at index "+s1Count);
				break;
			}
			else
			{
				s1Count++;
			}
		}
		
		int s2Count=0;
		Iterator itr1=hs.iterator();
		while(itr1.hasNext())
		{
			Student3 s1=(Student3) itr1.next();
			
			if(s1.sid==stud1)
			{
				s2Count++;
				System.out.println("In set 2 the entered StudentID is at index "+s2Count);
				break;
			}
			else
			{
				s2Count++;
			}
		}
	}
}