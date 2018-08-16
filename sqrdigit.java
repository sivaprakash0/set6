import java.util.Scanner;
public class sqrdigit {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String no=in.next();
	char c[]=no.toCharArray();
	int sum=0;
	for(int i=0;i<no.length();i++){
		sum=sum+(c[i]-48)*(c[i]-48);
	}
	System.out.println(sum);
}
}
