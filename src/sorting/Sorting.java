class Sorting{
    public void mergeSort(int[] nums){
        int[] temp = new int[nums.length];
        mergeSort(nums,temp, 0, nums.length-1);
    }
    
    public void mergeSort(int[] nums,int[]temp, int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(nums,temp, left, mid);
            mergeSort(nums,temp,mid+1, right);
            merge(nums,temp, left,mid,right);
        }
    }
    
    private void merge(int[] nums,int[]temp,int left, int mid, int right){
        int firstStart = left;
        int firstEnd = mid; 
        int secondStart = mid+1;
        int secondEnd = right;
        int size = right-left+1;
        int k = left;
        while(firstStart<=firstEnd && secondStart<=secondEnd){
            temp[k++] = nums[firstStart] < nums[secondStart] ? nums[firstStart++] : nums[secondStart++];
        }
        
        while(firstStart<=firstEnd){
            temp[k++] = nums[firstStart++];
        }
        while(secondStart<=secondEnd){
            temp[k++] = nums[secondStart++];
        }
        for(int i=0;i<size;i++){
            nums[right] = temp[right];
	    right--;
        }
    }
    
    public static void main(String args[]){
        int[] nums = {5,6,3,1,2,9,0};
        Sorting s = new Sorting();
        System.out.println("Before sorting");
        display(nums);
        s.mergeSort(nums);
        System.out.println("After sorting");
        display(nums);
        
    }
    
    public static void display(int[] nums){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
