package set4;

import java.util.Scanner;

public class countwords {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String c[]=s.split(" ");
		int cnt=0;
		for(String a:c){
				cnt++;
		}
		System.out.println(cnt);
	}
}
