package s11;

import java.util.HashMap;
import java.util.Map;

public class S04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("사과", "3개");
        map.put("바나나", "2개");
        map.put("똬아아알기", "5개");

        System.out.println(map);

        System.out.println(map.get("사과"));

        map.remove("바나나");

        // 이름과 값 둘 다 중요할 때 사용한다
        System.out.println(map);
    }

    
}
