package master_assignment.bean;

import java.util.Date;

public class Attendance {
	public int att_sr_no;
	public int studId;
	public String att_status;
	public Date att_date;
	public Attendance(int att_sr_no, int att_sid, String att_status, Date att_date) {
		this.att_sr_no = att_sr_no;
		this.studId = att_sid;
		this.att_status = att_status;
		this.att_date = att_date;
	}
	
	public String toString()
	{
		return("attendance srno:  "+this.att_sr_no+" "+"attendance sid:  "+this.studId+" "+"attendance status: "
	+this.att_status+" "+"attendance date: "+this.att_date+"\n");
		
	}
	
	
}
