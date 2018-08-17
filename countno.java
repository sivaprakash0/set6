import java.util.Scanner;
public class countno {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char c[]=s.toCharArray();
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if(c[i]>='0' && c[i]<='9'){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
