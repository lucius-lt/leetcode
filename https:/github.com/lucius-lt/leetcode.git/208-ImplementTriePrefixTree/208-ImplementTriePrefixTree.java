// Last updated: 7/16/2026, 1:10:20 AM
 class Node{
        Node[] children;
        boolean flag;
        public Node(){//constructor -> special method that has name same as a class no return type no void it initializes an object
            children=new Node[26];
            flag=false;
        }
    }
class Trie {
    Node root;
   
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node node=root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null){
                node.children[index]=new Node();
            }
            node=node.children[index];
        }
        node.flag=true;
    }
    
    public boolean search(String word) {
        Node node=root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null) return false;
            node=node.children[index];
        }
        return node.flag;
    }
    
    public boolean startsWith(String prefix) {
        Node node =root;
        for(char c:prefix.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null){
                return false;
            }
            node=node.children[index];
        }
        return true;

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */