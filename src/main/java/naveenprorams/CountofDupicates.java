package naveenprorams;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountofDupicates {
public static void main(String[] args) {
	findduplicates("manimanimani");
	
}
public static void findduplicates(String inputstring)
{
	String words[]=inputstring.split(" ");
	Map<String,Integer> wordcount=new HashMap<String,Integer>();
	for(String word:words){
		if(wordcount.containsKey(word)){
			wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
		}
		else
		{
			wordcount.put(word, 1);
		}
		
	}
	
	Set<String> wordsinstring=wordcount.keySet();
	for(String word:wordsinstring)
	{
		if(wordcount.get(word)>1){
			System.out.print(word +" : "+wordcount.get(word));
		}
	}
	}
}

