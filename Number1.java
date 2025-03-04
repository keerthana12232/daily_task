package test_output;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		System.out.println("enter the number of values you are going to enter");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int array1[]=new int[val];
		for(int i=0;i<val;i++)
		{
			System.out.println("enter value "+(i+1));
			array1[i]=sc.nextInt();
		}
	        for(int i=0;i<val;i++)
		{
			System.out.print(array1[i]+",");
		}
		System.out.println();
		int array2[]=new int[val];
		for(int i=0;i<val;i++)
		{
			array2[i]=array1[i];
		}
		//[4,5,3,7,9];
		int temp=0;
		for(int i=0;i<val;i++)
		{
			for(int j=0;j<val;j++)
			{
				if(array2[i]<array2[j])
				{
					temp=array2[i];
					array2[i]=array2[j];
					array2[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<val;i++)
		{
			System.out.print(array2[i]+",");
		}
		
	}