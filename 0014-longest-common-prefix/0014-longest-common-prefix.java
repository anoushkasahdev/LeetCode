class Solution {
    public class Node
    {
        Node [] children;

        public Node()
        {
            this.children=new Node[26];
        }
    }
    Node root=new Node();
    public String longestCommonPrefix(String[] strs) {
        //using Trie DS
        int ans=strs[0].length();

        insert(strs[0]);

        for(int i=1;i<strs.length;i++)
        {
            ans=Math.min(ans,search(strs[i]));
        }

        return strs[0].substring(0,ans);
        
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

    }

    public int search(String word)
    {
        int len=0;
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';

            if(curr.children[idx]!=null)
            {
                len++;
                curr=curr.children[idx];
            }
            else
            break;
        }

        return len;
    }
}