package janani;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter the number");
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
//for(int i=1;i<=10;i++){
	if(n%2==0){
		System.out.println(n);
	}
	else{
		System.out.print(n-1);
	}
	
}
	}


