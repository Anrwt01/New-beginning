package Day0;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


      int [] arr=new int[size];

     for (int i=0; i<size; i++){
        arr [i] = sc.nextInt();
     }

     int x = sc.nextInt();

     for (int i=0; i<size; i++){
        if ( arr [i]==x){
            System.out.println(" x number found in "+ i);
        }
     }

        
        
    }

    /* static void display(int[] arr){

        

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
    


    public static void main(String[] args) {

        
        int [] arr = new int[2];
        arr[0] = 1;
        arr[1] = 15;

        display(arr);
     
 */
        }
    
    
            


        
            

        
    
        

