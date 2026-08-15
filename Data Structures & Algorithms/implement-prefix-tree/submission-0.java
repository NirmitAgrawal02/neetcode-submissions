public class TrieNode
{
    TrieNode[] children = new TrieNode[26];
    boolean endofWord = false;
}
class PrefixTree {
    private TrieNode root;
    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray())
        {
            int i = c - 'a';
            if(curr.children[i] == null)
            {
                curr.children[i] = new TrieNode();
            }
            curr = curr.children[i];
        }
        curr.endofWord = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray())
        {
            int i = c - 'a';
            if(curr.children[i] == null)
            {
                return false;
            }
            curr = curr.children[i];
        }
        return curr.endofWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char pre : prefix.toCharArray())
        {
            int i = pre - 'a';
            if(curr.children[i] == null)
            {
                return false;
            }
            curr = curr.children[i];
        }
        return true;
    }
}
