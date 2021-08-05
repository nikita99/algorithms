class Solution {
    public String longestCommonPrefix(String[] strs) {
        TrieNode data = new TrieNode();
        data = insertFirst(data, strs[0]);
        return prefix(data, strs);
    }
    
    class TrieNode{
        boolean isLastNode;
        TrieNode[] children;
        
        TrieNode(){
            isLastNode = false; 
            children = new TrieNode[26];
            for(int i=0; i<26; i++){
                children[i]= null;
            }
        }
        
    }
    
    TrieNode insertFirst(TrieNode root, String str){
            TrieNode temp = root;
            for(int i = 0; i<str.length(); i++){
                int index = str.charAt(i) - 'a';
                temp.children[index] = new TrieNode();
                temp = temp.children[index];
            }
            temp.isLastNode = true;
            return root;
        }
        
    String prefix(TrieNode root, String[] strs){
        String ans = strs[0];
        for(int ele = 1; ele<strs.length; ele++){       
            StringBuilder tstr = new StringBuilder();
            TrieNode temp = root;
            int i = 0;
            for(i=0; i<strs[ele].length() && temp.isLastNode != true; i++){
                int index = strs[ele].charAt(i) - 'a';
                if(temp.children[index] == null){
                    temp.isLastNode = true;
                    break;
                }else{
                    tstr.append(strs[ele].charAt(i));
                    // if(temp.children[index].isLastNode == true)
                    //     break;
                }
                temp = temp.children[index];
            }
            if(strs[ele].length() == i)
                temp.isLastNode = true;
            ans = tstr.toString();
        }
        return ans;
    }
        
}