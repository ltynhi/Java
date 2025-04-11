public class TestMyIntStack {
   public static void main(String[] args) {
      MyIntStack stack = new MyIntStack(3); 
      System.out.println("Pushing 10: " + stack.push(10));  
      System.out.println("Pushing 20: " + stack.push(20));  
      System.out.println("Pushing 30: " + stack.push(30));  
      
      try {
         System.out.println("Pushing 40: " + stack.push(40));  
      } catch (IllegalStateException e) {
         System.out.println(e.getMessage());  
      }
      System.out.println("Top element: " + stack.peek());  
      System.out.println("Popping: " + stack.pop());  
      System.out.println("Popping: " + stack.pop());  
      System.out.println("Popping: " + stack.pop()); 
      try {
         System.out.println("Popping: " + stack.pop());  
      } catch (IllegalStateException e) {
         System.out.println(e.getMessage());  
      }
      System.out.println(stack);  
   }
}
