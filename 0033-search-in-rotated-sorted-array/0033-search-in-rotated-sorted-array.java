class Solution {
    public int search(int[] nums, int target) {
        
//         int pivot=findpivot(nums,0,nums.length-1);
//         if(pivot==0)
//             return bsearch(nums,0,nums.length-1,target);
//         int idx1=bsearch(nums,0,pivot-1,target);
//         if(idx1!=-1)
//             return idx1;
//         int idx2=bsearch(nums,pivot,nums.length-1,target);
//             return idx2;
        
        
        int l=0,h=nums.length-1;
        while(l<=h)
        {
            
            int mid=l+(h-l)/2;
            
            if(nums[mid]==target)
                return mid;
            
            if(nums[mid]>=nums[l])
            {
                //left side is sorted check if it present it or not
                
                if(target>=nums[l]&&target<nums[mid])
                    h=mid-1;
                else
                    l=mid+1;
                
            }
            
            else
            {
                if(target<=nums[h]&&target>nums[mid])
                    l=mid+1;
                else
                    h=mid-1;
            }
            
        }
        return -1;
        
    }
    
    int bsearch(int[] nums,int l,int h,int target)
    {
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                h=mid-1;
            else
                l=mid+1;
                
        }
        return -1;
    }
    
    public int findpivot(int [] nums,int l , int  h)
    {
        while(l<h)
        {
            
            int mid =l+(h-l)/2;
            
            if(nums[mid]>=nums[0])
            {
                l=mid+1;
            }
            else
            {
                h=mid;
            }
        }
        return h;
        
    }
}