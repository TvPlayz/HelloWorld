package day14_StringDay2;

public class NumberToString {

	public static void main(String[] args) {
		
		int num = 123;
		int num2 = 456;
		
		System.out.println(num + num2); //
		
		String str1 = ""+num;
		String str2 = ""+num2;
		
		System.out.println(str1.length()); // 3
		System.out.println(str1.charAt(1)); // 2
		
		System.out.println(str1+str2); // 123456
		
		double price = 9.99;
		
		String str3 = ""+price;
		
		System.out.println(str3);
		System.out.println(str3.length());
		System.out.println(str3.charAt(1));
		
		
		
		
		///
		
		System.out.println(String.valueOf(price));
		
		System.out.println(String.valueOf(price).substring(2)); // 99
		
		/* primitive	Wrapper Class
		 * char			Character
		 * int			Integer
		 * byte			Byte
		 * short		Short
		 * long			Long
		 * float		FLoat
		 * double		Double
		 * boolean		Boolean
		 */
		
		String strPrice = Double.toString(price);
		
		System.out.println(strPrice);
		
		System.out.println(strPrice.substring(2)); // 99
		
		String strNum = Integer.toString(num);
		
		System.out.println(strNum); // 123
		
		System.out.println(strNum.charAt(2)); // 3
		
		System.out.println(strNum.length()); // 3
		
		System.out.println(strNum.charAt(strNum.length()-1));
		
		int num3 = 123456780;
		
		String strNum3 = Integer.toString(num3);
		
		System.out.println(strNum3.charAt(8)); // 0
		
		System.out.println(strNum3.length());
		
		System.out.println(strNum3.charAt(strNum3.length()-1));
		
		
				
		
		

	}

}
