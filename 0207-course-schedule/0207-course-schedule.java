class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        //create the graph adj list
        int n=numCourses;
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
       // System.out.println(adj);

        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];

            adj.get(v).add(u);

        }
         //System.out.println(adj);
        //create indegree

        int [] indegree=new int[n];

        for(int i=0;i<n;i++)
        {
            for(int it:adj.get(i))
            {
                indegree[it]++;

            }
        }

        

        Queue<Integer> q=new LinkedList<>();
        //add nodes which have indegree 0

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
               
            }
        }

        

        int count=0;
        while(!q.isEmpty())
        {
            Integer node=q.remove();
            count++;
           // System.out.println("node="+node);
             for(int it:adj.get(node))
                {
                    indegree[it]--;
                    if(indegree[it]==0)
                    {
                        q.add(it);
                    }
                }
                     
        }

        

       if(count==numCourses)
        return true;

        return false;


        
    }
}