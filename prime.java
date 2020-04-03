import java.util.*;
import java.lang.*;
import java.io.*;
class Yukti
{
	public static void main(String arg[])	
	{
	int i,j,c,x;
	for(j=20;j<=100;j++)
	{
	c=0;
	x=(int)Math.sqrt(j);
	for(i=1;i<=x+1;i++)
	{
	   if(j%i==0)
	   c++;        
	}
	if(c==1)
	System.out.print(j+"  ");     
	}
	}
}
