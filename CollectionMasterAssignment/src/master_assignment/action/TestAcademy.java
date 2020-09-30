package master_assignment.action;

import java.util.*;
import java.util.Map.Entry;
import master_assignment.bean.Academy;
import master_assignment.bean.Attendance;
import master_assignment.bean.Course;
import master_assignment.bean.Student;
import master_assignment.bean.TestResult;
import master_assignment.bean.Transaction;

public class TestAcademy 
{
	public static void main(String[] args)
	{
		ArrayList<Student>s=new ArrayList<>();
		s.add(new Student(11,"Ganesh",950602,"ganesh@123"));
		s.add(new Student(12,"Ram",882352,"ram@1993"));
		
		ArrayList<Student>s1=new ArrayList<>();
		s1.add(new Student(13,"Anuja",947854,"an@0121"));
		s1.add(new Student(14,"Pratik",785421,"pratik@7845"));
		s1.add(new Student(15,"Anil",936521,"Ani@0345"));
		s1.add(new Student(16,"Sunil",771582,"sunil@1421"));
		s1.add(new Student(17,"Om",974523,"omi@3210"));

		Academy.studentMap.put(1,s);
		Academy.studentMap.put(2, s1);
		
		ArrayList<Attendance>a=new ArrayList<>();
		a.add(new Attendance(101,11,"present",new Date(2020-03-11)));
		a.add(new Attendance(102,12,"present",new Date(2020-03-11)));
		a.add(new Attendance(103,11,"present",new Date(2020-03-12)));
		a.add(new Attendance(104,12,"absent",new Date(2020-03-12)));
		a.add(new Attendance(105,11,"present",new Date(2020-03-13)));
		a.add(new Attendance(106,12,"absent",new Date(2020-03-13)));
		
		ArrayList<Attendance>a1=new ArrayList<>();
		a1.add(new Attendance(101,18,"absent",new Date(2020-03-11)));
		a1.add(new Attendance(102,19,"present",new Date(2020-03-11)));
		a1.add(new Attendance(103,20,"present",new Date(2020-03-11)));
		a1.add(new Attendance(104,18,"absent",new Date(2020-03-12)));
		a1.add(new Attendance(105,19,"present",new Date(2020-03-12)));
		a1.add(new Attendance(106,20,"absent",new Date(2020-03-12)));
		
		Academy.attendanceMap.put(1,a);
		Academy.attendanceMap.put(2,a1);
		
		ArrayList<Transaction>tt1=new ArrayList<>();
		tt1.add(new Transaction(5000,13,new Date(2020-03-11)));
		tt1.add(new Transaction(3000,14,new Date(2020-03-11)));//
		tt1.add(new Transaction(7000,15,new Date(2020-03-11)));
		tt1.add(new Transaction(3000,16,new Date(2020-03-11)));//
		tt1.add(new Transaction(4000,17,new Date(2020-03-11)));
		
		
		ArrayList<Transaction>tt2=new ArrayList<>();
		tt2.add(new Transaction(2000,18,new Date(2020-03-11)));
		tt2.add(new Transaction(5000,19,new Date(2020-03-11)));
		tt2.add(new Transaction(3000,20,new Date(2020-03-11)));
		tt2.add(new Transaction(4000,21,new Date(2020-03-11)));
		
		
		Academy.transactionMap.put(1,tt1);
		Academy.transactionMap.put(2,tt1);
		
		int max=0;
		int cid=0;
		Set ss=Academy.studentMap.entrySet();
		Iterator itr=ss.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry e=(Entry) itr.next();
			Integer courseid=(Integer) e.getKey();
			ArrayList<Student>student=(ArrayList<Student>) e.getValue();
			if(student.size()>max)
			{
				max=student.size();
				cid=courseid;
			}
		}
		System.out.println("Course Id="+cid +" has maximum students");
		
