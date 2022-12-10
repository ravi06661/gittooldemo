import java.io.*;
import java.util.*;

class Test{

	public static int countDigit(int num){
	int c=0;
		while(num!=0)
		{
			c++;
			num=num/10;
		}
		return c;
   }

   	public static int doPower(int a,int b){
   	int mul=1;
	   	while(b!=0)
	   	{
	   		mul=mul*a;
	   		b--;
	   	}
 		return mul;
	}
  
 	public static boolean isArmstrong(int num)
	{
  		int rem,sum=0,count=countDigit(num),power,temp=num;

        while(num!=0)
        {
        	rem=num%10;
        	power=doPower(rem,count);
        	sum=sum+power;
        	num=num/10;
        }
        if(sum==temp)
        	return true;
        return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int max=0,sum;

		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=i;j<arr.length;j++)
				{
					if(sum==0)
						sum=arr[j]-48;
					else
						sum=sum*10+(arr[j]-48);

					if(isArmstrong(sum)&&sum>max)
						max=sum;
				}
		}

			System.out.println(max);

	}
}