import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SerachEelement {

    public static void main(String[] args) {
        System.out.println(Search(80));

    }

    public static int Search(int target) {
        int[] numes = {7,1,6,3};
        int result = Arrays.binarySearch(numes, target);
        return (result < 0) ? -1 : result ;
    }
}
