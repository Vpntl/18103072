import java.util.*;
public class Main{
    public static void main(String[] args){
        int n=1;
        long sum = 1;
        while(n<Integer.MAX_VALUE){
            if(sum==n*n){
                System.out.println("Answer: "+n);
            }
            n+=1;
            sum+=n;
        }
        System.out.println("Last checked value\n n=" +n+" sum="+sum );
    }
}
