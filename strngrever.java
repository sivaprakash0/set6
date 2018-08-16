package set6;

import java.util.Scanner;

public class strngrever {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	String a=new StringBuffer(s).reverse().toString();
	System.out.println(a);
}
}
