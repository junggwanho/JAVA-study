package ch04;

public class S05 {
    public static void main(String[] args) {
        

        int i = 1;
        // 소괄호 안의 조건이 flase가 될 때 까지
        // 무한 반복한다
        // 소괄호 안에는 true나 flase만 들어갈 수 있다
        while(true){
            System.out.println(i);

            i++;
            if(i >1000){
                System.out.println("반복종료" + i);
                break;
            }


        }
    }
    
}
