/*An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>  
Create another map in which course id is a key and list of student objects of that course*/ 

import java.util.*;
import java.util.Map.Entry;
class student2
{
	int sid;
	String name;
	public student2(int sid, String name) 
	{
		super();
		this.sid = sid;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "student2 [sid=" + sid + ", name=" + name + "]";
	}
}
class course
{
	int cid;
	String cname;
	public course(int cid, String cname) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() 
	{
		return "course [cid=" + cid + ", cname=" + cname + "]";
	}
}
public class Q10 
{
	public static void main(String[] args) 
	{
		HashMap<student2,ArrayList<course>>hm=new HashMap();
		ArrayList<course>al=new ArrayList<>();
		al.add(new course(11,"Java"));
		al.add(new course(12,"Angular"));
		
		ArrayList<course>al1=new ArrayList<>();
		al1.add(new course(13,"Python"));
		al1.add(new course(14,"ReactJs"));
		
		ArrayList<course>al2=new ArrayList<>();
		al2.add(new course(11,"Java"));
		al2.add(new course(13,"Python"));
		
		hm.put(new student2 (1,"Amit"),al);
		hm.put(new student2 (2,"Ram"),al1);
		hm.put(new student2 (3,"Manish"),al2);
		
		//System.out.println(hm);
		
		HashMap<Integer,ArrayList<student2>>hm1=new HashMap<>();
		
		ArrayList<student2>java=new ArrayList();
		ArrayList<student2>angular=new ArrayList();
		ArrayList<student2>reactjs=new ArrayList();
		ArrayList<student2>python=new ArrayList();
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Entry) itr.next();
			student2 stud=(student2) e.getKey();
			ArrayList<course>course=(ArrayList<course>) e.getValue();
			Iterator itr2=course.iterator();
			while(itr2.hasNext())
			{
				course c=(course) itr2.next();
				if(c.cname=="Java")
				{
					java.add(new student2(stud.sid,stud.name));
				}
				else if(c.cname=="Angular")
				{
					angular.add(new student2(stud.sid,stud.name));
				}
				else if(c.cname=="ReactJs")
				{
					reactjs.add(new student2(stud.sid,stud.name));
				}
				else if(c.cname=="Python")
				{
					python.add(new student2(stud.sid,stud.name));
				}	
			}
		}
		hm1.put(11,java);
		hm1.put(12,angular);
		hm1.put(13,python);
		hm1.put(14,reactjs);
		System.out.println(hm1);
	}
}