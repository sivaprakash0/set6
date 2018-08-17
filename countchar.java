import java.util.Scanner;
public class countchar {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	char c[]=s.toCharArray();
	int cnt=0;
	for(int i=0;i<s.length();i++){
		if(c[i]!=' '){
			cnt++;
		}
	}
	System.out.println(cnt);
}
}
