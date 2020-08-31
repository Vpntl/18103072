mport java.util.*;
public class q2 {

public static void main(String[] args) {
		int n=Integer.MAX_VALUE;
		long s=0;
		
		//System.out.println(n);
		for(int i=n;i>=1;i--)
		{
			s=i*i;
			long t=(i*(i+1))/2;
			if(s==t)
			{System.out.println(i);break;}
		}
		
	}
}
