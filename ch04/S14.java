package ch04;

import java.util.Scanner;

public class S14 {
    public static void main(String[] args) {
          // 2
        // *
        // **
        // ***
        // ****
        // *****

        // for(int i=0; i<5; i++){
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        

        // 4
        // *****
        //  ***
        //   *


        Scanner scanner = new Scanner(System.in);
        int scan_num = scanner.nextInt();
        scanner.close();
        
        for (int i=scan_num; i > 0; i=i-2) {
            for (int j = scan_num; j-i > 0; j=j-2) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }



        // for (int i = 2; i < 10; i++) {
        //     for (int j = 1; j < 10; j++) {
        //         System.out.println(i + " X " + j + " = " + j * i);
        //     }
            
        // }

    }
    
}
