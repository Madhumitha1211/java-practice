public class TypeCastingExample {
    public static void main(String[] args) {
  // for narrowing      
        double myDouble = 4.52d;
        int myInt = (int)myDouble;
        
        System.out.println("Double value is : " + myDouble);
        System.out.println("Integer value is : " + myInt);
// for winding
        double myDouble2 = myInt;
        System.out.println("Double value is : " +myDouble2);
    }
    
}
