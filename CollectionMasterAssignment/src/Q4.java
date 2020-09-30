/*        A hashmap contains information about students and his marks. Student object is key and marks is value.
          Write a method to create 2 hashset which will have passed students of java course and passed students of angular course. 
          Passing marks for java is 50 and passing marks for angular is 60. Student class is as follows. Student { intsid , String name, String course }
*/
import java.util.*;
import java.util.Map.Entry;
class Student
{
	int sid;
	String name;
	String course;
	public Student(int sid, String name, String course) 
	{
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() 
	{
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}
	
	public int hashcode()
	{
		return this.sid;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student s=(Student) o;
		if(s.sid==this.sid)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Q4 
{
	public static void main(String[] args) 
	{
		HashMap<Student,Integer> hm=new HashMap<>();
		hm.put(new Student(1,"ram","java"),65);
		hm.put(new Student(2,"atul","angular"),80);
		hm.put(new Student(3,"sunil","java"),30);
		hm.put(new Student(4,"digambar","angular"),50);
		hm.put(new Student(5,"ganesh","java"),70);
		hm.put(new Student(6,"om","angular"),90);
		hm.put(new Student(7,"shree","java"),50);
		hm.put(new Student(8,"abhi","angular"),60);
		
		System.out.println(hm);
		
		HashSet<Student>hs=new HashSet<>();   // java students in HashSet hs            condition marks >=50
		HashSet<Student>hs1=new HashSet<>();  // angular students in HashSet hs1        condition marks >=60
		
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Entry) itr.next();
			Student s1=(Student) e.getKey();
			Integer i=(Integer) e.getValue();
			if(s1.course=="java")
			{
				if(i>=50)
				{
					hs.add((Student) e.getKey());
				}
			}
			else
			{
				if(i>=60)
				{
					hs1.add((Student) e.getKey());
				}
			}
		}
		System.out.println("*********************Java Passed Students who has marks >=50 are*********************");
		System.out.println(hs);
		System.out.println("*********************Angular Passed Students who has marks >=60 are*********************");
		System.out.println(hs1);
	}
}