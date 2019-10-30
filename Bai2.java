import java.util.*;
public class Bai2 {
	static int F[][]= new int[1001][1001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a,b;
		a=in.nextLine();
		b=in.nextLine();
		int n=a.length();
		int m=b.length();
		for(int i=0;i<=n;i++) F[i][0]=0;
		for(int i=0;i<=m;i++) F[0][i]=0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) F[i][j]=F[i-1][j-1]+1;
				else F[i][j]=Math.max(F[i][j-1], F[i-1][j]);
			}
		}
		System.out.println(F[n][m]);
	}

}
