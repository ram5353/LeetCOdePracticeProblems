package ContestQuestions;

public class CountGoodTriplets {
    public static void main(String[] args) {
        Triplets obj = new Triplets();
        System.out.println(obj.goodTriplets(7,2,3));
    }
}

class Triplets {

    public int goodTriplets(int a, int b, int c) {
        int[] arr = {3,0,1,1,9,7};
        int count = 0;
        for (int i =0;i < arr.length-2; i++) {
            for (int j = i+1;j < arr.length-1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k <arr.length;k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
