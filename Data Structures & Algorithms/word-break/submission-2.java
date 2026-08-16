class TrieNode
{
    HashMap<Character, TrieNode> children;
    boolean isCompletedWord;
    public TrieNode()
    {
        children = new HashMap<>();
        isCompletedWord = false;
    }
}
class Solution {
    TrieNode root = new TrieNode();
    public boolean wordBreak(String s, List<String> wordDict) {
        for(String word : wordDict)
        {
            insert(word);
        }
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[n] = true;
        int maxLen = 0;
        for(String word : wordDict)
        {
            maxLen = Math.max(maxLen, word.length());
        }
        for(int i = n - 1; i >= 0; i--)
        {
            for(int j = i; j < Math.min(n, i + maxLen); j++)
            {
                if(search(s, i, j))
                {
                    dp[i] = dp[j + 1];
                    if(dp[i])
                    {
                        break;
                    }
                }
            }
        }
        return dp[0];
    }
    public void insert(String word)
    {
        TrieNode node = root;
        for(char ch : word.toCharArray())
        {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isCompletedWord = true;
    }
    public boolean search (String s, int i, int j )
    {
        TrieNode node = root;
        for(int idx = i; idx <= j; idx++)
        {
            if(!node.children.containsKey(s.charAt(idx)))
            {
                return false;
            }
            node = node.children.get(s.charAt(idx));
        }
        return node.isCompletedWord;
    }
}
