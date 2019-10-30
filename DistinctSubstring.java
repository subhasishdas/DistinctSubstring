import java.util.*;
public class DistinctSubstring {
    static public int ls(String a) {
        int mxln = -1;
        int k = 0;
        int tsrt = 0;
        int[] ar = new int[128];
        Arrays.fill(ar, -1);
        for(char c : a.toCharArray()){
            int iIndex = (int)c;
            if(ar[iIndex]!=-1){
                for(int i = tsrt;i<ar[iIndex];i++){
                    ar[(int)a.charAt(i)] = -1;
                }
                mxln = Math.max(mxln, k-tsrt);
                tsrt = ar[iIndex]+1;
                
            }
            ar[iIndex] = k++;
        }
        mxln = Math.max(mxln, k-tsrt);
        return mxln;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(ls(s));

    }
}
