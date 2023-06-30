package ch04;

public class S08Quiz {
    public static void main(String[] args) {
        // 1000~1사이 중에서
        // 5의 배수만 제외하고 출력하시오
        int i = 1000;
        while(100<i){
            if(i % 5 ==0){
                i--;
                continue;
            }
            System.out.println(i);
            i--;
        }


        
    }
    
}
