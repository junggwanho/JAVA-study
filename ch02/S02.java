package ch02;

import java.text.MessageFormat;

public class S02 {

    public static void main(String[] args) {
        
        String name = "지드래곤";
        int age = 34;

        // 문자열 사이에 변수를 넣고 싶을 때에는
        // 문자열을 더해준다
        String str1 = "저는 " + name + "이고 " +  age + "세입니다";
        System.out.println(str1);

        // 형식화된 출력 
        System.out.printf("저는 %s이고 %d세입니다\n", "고양이", 2);
        System.out.printf("저는 %s이고 %d세입니다\n", "고양이", 2);

        //소수점 단위를 제한 할 수 있다
        System.out.printf("%.2f\n",10.0 /3);
        // 잘린 소수점이 0.5이상 이면 자동으로 반올림 된다
        System.out.printf("%.2f\n",3.6666);

        // 문자열 포맷팅 / 문자열 보간법
        String str2 = String.format("저는 %s\n", "홍길동");
        System.out.println(str2);

        String str3 = MessageFormat.format("저는 {0} {1} {0}\n", "다나카");
        System.out.println(str3);
    }
    
}
