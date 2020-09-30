/*            WAP wherein Set<Student>containing { int rollno , String name , int marks } are changed to
                  Map where key will be marks and value will be List of RollNos where all those students who have same marks are together.        */
import java.util.*;
class stud
{
	int rollno;
	String name;
	int marks;
	public stud(int rollno, String name, int marks) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() 
	{
		return "stud [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class Q6 
{
	public static void main(String[] args) 
	{
		HashSet<stud>hs=new HashSet<>();
		hs.add(new stud(1,"ram",50));
		hs.add(new stud(2,"shree",60));
		hs.add(new stud(3,"om",70));
		hs.add(new stud(4,"sunil",80));
		hs.add(new stud(5,"abhi",50));
		hs.add(new stud(6,"anil",60));
		hs.add(new stud(7,"ganesh",70));
		hs.add(new stud(8,"digambar",70));
		hs.add(new stud(9,"atul",50));
		hs.add(new stud(10,"mohit",70));
		
		System.out.println(hs);
		//int a=0;
		ArrayList<Integer>al=new ArrayList<>();
		ArrayList<Integer>al1=new ArrayList<>();
		ArrayList<Integer>al2=new ArrayList<>();
		ArrayList<Integer>al3=new ArrayList<>();
		
		HashMap<Integer,ArrayList<Integer>>hm=new HashMap<>();
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			stud s=(stud) itr.next();
			if(s.marks==50)
			{
				al.add(s.rollno);
				hm.put(s.marks,al);
			}
			else if(s.marks==60)
			{
				al1.add(s.rollno);
				hm.put(s.marks,al1);
			}
			else if(s.marks==70)
			{
				al2.add(s.rollno);
				hm.put(s.marks,al2);
			}
			else if(s.marks==80)
			{
				al3.add(s.rollno);
				hm.put(s.marks,al3);
			}
		}
		System.out.println(hm);
	}
}