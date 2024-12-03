class Solution {
    public class Node
    {
        Node[] children;
        boolean isEnd;

        public Node()
        {
            this.children=new Node[26];
            this.isEnd=false;
        }
    }
    Node root=new Node();
    public boolean wordBreak(String s, List<String> wordDict) {

        int n=wordDict.size();

        for(int i=0;i<n;i++)
        {
            insert(wordDict.get(i));
        }

        int len=s.length();

        boolean arr[]=new boolean[len+1];

        arr[0]=true;

        for(int j=1;j<=len;j++)
        {
            for(int i=0;i<j;i++)
            {
                if(search(s,i,j-1) && arr[i]==true)
                {
                    arr[j]=true;
                    //break;
                }
            }
        }

        return arr[len];       
    }

    public void insert(String word)
    {
        Node curr=root;

        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';

            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }

            curr=curr.children[idx];
        }
        curr.isEnd=true;

    }

    public boolean search(String s,int start,int end)
    {
        Node curr=root;

        for(int i=start;i<=end;i++)
        {
            int idx=s.charAt(i)-'a';

            if(curr.children[idx]==null)
            {
                return false;
            }

            curr=curr.children[idx];
        }

        return curr.isEnd==true;
    }
}