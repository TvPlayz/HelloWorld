package day23_2D_Array;

import java.util.Arrays;

public class ExcelData {

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
        
        for (int i = 0 ; i < students.length ; i++) {
            System.out.println(Arrays.toString(students[i]));
            
            for (int j = 0 ; j < students[i].length ; j++) {
                System.out.println(students[i][j]);
            }
        }
        
        
        
        for (int i = 0 ; i < names.length ; i++) {
            if (names[i].equals("SarojChokrungjaroentaworn")) {
                System.out.println("email:"+ emails[i]);
            }
        }
        
        
	}

}
