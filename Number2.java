package test_output;
import java.util.Scanner;
public class Number2 {
public static void main(String[] args) {
	System.out.println("enter a String");
	Scanner sc=new Scanner(System.in);
	String word=sc.nextLine();
	char myword[]=new char[word.length()];
	for(int i=0;i<word.length();i++)
	{
		myword[i]=word.charAt(i);			
	}
	System.out.println("Original word");
    for(char x:myword)
    {
    	System.out.print(x);	
    }
    System.out.println("\nreversed word");
    char revmyword[]=new char[myword.length];
   int num=myword.length-1;
    for(char x:myword)
    {
    	revmyword[num]=x;
    	num--;
    } 
    for(char x:revmyword)
    {
    	System.out.print(x);	
    }
    System.out.println();
    System.out.println("length of the string ="+revmyword.length);
    int l=revmyword.length;
    String len=l+"";
    String myfinal="";
    for(int i=0;i<revmyword.length;i++)
    {	
    	myfinal+=revmyword[i];
    }
    myfinal=myfinal.concat(len); 
    System.out.println("string concatinated "+myfinal);
    int checkprime=myfinal.length()+l;
    System.out.println("old length "+l);
    System.out.println("new length "+myfinal.length());
    System.out.println("Total length "+checkprime);
    int count=0;
    for(int i=2;i<=checkprime;i++)
    {
      if(checkprime%i==0)
      {
    	count++;
      }
    }
    if(count>1)
    {
    	System.out.println("Given Number is Not a prime");
    }
    else
    {
    	System.out.println("Given Number is a Prime");
    }
}
}