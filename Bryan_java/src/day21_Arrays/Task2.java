package day21_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		
//		find the max and min value from the number array
		
		int numbers2[] = new int[10];
//      numbers[0] = 1;
      
      Random random = new Random();
      
      numbers2[0] = random.nextInt(50);
      numbers2[1] = random.nextInt(50);
      numbers2[2] = random.nextInt(50);
      numbers2[3] = random.nextInt(50);
      numbers2[4] = random.nextInt(50);
      numbers2[5] = random.nextInt(50);
      numbers2[6] = random.nextInt(50);
      numbers2[7] = random.nextInt(50);
      numbers2[8] = random.nextInt(50);
      numbers2[9] = random.nextInt(50);
      
      int max = numbers2[0];
      int min = numbers2[0];
      
      System.out.println(Arrays.toString(numbers2));
      
      
      for (int i = 1; i < numbers2.length; i++)
      {            
          if (numbers2[i] > max) {
              max = numbers2[i];
          }            
          else if (numbers2[i] < min) {
              min = numbers2[i];
          }
      }

      System.out.println("The minimum array element is " + min);
      System.out.println("The maximum array element is " + max);
      
      Arrays.sort(numbers2);
      
      System.out.println(Arrays.toString(numbers2));

	}

}
