package day23_2D_Array;

public class IterateWithForEachLoop {

	public static void main(String[] args) {
		String[] names = {"Arad Misaghi","Bryan Chavez", "Zachary Diehl","SarojChokrungjaroentaworn","Mian Qadiruddin"};
        String[] emails = new String[5];
        emails[0] = "Aradnuyan9@gmail.com";
        emails[1] = "chavezbryan762@gmail.com";
        emails[2] = "tcschooling96@gmail.com";
        emails[3] = "c-saroj@hotmail.com";
        emails[4] = "mqadiruddin@gmail.com";

        String github[] = {"urboidora","TvPlayz","tcschooling96","SarojChokrungjaroentaworn","qadir99"};
                    
        
        String[][] students = {names, emails, github};
        
        for (String s: names) {
        	System.out.println(s);
        }
        
        for (String[] arr : students) {
        	for (String str : arr) {
        		System.out.println(str);
        	}
        }

        int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		int arr3[] = {9,8,7,0};
		
		System.out.println(arr2[1]); // 5
		System.out.println(arr3[3]);
//										0  1  2  3  4
		int arr4[][]= {arr1,arr2,arr3,{10,12,14,16,18}};
		
		for (int [] arr : arr4) {
			for (int number : arr) {
				System.out.println(number);
			}
		}
	}

}
