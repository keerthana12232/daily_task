package test_output;
import java.util.Scanner;
public class Number3 {
	public static void main(String[] args) {
		System.out.println("Enter a String to check palindrome checker");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		char name[]=new char[word.length()];
		for(int i=0;i<name.length;i++)
		{
			name[i]=word.charAt(i);	
		}
		String Reversed="";
		for(int i=name.length-1;i>-1;i--)
		{
			Reversed+=""+name[i];	
		}
		System.out.println("Reversed Word "+Reversed);	
         }
}