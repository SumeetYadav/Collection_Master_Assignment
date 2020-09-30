/*     Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .Create a Set<Student> Student{sid,totalmarks}  
       from the list and sort the set in descending order of totalmarks           */
import java.util.*;
class Test
{
	int tid;
	int sid;
	int marks[];
	public Test(int tid, int sid, int[] marks) 
	{
		super();
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	@Override
	public String toString() 
	{
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}
	
}
class Student4
{
	int sid;
	int totalmarks;
	
	public Student4(int sid, int totalmarks) 
	{
		super();
		this.sid = sid;
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() 
	{
		return "Student4 [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}
}
class TotalMarksComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Student4 s1=(Student4) o1;
		Student4 s2=(Student4) o2;
		return s2.totalmarks-s1.totalmarks;
	}
	
}
public class Q16 
{
	public static void main(String[] args) 
	{
		int []m1= {70,52,47};
		int []m2= {78,65,84};
		int []m3= {80,89,41};
		
		ArrayList<Test>t1=new ArrayList<>();
		t1.add(new Test(101,1,m1));
		t1.add(new Test(102,2,m2));
		t1.add(new Test(103,3,m3));
		
		int Total1=0;
		int Total2=0;
		int Total3=0;
		Iterator itr=t1.iterator();
		while(itr.hasNext())
		{
			Test t=(Test) itr.next();
			if(t.sid==1)
			{
				for(int i=0;i<t.marks.length;i++)
				{
					Total1=Total1+t.marks[i];
				}
			}
			else if(t.sid==2)
			{
				for(int i=0;i<t.marks.length;i++)
				{
					Total2=Total2+t.marks[i];
				}
			}
			else if(t.sid==3)
			{
				for(int i=0;i<t.marks.length;i++)
				{
					Total3=Total3+t.marks[i];
				}
			}
		}
		TreeSet<Student4>hs=new TreeSet(new TotalMarksComparator());
		hs.add(new Student4(1,Total1));
		hs.add(new Student4(2,Total2));
		hs.add(new Student4(3,Total3));
		
		System.out.println(hs);
	}
}