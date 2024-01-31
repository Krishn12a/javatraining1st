package practice;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedLi {
	public static void main(String[] args) {
		LinkedList<String> language=new LinkedList<String>();
		language.add("Python");
		language.add("C++");
		language.add("Java");
		language.add("React");
		
		System.out.println(language);
		language.set(3, "Angular");
		System.out.println(language);
//		language.remove();
		
//		language.remove(2);
		
		System.out.println(language.get(3));
		language.sort(null);
		language.sort(Comparator.reverseOrder());
		System.out.println(language);
//		language.clear();
		System.out.println(language);
		for (String string : language) {
			
		}
	}

}
