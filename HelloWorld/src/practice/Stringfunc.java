package practice;

public class Stringfunc {
	public static void main(String[] args) {
		String type="Java programming";
		String spec="object oriented programming";
		String spec2=new String("stronglyType");
		System.out.println(type+" "+spec);
		System.out.println(type.length());
		System.out.println(type.concat(" ".concat(spec2).concat(" ".concat(type))));
		System.out.println(type.contains("programming"));
		System.out.println(type.substring(2,7));
		System.out.println(spec2.equalsIgnoreCase("Stronglytype"));
		String [] specs=spec.split(" ");
		System.out.println(specs);// we cannot print the array directly
		for (String str : specs) {
			System.out.println(str);
		}
		
		
		
		
	}
	
	

}
