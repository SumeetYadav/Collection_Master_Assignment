/*   Consider an array of Student 
     Student (int sid, String sname, List<String> hobby)
     From this list create a Map<String,List<Student>> where key is hobby name and list of
     student objects having same hobby. Also find out most common hobby among students       */
import java.util.*;
import java.util.Map.Entry;
class student1
{
	int sid;
	String name;
	ArrayList<String>hobby;
	
	public student1(int sid, String name, ArrayList<String> hobby) 
	{
		super();
		this.sid = sid;
		this.name = name;
		this.hobby = hobby;
	}

	@Override
	public String toString() 
	{
		return "student1 [sid=" + sid + ", name=" + name + ", hobby=" + hobby + "]";
	}
}
public class Q8 
{
	public static void main(String[] args) 
	{
		student1[]sarr=new student1[4];
		
		ArrayList<String>al=new ArrayList<>();
		al.add("swimming");
		al.add("trecking");
		sarr[0]=new student1(1,"ram",al);
		
		ArrayList<String>al1=new ArrayList<>();
		al1.add("dancing");
		al1.add("swimming");
		sarr[1]=new student1(2,"anil",al1);
		
		ArrayList<String>al2=new ArrayList<>();
		al2.add("swimming");
		sarr[2]=new student1(3,"rahul",al2);
		
		ArrayList<String>al3=new ArrayList<>();
		al3.add("dancing");
		al3.add("travelling");
		sarr[3]=new student1(4,"ganesh",al3);
		
		
		//System.out.println(Arrays.toString(sarr));
		ArrayList swim=new ArrayList<>();
		ArrayList treck=new ArrayList<>();
		ArrayList dance=new ArrayList<>();
		ArrayList travel=new ArrayList<>();
		
		HashMap<String,ArrayList<student1>>hm=new HashMap();
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println(sarr[i].sid+" "+sarr[i].name);
			for(int j=0;j<sarr[i].hobby.size();j++)
			{
				System.out.println(sarr[i].hobby.get(j));
				if(sarr[i].hobby.get(j)=="swimming")
				{
					swim.add(sarr[i].name);
				}
				else if(sarr[i].hobby.get(j)=="trecking")
				{
					treck.add(sarr[i].name);
				}
				else if(sarr[i].hobby.get(j)=="dancing")
				{
					dance.add(sarr[i].name);
				}
				else if(sarr[i].hobby.get(j)=="travelling")
				{
					travel.add(sarr[i].name);
				}
			}
		}
		hm.put("swimming",swim);
		hm.put("trecking",treck);
		hm.put("dancing",dance);
		hm.put("travelling",travel);
		System.out.println(hm);
		
		int max=0;
		String hobby="";
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Entry) itr.next();
			String hoby=(String) e.getKey();
			ArrayList<String>names=(ArrayList<String>) e.getValue();
			if(names.size()>max)
			{
				max=names.size();
				hobby=hoby;
			}
		}
		System.out.println("The most common hobby among students is "+hobby);
	}
}