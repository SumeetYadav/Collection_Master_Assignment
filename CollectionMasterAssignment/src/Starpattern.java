

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);;
	System.out.println("enter input to print pattern");
	int row=sc.nextInt();
	for(int i=0;i<=row;i++)
	{
		for(int j=row;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=0;k<i*2-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
