class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> ans=new ArrayList<>();

        int low=0;
        int high=arr.length-k;

        while(low<high)
        {
            int mid=low+(high-low)/2;
            System.out.println("mid="+mid);

            if(x-arr[mid]>arr[mid+k]-x)
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }

        System.out.println("low="+low);


        for(int i=low;i<low+k;i++)
        {
            ans.add(arr[i]);
        }

        return ans;
        
    }
}