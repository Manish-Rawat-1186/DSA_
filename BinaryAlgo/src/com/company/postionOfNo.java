package com.company;

public class postionOfNo {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int sIndex = search(nums, target, true);
        int eIndex = search(nums, target, false);

        ans[0] = sIndex;
        ans[1] = eIndex;

        return ans;

    }

    int search(int[] nums, int target, boolean findStart){

        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end ){
            int mid = start + (end - start )/2;

            if (nums[mid] == target){
                //potential ans
                ans = mid;
                if (findStart){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }

            if (nums[mid] > target){
                end = mid - 1;
            }else if (nums[mid] < target){
                start = mid + 1;
            }
        }
        return ans;

}
}
