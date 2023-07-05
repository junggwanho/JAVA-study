package ch09;

public class S01 {
    public static void main(String[] args) {
        String str = " Show me the money ";
        System.out.println("str.length() : " + str.length());
        System.out.println("str.charAt : " + str.charAt(1));
        System.out.println("str.substring(6) : " + str.substring(6));
        System.out.println("str.substring(6, 11) : " + str.substring(6, 11));
        System.out.println("str.toLowerCase() : " + str.toLowerCase());
        System.out.println("str.indexOf(e) : " + str.indexOf("e"));
        System.out.println("str.lastindexOf(e) : " + str.lastIndexOf("e"));
        System.out.println("str.contains(the) : " + str.contains("the"));
        System.out.println("str.startsWith(\"show\") : " + str.startsWith("show"));
        System.out.println("str.endsWith(\"money\") : " + str.endsWith("money"));
        System.out.println("str.trim() : " + str.trim());
        System.out.println("str.replace(\"e\", \"x\") : " + str.replace("e", "x"));
        System.out.println("str.repeat(2) : " + str.repeat(2));
        System.out.println("str.split(\" \") : " + str.split(" ")[1]);

        String name1=" 홍 길 동";
        System.out.println("name1.split(\"\").length : " + name1.split(" ").length);

        // 값이 없는 빈 문자열 ""만 true
        System.out.println("\"\".isEmpty() : " + " ".isEmpty());

        // ""과 " " 둘다 true
        System.out.println("\"\".isBlank() : " + " ".isBlank());

        String bird1 = "오리";
        String bird2 = "오리";

        System.out.println("bird1 == bird2 : " + (bird1 == bird2));

        String bird3 = "독수리";
        System.out.println("(bird3 == \"독수리\")" + (bird3 == "독수리"));

        String bird4 = new String("갈매기");
        String bird5 = new String("갈매기");

        System.out.println("(bird4 == bird5) : "+ (bird4 == bird5));
        System.out.println("(bird4 == \"\uAC08\uB9E4\uAE30\") : " + (bird4 == "갈매기"));


        // 객체끼리 ==을 사용하면 주소를 비교하게 된다
        // 객체끼리 equals를 사용하면 주소를 비교해보고 false면
        // 내부의 값을 한번 더 확인해서 비교한 뒤 true false를 리턴한다

        // 객체끼리 비교는 equals를 권장
        System.out.println("bird4.equals(bird5) : " + bird1.equals(bird2));
        System.out.println("bird4.equals(bird5) : " + bird4.equals(bird5));

        
    }
    
}
