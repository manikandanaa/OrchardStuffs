package compatabilitiy;

import java.util.Scanner;

public class spade 
{
public static void main(String args[])
{
	int num=1;
	int den=1;
	int i,j;
	float probability;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(i=13,j=52;i>13-n;i--,j--)
	{
		num=num*i;
		den=den*j;
	
	}
	System.out.println(num+"/"+den);
	probability=findgcd(num,den);
	System.out.println("the probability:"+ probability);
}

 static int findgcd(int num, int den) {
	if(den==0){
		return num;
	}
	return findgcd(den,num%den);
}
}
