package day29_ClassAndObject;

public class LocalVariables {

	public static void main(String[] args) {
//      Local variables − Variables defined inside methods, constructors or blocks are called local variables. 
//      The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.
  
  
  int num = 7;
  
  if (num % 2 == 0) {
      System.out.println("Even");
  }
  
  
  for (int i = 1; i < 11 ; i++) {
      System.out.println(i);
  }
  
  
  //System.out.println(i);
  
  
  
  localVariableTest();
  
  
  }
  
  public static void localVariableTest() {
      String color = "White";
      System.out.println(color);
  }
  
  

}