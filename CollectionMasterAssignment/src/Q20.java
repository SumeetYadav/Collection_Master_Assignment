/*     13. Consider List of T20 Players.
           Player (playerid,Name,Country,team)
           e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
           Then find out which team has maximum Australian players     */
import java.util.*;
class Player
{
	int playerid;
	String Name;
	String Country;
	String team;
	public Player(int playerid, String name, String country, String team)
	{
		super();
		this.playerid = playerid;
		Name = name;
		Country = country;
		this.team = team;
	}
	@Override
	public String toString() 
	{
		return "Player [playerid=" + playerid + ", Name=" + Name + ", Country=" + Country + ", team=" + team + "]";
	}
}
public class Q20 
{
	public static void main(String[] args) 
	{
		ArrayList<Player>al=new ArrayList();
		al.add(new Player(1,"Rohit sharma","India","Mumbai Indians"));
		al.add(new Player(2,"MS Dhoni","India","Chennai Super Kings"));
		al.add(new Player(3,"AB Divilers","Australian","Rajastan Royals"));
		al.add(new Player(4,"Kiren Pollard","West Indies","Mumbai Indians"));
		al.add(new Player(5,"Steve Smith","Australian","Rajastan Royals"));
		al.add(new Player(6,"Glenn Maxwell","Australian","Kings XI punjab"));
		al.add(new Player(7,"Aron finch","Australian","Rajastan Royals"));
		al.add(new Player(8,"Joy bristro","Australian","Kings XI punjab"));
		
		ArrayList<String>teams=new ArrayList();
		int punjab=0;
		int rajastan=0;
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Player p=(Player) itr.next();
			if(p.Country=="Australian")
			{
				if(p.team=="Kings XI punjab")
				{
					punjab++;
				}
				else if(p.team=="Rajastan Royals")
				{
					rajastan++;
				}
			}
		}
		if(punjab>rajastan)
		{
			System.out.println("Punjab team has highest players from australia");
		}
		else
		{
			System.out.println("Rajatan team has highest players from australia");
		}
	}
}