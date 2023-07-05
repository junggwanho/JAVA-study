package ch07;

interface 입 {
    void cry();
}

interface 눈 {
    void see();
}

interface 날개 {
    void wing();
}
class 홍길동 extends 사람 {
    @Override
    public void cry(){
    }
    @Override
    public void see(){
    }
}

class 천사 extends 사람 {
    @Override
    public void cry(){

    }
    @Override
    public void see(){

    }
}


// 인터페이스들이 모이면 종족의 특성이 될 수 있다.
abstract class 사람 implements 입, 눈{

}

// 인터페이스는 '기능'을 의미한다.
// 인터페이스는 클래스에서 여러개를 구현할 수 있다
class cat implements 입, 눈 {
    @Override
    public void cry(){
        System.out.println("야옹");
    }
    public void see(){
        System.out.println("I see you~");
    }
}
class Dog implements 입 {
    @Override
    public void cry(){
        System.out.println("멍");
    }
}
public class S08 {
    public static void main(String[] args) {
        
    }
    
}
