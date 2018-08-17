package set3;

import java.util.Scanner;

public class numericchk {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String a=in.next();
	int cnt=0;
	char c[]=a.toCharArray();
	for(int i=0;i<a.length();i++){
		if(c[i]>='0' && c[i]<='9' || c[i]=='.'){
			cnt++;
		}
	}
	if(cnt==a.length()){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
}
}
