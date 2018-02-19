
public class Trie {

	  private TrieNode root;
	  
	  public Trie(){
		  root  = new TrieNode();
	  }
	  
	  public void insert(String word){
		  TrieNode node = root;
		  for(int i = 0; i < word.length(); i++){
			  char currentchar = word.charAt(i);
			  if(!node.containsKey(currentchar)){
				  node.put(currentchar, new TrieNode());
			  }
			  node = node.get(currentchar);
		  }
		  node.setEnd();
	  }
	  
	  //search a prefix or whole key in a trie
	  //return the node where the search ends
	  
	  private TrieNode searchPrefix( String word){
		  TrieNode node = root;
		  for(int i = 0; i < word.length(); i++){
			  char currentLetter = word.charAt(i);
			  if(node.containsKey(currentLetter)){
				  node = node.get(currentLetter);
			  }
			  else{
				  return null;
			  }
		  }
		  return node;
	}
	  
	  
	//return if the word is in the trie
	  public boolean search(String word){
		  TrieNode = searchPrefix(word);
		  return node!=null &&  node.isEnd();
	  }
	  
	  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
