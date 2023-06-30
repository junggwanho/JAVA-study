package ch04;

public class S12 {
    public static void main(String[] args) {
        //for 또는 While 문을 이용해서 별찍기

        // 1
        // *****
        // *****
        // *****
        // *****
        // *****
        // for(int i=0; i<5; i++){
        //     for(int j=0; j<5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


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

        // 3
        // *****
        // ****
        // ***
        // **
        // *
        for(int i=0; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // 4
        // *****
        //  ***
        //   *
        for(int i=0; i<3; i++){
            if(i == 1){
                System.out.print(" ");
            }
            if(i == 2){
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.print("*");
            if(i==2) continue;
            System.out.print("*");
            System.out.print("*");
            if(i == 1){
                System.out.println();
                continue;
            }
            System.out.print("*");
            System.out.println("*");

        }

        // 5 
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for (int i=0; i<5; i++){
            System.out.print("*");
            if(i==1 || i==2 || i==3){
                System.out.print("   ");
                System.out.println("*");
                continue;
            }
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.println();
        }
    }
    
}