		LinkedList<Transaction>ls=new LinkedList<>();
		int Fjava=0,Fphp=0,Freact=0,Fpython=0;
		Set trans=Academy.transactionMap.entrySet();
		Iterator transaction=trans.iterator();
		while(transaction.hasNext())
		{
			Map.Entry tran=(Entry) transaction.next();
			Integer id=(Integer) tran.getKey();
			
			ArrayList<Transaction>alt=(ArrayList<Transaction>) tran.getValue();
			Iterator alt1=alt.iterator();
			while(alt1.hasNext())
			{
				Transaction alt2=(Transaction) alt1.next();
				
				if(id==1)
				{
					Fjava=10000-alt2.paidfees;
					if(Fjava==0)
					{
						ls.add(new Transaction(alt2.paidfees,alt2.studId,alt2.trans_date));
					}
				}
				if(id==2)
				{
					Fphp=7000-alt2.paidfees;
					if(Fphp==0)
					{
						ls.add(new Transaction(alt2.paidfees,alt2.studId,alt2.trans_date));
					}
				}if(id==3)
				{
					Freact=5000-alt2.paidfees;
					if(Freact==0)
					{
						ls.add(new Transaction(alt2.paidfees,alt2.studId,alt2.trans_date));
					}
				}
				if(id==4)
				{
					Fpython=4000-alt2.paidfees;
					if(Fpython==0)
					{
						ls.add(new Transaction(alt2.paidfees,alt2.studId,alt2.trans_date));
					}
				}
			}
		}
		System.out.println("----------------First 3 students across courses who paid full fees are----------------");
		int i=1;
		Iterator lsi=ls.iterator();
		while(lsi.hasNext())
		{
			if(i>3)
			{
				break;
			}
			else
			{
				System.out.print(lsi.next());
			}
			i++;
		}

		ArrayList<TestResult>t=new ArrayList<>();
		t.add(new TestResult (new Date(2020-03-18),11111,11,6,20));
		t.add(new TestResult (new Date(2020-03-18),11111,12,14,20));
		
		ArrayList<TestResult>t1=new ArrayList<>();
		t1.add(new TestResult (new Date(2020-03-18),10101,13,5,20));
		t1.add(new TestResult (new Date(2020-03-18),10101,14,11,20));
		t1.add(new TestResult (new Date(2020-03-18),10101,15,7,20));
		t1.add(new TestResult (new Date(2020-03-18),10101,16,19,20));
		
		t1.add(new TestResult (new Date(2020-03-24),11111,13,19,20));
		t1.add(new TestResult (new Date(2020-03-24),10101,15,17,20));
		Academy.test_map.put(1, t);
		Academy.test_map.put(2, t1);
		
		
		HashMap<Integer, List<TestResult>>hm=new HashMap();
		System.out.println("----------------Students with marks<40% across all tests are----------------");
		ArrayList<Integer>result=new ArrayList<>();
		Set test=Academy.test_map.entrySet();
		Iterator testResult=test.iterator();
		int r=0;
		while(testResult.hasNext())
		{
			Map.Entry e2=(Entry) testResult.next();
			Integer c_id=(Integer) e2.getKey();
			ArrayList<TestResult>TestResult=(ArrayList<TestResult>) e2.getValue();
			
			for(int k=0;k<TestResult.size();k++)
			{
				TestResult tres=TestResult.get(k);
				r=(tres.marks*100)/tres.out_of_marks;
				if(r<40)
				{
					result.add(tres.studentId);
				}
			}
		}
		System.out.println(result);

		
		Academy.courseList.add(new Course(1,"Java",new Date(2020-03-11),"Java",10000,"2months"));
		Academy.courseList.add(new Course(2,"Php",new Date(2020-03-11),"Php",7000,"1months"));
		Academy.courseList.add(new Course(3,"ReactJs",new Date(2020-03-11),"ReactJs",5000,"1.5months"));
		Academy.courseList.add(new Course(4,"Python",new Date(2020-03-11),"Python",4000,"2months"));
		
		ArrayList<Course> c1=Academy.courseList;
		for(Course c2:c1)
		{
			if(c2.course_name=="Java")
			{
				System.out.println("Coursename= "+c2.course_name+" "+"Start date= "+c2.startDate+" "+
			"fees= "+c2.courseFees);
			}
		}
	}
}