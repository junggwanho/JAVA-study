package s12;

import lombok.val;

// 제네릭
class Num<T extends Number>{
    // 필드가 정수 일수도 있고 실수 일수도 있을 경우
    T value;
    public Num(T value){
        this.value = value;
    }
}

public class S01 {
    public static void main(String[] args) {
        Num<Integer> num = new Num<Integer>(1);
    }
    
}
