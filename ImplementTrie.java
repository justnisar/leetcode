class TrieNode{
    // Initialize your data structure here.
    int value;
    TrieNode child[];
    public TrieNode(){
        value = 0;
        child = new TrieNode[26];
        for(int i = 0 ; i < 26 ; i++)
            child[i] = null;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public int getindex(char ch){
        return ch - 97;
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode current = root;
        int length = word.length();
        for(int i = 0 ; i < length ; i++){
            int index = getindex(word.charAt(i));
            
            if(current.child[index] == null){
                TrieNode x = new TrieNode();
                current.child[index] = x;
            }
            
            current = current.child[index];
        }
        current.value = 1;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode current = root;
        int length = word.length();
        for(int i = 0 ; i < length ; i++){
            int index = getindex(word.charAt(i));
            if(current.child[index] == null)
                return false;
            current = current.child[index];
        }
        if(current.value == 1)
            return true;
        return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        int length = prefix.length();
        for(int i = 0 ; i < length ; i++){
            int index = getindex(prefix.charAt(i));
            if(current.child[index] == null)
                return false;
            current = current.child[index];
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
