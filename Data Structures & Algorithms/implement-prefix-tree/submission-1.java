class TrieNode{
    public Map<Character, TrieNode> children = new HashMap<>();
    public boolean isWord = false;
}
class PrefixTree {
    private TrieNode root;
    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currNode = root;
        char[] arr = word.toCharArray();
        for(char curChar : arr){
            if(currNode.children.containsKey(curChar) == false){
                currNode.children.put(curChar, new TrieNode()); 
            }
            currNode = currNode.children.get(curChar);
        }
        currNode.isWord = true;
    }

    public boolean search(String word) {
        TrieNode currNode = root;
        char[] arr = word.toCharArray();
        for(char curChar : arr){
            if(currNode.children.containsKey(curChar) == false){
                return false;
            }
            currNode = currNode.children.get(curChar);
        }
        return currNode.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode currNode = root;
        char[] arr = prefix.toCharArray();
        for(char curChar : arr){
            if(currNode.children.containsKey(curChar) == false){
                return false;
            }
            currNode = currNode.children.get(curChar);
        }
        return true;
    }
}
