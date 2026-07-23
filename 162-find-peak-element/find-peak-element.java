class Solution {
    public int findPeakElement(int[] nums) {
        // if(nums.length == 1){
        //     return 0;
        // }

        // if(nums[0] > nums[1]){
        //     return 0;
        // }

        // for(int i=1; i < nums.length ; i++ ){
        //     if(i != nums.length -1){
        //         if( (nums[i] > nums[i-1] ) && (nums[i] > nums[i+1]) ){
        //             return i;
        //         }
        //     }else if(nums[i] > nums[i-1]){
        //         return i;
        //     }

        // }

        // return 0;

        // Method-2
       if(nums.length == 1) return 0; // single element
        
        int n = nums.length;
        
		// check if 0th/n-1th index is the peak element
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
		
		// search in the remaining array
        int start = 1;
        int end = n-2;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid] < nums[mid-1]) end = mid - 1;
            else if(nums[mid] < nums[mid+1]) start = mid + 1;
        }
        return -1; // dummy return statement
        
    }
}