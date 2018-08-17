import java.util.Scanner;
public class printhourmint {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	if(a>60){
		int b=a/60;
		System.out.println((a/60)+" "+(a%60));
	}
	else{
		System.out.println("0 "+a);
	}
}
}
