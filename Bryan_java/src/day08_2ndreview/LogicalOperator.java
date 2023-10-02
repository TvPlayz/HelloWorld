package day08_2ndreview;

public class LogicalOperator {

	public static void main(String[] args) {
		// NOT, AND, OR
		// !,   &&,  ||
		
		// only use with boolean value
		// return boolean
		
		// use to connect 2 or more boolean operator
		
		// shortcut 
		// for AND operator
		// if any of condition is false -> false
		System.out.println(false && true); // false
		// for OR operator
		// if any condition is true -> true
		System.out.println(true || false); // true

		
		System.out.println((true || (false && !true)));
		// precedence of operations
		// 1. !
		// 2. ()
		// 3. &&, ||
		// 4. always evaluate from left to right
		
		
		System.out.println(4 > 5 && 10 !=11);
	}

}
