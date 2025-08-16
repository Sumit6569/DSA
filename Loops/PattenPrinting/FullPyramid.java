package Loops.PattenPrinting;

public class FullPyramid {
       int n =5;
       for(int i =1;i<=n;i++){
           for(int j =0;j<=n-i;j++) System.out.print(" ");
           for(int j =1;j<=2*i-1;j++) System.out.print("&");
           System.out.println();
           
       }
       for(int i = 1;i<=n;i++){
           for(int j=1;j<=i;j++) System.out.print(" ");
           for(int j=1;j<=2*(n-i)+1;j++) System.out.print("&");
           System.out.println();
       }
}

//      &
//     &&&
//    &&&&&
//   &&&&&&&
//  &&&&&&&&&
//  &&&&&&&&&
//   &&&&&&&
//    &&&&&
//     &&&
//      &