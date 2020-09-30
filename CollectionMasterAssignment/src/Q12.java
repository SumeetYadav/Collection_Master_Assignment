/* Create a Map<String,String> where key is adhar no  and value is voted casted to which party(eg. BJP,ShivSena,NCP,Congress,Other).
   From this create new map such that KEY is party name and value is count of votes casted        */
import java.util.*;
import java.util.Map.Entry;
public class Q12 
{
	public static void main(String[] args) 
	{
		HashMap<String,String>hm=new HashMap<>();
		hm.put("1017454247","BJP");
		hm.put("9547878458","ShivSena");
		hm.put("7845178217","NCP");
		hm.put("8978477458","Congress");
		hm.put("8547878457","Other");
		hm.put("4785454247","BJP");
		hm.put("7845445717","NCP");
		hm.put("9548878458","ShivSena");
		hm.put("7845448217","NCP");
		hm.put("8978787458","Congress");
		hm.put("8547872145","Other");
		hm.put("1017474147","BJP");
		hm.put("9541248458","ShivSena");
		hm.put("7845456217","NCP");
		hm.put("8978474515","Congress");
		hm.put("8547474157","Other");
		hm.put("9541278458","ShivSena");
		hm.put("7841445717","NCP");
		
		int CoutBjp=0;
		int CoutShivSena=0;
		int CoutNCP=0;
		int CoutCongress=0;
		int CoutOther=0;
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=(Entry) itr.next();
			String AdharNo=(String) e.getKey();
			String PartyName=(String) e.getValue();
			
			if(PartyName=="BJP")
			{
				CoutBjp++;
			}
			else if(PartyName=="ShivSena")
			{
				CoutShivSena++;
			}
			else if(PartyName=="NCP")
			{
				CoutNCP++;
			}
			else if(PartyName=="Congress")
			{
				CoutCongress++;
			}
			else if(PartyName=="Other")
			{
				CoutOther++;
			}
		}
		HashMap<String,Integer>hm1=new HashMap();
		hm1.put("BJP",CoutBjp);
		hm1.put("ShivSena",CoutShivSena);
		hm1.put("NCP",CoutNCP);
		hm1.put("Congress",CoutCongress);
		hm1.put("Other", CoutOther);
		
		System.out.println(hm1);
	}
}