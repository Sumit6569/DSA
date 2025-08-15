package Loops.PattenPrinting;

public class ButterFlyPattern {
    int n=5;
      for(int i=1; i<=n; i++) {
            
            for(int j=0; j<=n-i; j++) System.out.print("*");
            for(int j=1; j<=2*i-1; j++) System.out.print(" ");
            for(int j=0;j<=n-i;j++) System.out.print("*");
            System.out.println();
    }}
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n =5;
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1; i<=n; i++) {
            
        //     for(int j=0; j<=n-i; j++) System.out.print(" ");
        //     for(int j=1; j<=2*i-1; j++) System.out.print("*");
        //     for(int j=0;j<=n-i;j++) System.out.print(" ");
        //     System.out.println();
        // }
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) System.out.print("*");
            for(int j=1; j<=2*(n-i); j++) System.out.print(" ");
            for(int j=1; j<=i; j++) System.out.print("*");
            System.out.println();
        }
        // lower part
        // for(int i=n; i>=1; i--) {
        //     for(int j=1; j<=i; j++) System.out.print("*");
        //     for(int j=1; j<=2*(n-i); j++) System.out.print("9");
        //     for(int j=1; j<=i; j++) System.out.print("*");
        //     System.out.println();
        // }
        
        // for(int j=0; j<=n-i; j++) System.out.print("*");
        //     for(int j=1; j<=2*i-1; j++) System.out.print(" ");
        //     for(int j=0;j<=n-i;j++) System.out.print("*");
        //     System.out.println();
        
        
        //   int n=5;
      for(int i=1; i<=n; i++) {
            
            for(int j=0; j<=n-i; j++) System.out.print("*");
            for(int j=1; j<=2*i-1; j++) System.out.print(" ");
            for(int j=0;j<=n-i;j++) System.out.print("*");
            System.out.println();
       }
    
    }
}