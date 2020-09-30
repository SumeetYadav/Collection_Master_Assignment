		/*    There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
	      Book { int bookid , String author , float price } 
	      There is also a hashmap which contains information about business done by each book.
	      Map<int bookid , float amount> Map already has information about all books and business
	      done till now. You can take hardcoded values in map. Write a program to update map using
	      new information in given array. If book is present in map calculate its business amount (price*
	      copiessold) and add to existing amount in map. If book is not present add its entry in map.           */


import java.util.*;
class BookSale
{
	int copiesSold;
	Book b;
	public BookSale(int copiesSold, Book b) 
	{
		super();
		this.copiesSold = copiesSold;
		this.b = b;
	}
	@Override
	public String toString() 
	{
		return "BookSale [copiesSold=" + copiesSold + ", b=" + b + "]";
	}
}
class Book
{
	int bookid;
	String author;
	float price;
	public Book(int bookid, String author, float price) 
	{
		super();
		this.bookid = bookid;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Book [bookid=" + bookid + ", author=" + author + ", price=" + price + "]";
	}
}
public class Q1 
{
	public static void main(String[] args) 
	{
		ArrayList<BookSale> al=new ArrayList<>();
		al.add(new BookSale(5,new Book(1,"Zero To One",5f)));
		al.add(new BookSale(2,new Book(2,"Invisible Man",10f)));
		al.add(new BookSale(9,new Book(3,"A Passage to India",20f)));
		al.add(new BookSale(3,new Book(4,"Believe in Yourself",25f)));
		
		//System.out.println(al);		
		
		HashMap<Integer,Float>hm=new HashMap<>();
		hm.put(1,50f);
		hm.put(2,10f);
		hm.put(3,0f);
		//hm.put(4,50f);
		
		System.out.println(hm);
		int key;
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			BookSale b1=(BookSale) itr.next();
			key=b1.b.bookid;
			
			if(	hm.containsKey(key))
			{
				hm.put(key ,  hm.get(key)   +  b1.b.price   *  b1.copiesSold);
			}
			else
			{
				hm.put(b1.b.bookid  , b1.b.price  *   b1.copiesSold);
			}
		}
		System.out.println(hm);
	}
}