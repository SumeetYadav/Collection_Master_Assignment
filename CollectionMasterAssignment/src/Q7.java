/*Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)*/
import java.util.*;
class Theatre
{
	int Theatreid;
	String Theatrename;
	String location;
	Movie m;
	public Theatre(int theatreid, String theatrename, String location, Movie m) 
	{
		super();
		Theatreid = theatreid;
		Theatrename = theatrename;
		this.location = location;
		this.m = m;
	}
	@Override
	public String toString() 
	{
		return "Theatre [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location + ", m="
				+ m + "]";
	}
	
}
class Movie
{
	int Movieid;
	String Moviename;
	float rating;
	public Movie(int movieid, String moviename, float rating)
	{
		super();
		Movieid = movieid;
		Moviename = moviename;
		this.rating = rating;
	}
	@Override
	public String toString() 
	{
		return "Movie [Movieid=" + Movieid + ", Moviename=" + Moviename + ", rating=" + rating + "]";
	}
	
}
class TheaterComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Theatre t1=(Theatre) o1;
		Theatre t2=(Theatre) o2;
		if(t1.m.rating==t2.m.rating)
		{
			return t1.Theatrename.compareTo(t2.Theatrename);
		}
		else if(t1.m.rating>t2.m.rating)
		{
			return 1;
		}
		else
			return -1;
	}
	
}
public class Q7
{
	public static void main(String[] args) 
	{
		ArrayList<Theatre>t=new ArrayList<>();
		ArrayList<Movie>m=new ArrayList<>();
		t.add(new Theatre(1,"Inox","pune",new Movie(1017,"Avengers",4.7f)));
		t.add(new Theatre(2,"PVR","pune",new Movie(1019,"Farzand",4.8f)));
		t.add(new Theatre(3,"Parvati","kolhapur",new Movie(1020,"Natsamrath",4.6f)));
		t.add(new Theatre(4,"Mangala","pune",new Movie(1012,"Phir Hera pheri",4.6f)));
		
		System.out.println(t);
		
		Collections.sort(t,new TheaterComparator());
		System.out.println(t);
	}
}