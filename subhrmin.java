package set3;

import java.util.Scanner;

public class subhrmin {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
			int e=Math.abs(a-c);
			int f=Math.abs(b-d);
			System.out.println(e+" "+f);
	}
}
