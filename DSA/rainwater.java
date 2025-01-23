package DSA;

public class rainwater {
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        int n = height.length;
        //left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i<n ;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int j = n-2;j>=0 ;j--){
            rightMax[j] = Math.max(height[j],rightMax[j+1]);
        }
        //water level(min(left max , right max))
        int trappedWater = 0;
        for (int i = 0 ; i<n ; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trapped water(water level - height)
            trappedWater = trappedWater + waterLevel - height[i];
        }
        System.out.println("Trapped water: " + trappedWater);
    }
}
