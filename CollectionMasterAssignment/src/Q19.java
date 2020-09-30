/*        There is a HashSet which has student objects. Create two arraylists from this
          hashset. In one arraylist called ‘placedStudents’ insert all students who have
          been placed and in another arraylist ‘unplacedStudents’
          Student class--Fields
          studid, Name, Qualification, yearOfpassing, placed(true/false)                    */
import java.util.*;
class Student5
{
	int studid;
	String name;
	String Qualification;
	String yearOfpassing;
	boolean placed;
	public Student5(int studid, String name, String qualification, String yearOfpassing, boolean placed) 
	{
		super();
		this.studid = studid;
		this.name = name;
		Qualification = qualification;
		this.yearOfpassing = yearOfpassing;
		this.placed = placed;
	}
	@Override
	public String toString() 
	{
		return "Student5 [studid=" + studid + ", name=" + name + ", Qualification=" + Qualification + ", yearOfpassing=" + yearOfpassing
				+ ", placed=" + placed + "]";
	}
}
public class Q19 
{
	public static void main(String[] args) 
	{
		HashSet<Student5>hs=new HashSet<>();
		hs.add(new Student5(1,"ram","BE","2020-5-10",true));
		hs.add(new Student5(2,"amit","MCA","2019-5-10",true));
		hs.add(new Student5(3,"yash","B-Tech","2015-5-7",false));
		hs.add(new Student5(4,"digambar","BE","2019-5-10",true));
		hs.add(new Student5(3,"saurav","B-Tech","2019-5-10",false));
		hs.add(new Student5(4,"ganesh","BCA","2014-5-20",false));
		
		ArrayList<Student5>placed=new ArrayList<>();
		ArrayList<Student5>unplaced=new ArrayList<>();
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			Student5 s=(Student5) itr.next();
			if(s.placed==true)
			{
				placed.add(new Student5(s.studid,s.name,s.Qualification,s.yearOfpassing,s.placed));
			}
			else
			{
				unplaced.add(new Student5(s.studid,s.name,s.Qualification,s.yearOfpassing,s.placed));
			}
		}
		System.out.println("placed students are "+placed);
		System.out.println("unplaced students are "+unplaced);
	}
}