package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		dictionary.add();
		
		ArrayList<String> wordToSearch = new ArrayList<String>();
		wordToSearch.add("apple");
		wordToSearch.add("banana");
		wordToSearch.add("grape");
		wordToSearch.add("null");
		
		dictionary.serchMultiple(wordToSearch);
	}

}
