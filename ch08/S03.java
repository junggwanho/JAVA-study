// package ch08;

// import java.util.Scanner;

// public class S03 {
//     public static void main(String[] args) {
        
//         // 스캐너는 마지막에 꼭 close()를 해줘야함

//         Scanner scanner = new Scanner(System.in);
//         try {
//             int num = scanner.nextInt();    
//             System.out.println(num);
//         } catch (Exception e) {
//             System.out.println("정수가 아닙니다");
//             // finally는 try 안의 변수와 관련된 객체가
//             // 무조건 처리되어야 할 경우 사용한다.
//             // try 안의 코드가 예외가 발생하든 안하든 무조건 실행된다
//         } finally{
//             scanner.close();
//         }
//     }
    
// }
