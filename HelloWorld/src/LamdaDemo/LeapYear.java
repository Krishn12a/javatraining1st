package LamdaDemo;

import java.util.function.IntPredicate;

public class LeapYear {
	public static void main(String[] args) {
		IntPredicate divideby4=value->value%4==0;
		IntPredicate divideby100=value->value%100!=0;
		IntPredicate divideby400=value->value%400==0;
		System.out.println((divideby4).and(divideby100).or(divideby400).test(1900));
	}

}
