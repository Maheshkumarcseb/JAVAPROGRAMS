public class ContaineerMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int n= height.length;
        int max =helper(height,n);
        System.out.println(max);

    }
    static int helper(int[] height, int n)
    {
        int i=0;
        int j=n-1;
        int max=0,area=0;
        while(i<j)
        {
            area=Math.min(height[i], height[j])*(j-i);
            max=Math.max(area,max);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
