package Day0;

public class patternprinting {
    public static void main(String[] args) {
    }
        

   
// for printing square 4*4
int n=4;

for ( int i=1; i<=n; i++){

 for ( int j=1; j<=i; j++){
 System.out.print("*");}

 System.out.println();

}

// for printing LFT
int n=4;

for ( int i=1; i<=n; i++){

    for ( int k=1; k<=(n-i); k++)

 for ( int j=1; j<=n; j++){
 System.out.print("*");}

 System.out.println();

 }
}