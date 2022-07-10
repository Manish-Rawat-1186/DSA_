package com.company;

public class sqrt  {
    public static void main(String[] args) {

    }
    // every squre root never greater then his half's squre.
    public int mySqrt(int x) {
        // using binary search
        int start = 0;
        int end = x;
        while (start <= end ){
            int mid = start + (end -start)/2;
            //we x/mid > mid to save the memory
            if (x/mid> mid){
                start = mid + 1;
            }else if (x < mid*mid){
                end = end - 1;
            }else {
                return end;
            }
        }
        return -1;
    }

}
