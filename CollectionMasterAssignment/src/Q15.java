/*      Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}.  
        Write a program which creates Map where key is Wing_FlatNo and value is List of all  names of family members  */
import java.util.*;
class Member
{
	int memberid;
	String Wing_flatNo;
	String name;
	
	public Member(int memberid, String wing_flatNo, String name) 
	{
		super();
		this.memberid = memberid;
		Wing_flatNo = wing_flatNo;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Member [memberid=" + memberid + ", Wing_flatNo=" + Wing_flatNo + ", name=" + name + "]";
	}
}
public class Q15 
{
	public static void main(String[] args) 
	{
		ArrayList<Member>al=new ArrayList<>();
		al.add(new Member(1,"A101","amit"));
		al.add(new Member(2,"A101","rahul"));
		al.add(new Member(3,"A101","ram"));
		al.add(new Member(4,"B102","onkar"));
		al.add(new Member(5,"C103","ganesh"));
		al.add(new Member(6,"C103","saurav"));
		al.add(new Member(7,"D104","digambar"));
		al.add(new Member(8,"D104","rishi"));
		al.add(new Member(9,"D104","om"));
		al.add(new Member(10,"D104","yash"));
		
		ArrayList<String>Awing=new ArrayList<>();
		ArrayList<String>Bwing=new ArrayList<>();
		ArrayList<String>Cwing=new ArrayList<>();
		ArrayList<String>Dwing=new ArrayList<>();
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Member m=(Member) itr.next();
			if(m.Wing_flatNo=="A101")
			{
				Awing.add(m.name);
			}
			else if(m.Wing_flatNo=="B102")
			{
				Bwing.add(m.name);
			}
			else if(m.Wing_flatNo=="C103")
			{
				Cwing.add(m.name);
			}
			else if(m.Wing_flatNo=="D104")
			{
				Dwing.add(m.name);
			}
		}
		HashMap<String,ArrayList<String>>hm=new HashMap();
		hm.put("A101",Awing);
		hm.put("B102", Bwing);
		hm.put("C103", Cwing);
		hm.put("D104", Dwing);
		System.out.println(hm);
	}
}