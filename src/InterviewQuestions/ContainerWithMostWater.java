package InterviewQuestions;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        int maxArea = 0;
        while (a_pointer < b_pointer) {
            if (height[a_pointer] < height[b_pointer]) {
                maxArea = Math.max(maxArea, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            }
            else {
                maxArea = Math.max(maxArea, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }
        }
        return maxArea;
    }
}
