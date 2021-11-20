package BinaryTree;

public class UniqueBinarySearchTree {

    public static void main(String[] args) {
        System.out.println(numTrees(7));
    }

    public static int numTrees(int n) {
        int n1, n2, sum = 0;
        if (n == 1 || n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            n1 = numTrees(i - 1);
            n2 = numTrees(n - i);
            sum += n1 * n2;
        }
        return sum;
    }

    public static int factorial(int i) {
        if (i < 1) {
            return 1;
        }
        return i * factorial(i -1);
    }

    public int numTreesCatlan(int n) {
        int Cn = 0;
        for(int i = 0; i<=n; i++) {
            Cn = (int) ((fact(2*i))/(fact(i+1)*fact(i)));
        }
        return Cn;
    }

    public static long fact(int i) {
        if(i <= 1) {
            return 1;
        }
        return i * fact(i - 1);
    }
}


//CatalanNumber

//CatalanNumber = 2n!/(n+1)!n!
