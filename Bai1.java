import java.util.*;
public class Bai1 {
	static int F[][]= new int[101][25001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int c= in.nextInt();
		int n=in.nextInt();
		int a[]= new int[25001];
		for(int i=1;i<=n;i++) {
			a[i]=in.nextInt();
		}
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=c;j++) {
				F[i][j]=F[i-1][j];
				if(a[i]<=j) F[i][j]= Math.max(F[i-1][j], F[i-1][j-a[i]]+a[i]);
			}
		}
		System.out.println(F[n][c]);
	}

}
