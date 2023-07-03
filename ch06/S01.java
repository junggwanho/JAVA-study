package ch06;

    // 고양이를 추상화  
    class Cat {
        // 필드 (객체의 속성)
        String name;
        int age;

        // 생성자 (객체를 생성할 때 사용)
        // 생성자 이름은 클래스명과 동일하게 만든다
        // 생성자가 있어야 클래스를 인스턴스화 할 수 있다
        // 생성자는 리턴 타입이 없다 (무조건 void)
        // class에 아무 생성자가 없을 경우
        // 매개변수가 없는 생성자가 기본적으로 세팅 되어 있다
        // public Cat() {
        //     System.out.println("내가 태어났다옹");
        // }

        // 다른 생성자를 직접 만들 경우
        // 기본적으로 세팅 되어 있는 생성자는 없어진다
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;

            System.out.println(this.name + "가 태어났다");
        }

        // 길고양이
        // 일부 데이터만 받을 수 있다
        // 받지 않은 데이터는 개발자가 직접 초기화 해줘야 한다.
        // public Cat(int age) {
        //     this.name = "길냥이";
        //     this.age = age;

        //     System.out.println(this.name + "가 태어났다");
        // }

        public Cat(int age){
            //this를 이용해서 생성자에서 다른 생성자를 불러낼 수 있다
            // 보통은 제일 매개변수가 많은 생성자를 사용한다
            this("길냥이",age);
        }

        // 메소드 (객체의 기능)
        public void cry(){
            System.out.println("미야옹");
        }
    
        public Cat(){
            System.out.println("이름은 길냥이이고 나이는 1살이올시다!");
        }
    }

public class S01 {
    public static void main(String[] args) {
        // 오브젝트는 상상 할 수 있디만 실체화 되지 않은 것
        Cat cat;

        // new를 통해서 오브젝트에 인스턴스를 넣어 준다
        // 
        cat = new Cat("삐삐", 2);

        Cat cat2 = new Cat(1);
        
        // 문제
        // 이름이 길냥이고 나이가 1살인 고양이를 생성하시오
        // 빨간줄 삭제
        new Cat();

    }
}