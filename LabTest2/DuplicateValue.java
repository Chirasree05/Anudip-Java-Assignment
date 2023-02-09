package LabTest2;
import java.util.Scanner;
public class DuplicateValue {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		//enter the number of string
		System.out.println("Enter the number of words: ");
		n=sc.nextInt();
		String[] s=new String[n];
		//enter the strings
		System.out.println("Enter those strings: ");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		//print the duplicate value
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s[i].equals(s[j]) && (i!=j))
					System.out.println("Duplicate value is: "+s[j]);
			}
		}				
	}

}
