package set6;

import java.util.Scanner;

public class togglecase {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	String b[]=s.split(" ");
	for(String d:b){
	char c[]=d.toCharArray();
	String a="";
	for(int i=0;i<d.length();i++){
		if(c[i]>='a' && c[i]<='z'){
		 a=a+Character.toString(c[i]).toUpperCase();
		}
		if(c[i]>='A' && c[i]<='Z'){
			a=a+Character.toString(c[i]).toLowerCase();	
		}
	}
	System.out.print(a+" ");
    }
}
}