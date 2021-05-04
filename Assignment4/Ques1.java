package DoubtSession.Assignment4;

public class Ques1 {
    public static void main(String[] args) {
        int n = 8;
        res(0,0, n);
    }

    public static void res(int i, int j, int n){
        if (i==n){
            return;
        }
        if (j>i){
            return;
        }
        System.out.print(nCr(i, j)+" ");
        res(i, j+1, n);

        if(j==0){
            System.out.println();
            res(i+1, 0, n);
        }

    }

    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}
