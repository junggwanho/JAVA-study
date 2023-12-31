package ch06;

class Dog {
    String name;
    int position;
    public Dog(String name, int position) {
        this.name = name;
        this.position = position;
        System.out.println(this.name + "가 태어났습니다");
    }

    public Dog(String name){
        this(name,0);
    }

    public void moveRight(){
        this.position++;
        System.out.println(this.name + "가 오른쪽으로 이동했습니다");
    }

    public void moveLeft(){
        this.position--;
        System.out.println(this.name + "가 왼쪽으로 이동했습니다");
    }
}
public class S02 {
    public static void main(String[] args) {
        
        // 강아지 생성
        Dog dog = new Dog("멍뭉이");

        // 유저가 캐릭터를 움직임

        dog.moveRight();
        dog.moveRight();

        // 강아지 위치 확인
        System.out.println(dog.position);
    }
    
}
