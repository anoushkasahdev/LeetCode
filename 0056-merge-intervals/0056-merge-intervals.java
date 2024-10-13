class Solution {
    public int[][] merge(int[][] intervals) {

        List<List<Integer>> ans=new ArrayList<List<Integer>>();

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        ans.add(Arrays.asList(intervals[0][0],intervals[0][1]));

        for(int i=1;i<intervals.length;i++)
        {
            if(ans.get(ans.size()-1).get(1)>=intervals[i][0])
            {
                ans.get(ans.size()-1).set(1,Math.max(intervals[i][1],ans.get(ans.size()-1).get(1)));
            }
        
            else
            {
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
        }

        int [][]merged=new int[ans.size()][2];
        
        for(int i=0;i<ans.size();i++)
        {
            merged[i][0]=ans.get(i).get(0);
            merged[i][1]=ans.get(i).get(1);
            
        }

        return merged;
    }
}