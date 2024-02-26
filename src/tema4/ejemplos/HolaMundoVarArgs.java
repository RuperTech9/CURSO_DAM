package tema4.ejemplos;
public class HolaMundoVarArgs {

        public static void main(String... args) {
                if (args.length > 0) {
                System.out.println("Hola mundo con " + args.length + " args");
                  for (int i = 0; i < args.length; i++)
                      System.out.println("arg[" + i + "] = " + args[i]);  
             }
                else System.out.println("Hola mundo sin args");

                System.out.println(factorial(5));
        }  
        
        static int factorial(int n) {     
            if(n > 2) return n*factorial(--n); 
            return n;                           
          } 
          
}
