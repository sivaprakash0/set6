import java.util.Arrays;
import java.util.Scanner;
public class medianno {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a<=1000 && a>=1){
		int ar[]=new int[a];
		for(int i=0;i<a;i++){
			ar[i]=in.nextInt();
		}
		Arrays.sort(ar);
		if(a%2!=0){
		System.out.print(ar[a/2]);
		}
		else{
			int b=a/2;
			System.out.println(ar[b-1]+ar[b]);
		}
	}
  }
}
