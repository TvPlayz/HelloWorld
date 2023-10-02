package day30_constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Constructor {
	    
	    public static void main(String[] args) {
	        
	        Student student1 = new Student();
	        
	        System.out.println(student1.getInfo());
	        
	        Student student2 = new Student("Dilnaz");
	        
	        System.out.println(student2.getInfo());
	        
	        Student student3 = new Student("Adam",25);
	        student3.gender = 'M';
	        
	        System.out.println(student3.getInfo());
	        
	        Student student4 = new Student("Zach",20,'M',789456);
	        System.out.println(student4.getInfo());
	        
	        //ArrayList<String> list = new ArrayList<>();
	        ArrayList<Student> list = new ArrayList<>();
	        list.add(student4);
	        list.add(student3);
	        list.addAll(Arrays.asList(student1, student2));
	        
	        list.add(new Student("Arad",20,'M',45621));
	        
	        
	        
	        System.out.println(list);
	        
	        
	        for (int i = 0 ; i < list.size(); i++) {
	            // read value from a list
	            //System.out.println(list.get(i).name);
	            
	            if (list.get(i).name.length() == 4) {
	                System.out.println(list.get(i).getInfo());
	            }
	            
	        }
	        
	        for (Student element : list) {
	            if (element.name.length() == 4) {
	                System.out.println(element.getInfo());
	            }
	        }
	        
	        Iterator<Student> i = list.iterator();
	        
//	        System.out.println(i.next().name);
//	        
//	        System.out.println(i.hasNext());
	    
	        while(i.hasNext()) {
	            //System.out.println(i.next().name);
	            
	            String str = i.next().name;
	            System.out.println(str);
	            
	            for (char c : str.toCharArray()) {
	                System.out.println(c);
	            }
	            
	        }
	        
	        
	        
	        
	    }
	    
	
}
