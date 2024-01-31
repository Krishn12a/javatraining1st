package LamdaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data{
	String name;
	public Data(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
		
	}
	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Data> list=new ArrayList<Data>();
		list.add(new Data("krishna"));
		list.add(new Data("Dola"));
		list.add(new Data("Ak"));
		list.add(new Data("pradeep"));
		list.add(new Data("kishore"));
		
//		Collections.sort(list,(o1,o2)->o1.getname().compareTo(o2.getname()));
		
		Collections.sort(list,(o1,o2)->{
			if(o1.getname().length()<o2.getname().length()) {
				return -1;
			}
			
			else if(o1.getname().length()>o2.getname().length()) {
				return 1;
			}
			
			else {
			return 0;	
			}
			
		});
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		
//		for (Data temp : list) {
//			System.out.println(temp);
//		}
	}

}
