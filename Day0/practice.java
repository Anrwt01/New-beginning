package Day0;

public class practice {
    public static void main(String[] args) {
        
    
/* /* 
    for (int i=1; i<=n; i++){
        System.out.println("hello world");
    } */

       
    
/* while(n<=i){ */

/* o{System.out.println(6566);
}while (<=n);
 */
       /*  int sum=0; */

        /* for(int i=0; i<=n;i++){
            sum+=i;
            
        }
        System.out.println(sum); */

       /*  for(int i=1; i<=n; i++){
            System.out.println(i*2);
        } */

        int n=5;

    /*     // for printing 5*5 cube
    for ( int i=1; i<=n; i++){
         for (int j=1; j<=n; j++){
                System.out.print ( "*");
            }
            System.out.println();
    } */

   /*  for ( int i=n; i>=1; i--){
        for (int j=1; j<=i; j++){
               System.out.print ( "*");
           }
           System.out.println();*/

           //printing a rhombus

           /* for (int i=1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println( );
           }
 */
        // for printing plaindromic 

       /*  for (int i=1; i<=n; i++){
            for (int k=1; k<=2*n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<2*i; j++){
                System.out.print("*");

            }System.out.println( );

        

        } */


        // for printing pyramid

       /*  for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        } */




        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
               if (i==1|| i==n){
                System.out.print("*");
               }else {
                System.out.print(" ");
               }
 
 
            int spaces = 2 * (n-i);
            for(int k=1; k<=spaces;k++) {
                System.out.print(" ");
            }
 
 
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
 
 
 
 
 
    }
} }
       
       

 

      
    
    
    

