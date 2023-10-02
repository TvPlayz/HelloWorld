package day22_ArrayDay2;

public class Task4 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
        int evenNum = 0;
        int oddNum = 0;

        for (int num : numbers) {

            if(num%2==0){
                evenNum+=1;
            }else{
                oddNum+=1;
            }
        }
        System.out.println("There are "+evenNum+" even numbers");
        System.out.println("There are "+oddNum+" odd numbers");

	}

}
