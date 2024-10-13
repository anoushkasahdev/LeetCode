class Solution {
    public int mostBooked(int n, int[][] meetings) {
        
        long endTime[] = new long[n];
        int count[] = new int[n];

        Arrays.sort(meetings,(a,b)->a[0]-b[0]);

        for(int i=0;i<meetings.length;i++)
        {
            int start=meetings[i][0];
            int end=meetings[i][1];

            boolean flag=false;

            long min=Long.MAX_VALUE;

            int minIndex=-1;

            for(int j=0;j<n;j++)
            {
                if(endTime[j]<min)
                {
                    min=endTime[j];
                    minIndex=j;
                }
                if(endTime[j]<=start)
                {
                    endTime[j]=end;
                    count[j]++;
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
             count[minIndex]++;
             endTime[minIndex]+=end-start;
            }                         
            
        }

        int max=Integer.MIN_VALUE;
        int ans=-1;

        for(int i=0;i<n;i++)
        {
            if(count[i]>max)
            {
                max=count[i];
                ans=i;
            }
        }

        return ans;
    }
}