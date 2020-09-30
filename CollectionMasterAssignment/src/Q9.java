/*Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp and print all Employee along with their Manager name.   */
import java.util.*;
class Employee
{
     String name;
     int eid;
     int mgrid;
     
	public Employee(String name, int eid, int mgrid) 
	{
		super();
		this.name = name;
		this.eid = eid;
		this.mgrid = mgrid;
	}

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", eid=" + eid + ", mgrid=" + mgrid + "]";
	} 
}
public class Q9
{
	public static void main(String[] args) 
	{
		ArrayList<Employee>al=new ArrayList<>();
		al.add(new Employee("Ram",1,2));
		al.add(new Employee("Amit",2,3));
		al.add(new Employee("Om",5,4));
		al.add(new Employee("Mohan",4,5));
		al.add(new Employee("Ganesh",3,2));
		
		int ManagerId=0;
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Employee e=(Employee) itr.next();
			System.out.println("Employee details = "+e.name+" "+e.eid+" "+e.mgrid);
			ManagerId=e.mgrid;
			Iterator itr1=al.iterator();
			while(itr1.hasNext())
			{
				Employee e1=(Employee) itr1.next();
				if(e1.eid==ManagerId)
				{
					System.out.println("Manager Name = "+e1.name);
				}
			}
		}
	}
}