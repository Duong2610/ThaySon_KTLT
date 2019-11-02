//package luyentap3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test10 {
	static LinkedList<Integer>[] list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		list = new LinkedList[n+1];
		for(int i=1;i<=n;i++) {
			list[i] = new LinkedList<Integer>();
		}
		for(int i =1 ;i<=m;i++) {
			int q =in.nextInt();
			int k = in.nextInt();
			list[q].add(k);
			list[k].add(q);
		}
		for(int i=1;i<=n;i++) {
			int size = list[i].size();
			for(int j = 0;j<size;j++) {
				System.out.print(list[i].get(j) + " ");
			}
			System.out.println();
		}

	}

}
