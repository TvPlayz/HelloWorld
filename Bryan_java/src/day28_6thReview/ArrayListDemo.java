package day28_6thReview;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// initialize
	    ArrayList<String> list = new ArrayList<>();
	    System.out.println(list);

	    String e = "word";
	    list.add(e);
	    list.add(e);
	    list.add(e);
	    list.add(e);
	    list.add(e);
	    list.add(e);
	    list.add(e);
	    System.out.println("List before add with index:\n" + list);
	    //      index, element<>
	    list.add(4, "new value");
	    // make sure that the size of the list is greater than args index
	    System.out.println("List after add with index:\n" + list);

	    // addAll
	    //                                             List
	    List<String> listB = List.of("a", "b", "c");
	    List<Integer> numList = new ArrayList<>(); // list is parent of arraylist
	    ArrayList<String> listC = new ArrayList<>(); // empty arraylist
	    // Collections > List > ArrayList
	    
	    list.addAll(listB); // pass list as arg
	    list.addAll(listC); // pass arraylist as arg
	    list.addAll(List.of("a", "b", "c")); // pass list as arg
	 // remove
	    System.out.println("Current List:\n" + list);
	    System.out.println("size: " + list.size());

	    // by object == element
	    boolean isRemoved1 = list.remove("new value");
	    boolean isRemoved2 = list.remove("xyz");
	    // return false if value arg is not in the list
	    // and list will remain the same

	    System.out.println("Remove - new value: " + isRemoved1);
	    System.out.println("Remove - xyz: " + isRemoved2);

	    System.out.println("List after remove elements:\n" + list);
	    System.out.println("size: " + list.size());

	    // index
	    list.remove(list.size()-1);
	    System.out.println("List after remove last elements:\n" + list);
	    System.out.println("size: " + list.size());

	    // when removing element, watch out for index changing.

	    // removeIf()

	    // contains() - same string.contains()

	    // get() - return the element of arg index

	    // set() is similar to add(index, e)
	    // but it is replacing the element to that specific index instead
	    // size is remain the same

	    // isEmpty() - return true if size of list is 0

	    // clear() - remove all elements in the list -> size will be 0

	    // indexOf() , lastIndexOf()
	    System.out.println("first index of 'a': " + list.indexOf("a"));
	    System.out.println("if element doesn't exist: " + list.indexOf("a"));

	    // subList(startIndex, endIndex) is similar to subString()

	    // .equals()
	    // because non-primitive data cannot be compare with ==
	    String myStr = "hello world";
	    System.out.println(myStr.hashCode());
	    System.out.println(new int[]{0});

	    System.out.println(listB);
	    System.out.println(listC);

	    boolean wrongEqual = listB == listC; // this will compare by hashcode
	    System.out.println("Wrong way, listB is the same as listC: " + wrongEqual);
	    boolean isEqual = listB.equals(listC); // this will compare by actual elements in the list
	    System.out.println("Correct way, listB is the same as listC: " + isEqual);

	}

}
