package ch02;

import java.util.Scanner;

public class S03 {

    public static void main(String[] args) {

        // 콘솔에 입력을 받을 때 사용한다
        // 표준 입력장치인 키보드 등의 데이터를 받는다
        Scanner scanner = new Scanner(System.in);

        // 스캐너에서 nextInt를 사용하면
        // 입력된 값을 int 타입으로 형변환해서 리턴한다
    

        //next는 띄어쓰기 기준으로 값을 할당받는다
        String next = scanner.next();
        String next1 = scanner.next();
        String next2 = scanner.next();
        
        System.out.println(next);
        System.out.println(next1);
        System.out.println(next2);

        // String nextLine = scanner.nextLine();
        // System.out.println(nextLine);

        scanner.close();
    }
}
