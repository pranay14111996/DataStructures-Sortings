package com.mypractice.tries;

import java.util.ArrayList;
import java.util.List;

public class TrieUtils {

	public void insert(TrieNode root, String word) {
		int length = word.length();
		
		TrieNode temp = root;int i ;
		
		for(i = 0 ; i < length;i++) {
			int index = word.charAt(i) - 'a';
			if(null == temp.nodes[index] ) {
				temp.nodes[index] = new TrieNode();
			}
				temp = temp.nodes[index];
		}
		temp.endOfWord = true;
	}
	
	public TrieNode search(TrieNode root, String word) {
		int length = word.length();
		
		TrieNode temp = root; int i;
		for(i = 0 ; i < length ; i++) {
			int index = word.charAt(i) - 'a';
			if(null == temp.nodes[index]) {
				return null;
			}
			temp = temp.nodes[index];
		}
		return temp.endOfWord ? temp:null;
		
	}
	
	static List<String> wordsList = new ArrayList<>();
	
	public TrieNode getLastNode(TrieNode root, String start) {
		if(root == null)
			return null;
		for( int i = 0 ; i < start.length();i++ ) {
			if(null != root.nodes[i]) {
				root = root.nodes[i];
			}
		}
		return root;
	} 
	
	public void getAllWordsStartingWith(TrieNode root,String start) {
		
		if(root == null) {
			return;
		}
		if( root.endOfWord ) {
			wordsList.add(start);
		}
		for(int i = 0 ; i < 26 ;i++) {
			if(null!=root.nodes[i]) {
				start = start.concat(Character.toString((char)(i+'a')));
				getAllWordsStartingWith(root.nodes[i],start);
			}
		}
	}
	
	
	public static void main(String[] args) {
		TrieUtils tu = new TrieUtils();
		TrieNode root = new TrieNode();

		tu.insert(root, "abc");
		tu.insert(root, "abcd");
		tu.insert(root, "abcdefg");
		System.out.println(tu.search(root, "abc"));
		tu.getAllWordsStartingWith(tu.getLastNode(root, "ab"), "ab");
		System.out.println(wordsList);
 
	}

}
