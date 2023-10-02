package day14_StringDay2;

public class String_Replace {

	public static void main(String[] args) {
		
		String str = "CAR";
		
		System.out.println(str);
		
		String str2 = str.replace('R', 't');
		
		System.out.println(str2);
		
		String str3 ="Trump claims mystery report clears him of Georgia election charges as DA seeks March trial date – live updates";
		
		String str4 = str3.replace("Trump", "Shafkat");
		
		System.out.println(str4);
		
		String str5 = str4.replace("Georgia","Virginia");
		
		System.out.println(str5);
		
		String str6 = str5.replace('e', '3');
        
        System.out.println(str6);
		

	}

}
