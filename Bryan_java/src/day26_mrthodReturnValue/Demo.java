package day26_mrthodReturnValue;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int num2 = myMethod(15);

        System.out.println(num2);
        
        Demo d = new Demo();
        System.out.println(d.nameFormatter("suMMER"));
        
        System.out.println(d.nameFormatter("rinaT"));

//                        012345
        
        
        String emails[] = {"test@hotmail.com", "john@usps.gov","david@github.com"};
        
        for (String e : emails) {
            System.out.println(getDomainName(e).toUpperCase());
        }

        
        
        int[] nums = {3,2,4,1}; 
        printAnArray(nums);

        int nums2[] = arraySort(nums);
        
//        System.out.println(arraySort(nums));
    
        printAnArray(nums2);

        
    }

    public static void printAnArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    
    

    public static int[] arraySort(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }




    public static String getDomainName(String email ) {
        //String email = "Test@aws.com";
        // return domain name
        
        int indexOfAt = email.indexOf('@');
        //System.out.println(indexOfAt);
        
        String str2 = email.substring(indexOfAt + 1);
        
        //System.out.println(str2);//gmail.com
        
        String arr[] = str2.split("\\.");
        
        return arr[0];
    }
    
    
    
    
    
    
    
    public String nameFormatter(String str) {
        
//        String str = "saROJ"; // Techcircle
        
        String str1 = str.toUpperCase(); // TECHCIRCLE
        String str2 = str.toLowerCase(); // techcircle
        
        String str3 = str1.charAt(0) +str2.substring(1);
        
        //System.out.println(str3);
        
        return str3;
    }
    
    

    public static int myMethod(int num) {
//        int num = 4;

        int result = num + 5;

        return result;
    }

}

