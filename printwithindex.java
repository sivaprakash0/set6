import java.util.Arrays;
import java.util.Scanner;
public class printwithindex {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<a;i++){
			ar[i]=in.nextInt();
		 }
		for(int i=0;i<a;i++){
			System.out.println(ar[i]+" "+i);
		 }	
	}
}
