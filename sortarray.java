import java.util.Arrays;
import java.util.Scanner;
public class sortarray {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a<=1000 && a>=1){
		int ar[]=new int[a];
		for(int i=0;i<a;i++){
			ar[i]=in.nextInt();
		}
		Arrays.sort(ar);
		for(int i=0;i<a;i++){
		System.out.print(ar[i]+" ");
		}
	}
  }
}
