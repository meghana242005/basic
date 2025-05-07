public class division {
    public static void main(String[] args) {
         int a= 15;
         int b=0;
         try {
            int div = a/b;
            System.out.println("Result: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }

         }

    }

