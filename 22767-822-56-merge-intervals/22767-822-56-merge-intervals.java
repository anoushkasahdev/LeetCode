class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> ans=new ArrayList<>();

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        ans.add(new int[]{intervals[0][0],intervals[0][1]});

        for(int i=1;i<intervals.length;i++)
        {
            int lastEle[]=ans.get(ans.size()-1);
            if(intervals[i][0] <= lastEle[1])
            {
               ans.get(ans.size()-1)[1]=Math.max(intervals[i][1],lastEle[1]);
            }
            else
            {
                ans.add(new int[]{intervals[i][0],intervals[i][1]});


            }
        }

        int merged[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            merged[i][0]=ans.get(i)[0];
            merged[i][1]=ans.get(i)[1];
        }
        return merged;
        
    }
}