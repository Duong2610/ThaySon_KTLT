package tuan3;

import java.util.*;
public class bai17 {

    static LinkedList<Integer> dsKe[];
    static int t,n,m,u;
    static boolean chuaXet[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            m = sc.nextInt();
            u = sc.nextInt();
            dsKe = new LinkedList[n+1];
            for(int i = 1; i <=n ;i++)
                dsKe[i] = new LinkedList<Integer>();
            for(int i = 0; i < m; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                dsKe[a].add(b);
                dsKe[b].add(a);
            }
//            for(int i = 1; i <= n ; i++){
//                Collections.sort(dsKe[i]);
//            }
            BFS(u);
//            print();
        }
        
    }

    public static void BFS(int s) {
        chuaXet = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            chuaXet[i] = true;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaXet[s]= false;
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s+ " ");
            for (int i : dsKe[s]) {
                if (chuaXet[i]) {
//                    System.out.println("i : " + i);
                    queue.add(i);
                    chuaXet[i] = false;
                }
            }
        }
        System.out.println();
//        for(int i =1 ; i <= n; i++)
//            System.out.println(chuaXet[i]);
    }

    public static void print() {
        for (int i = 1; i <= n; i++) {
            System.out.print("tai " + i + ": ");
            for (int j : dsKe[i]) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
}
