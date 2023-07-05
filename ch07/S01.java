package ch07;

class 초보자{
    String skill1 = "달팽이세마리";
}

class 마법사 extends 초보자{
    String skill2 = "매직클로";
}

public class S01 {
    public static void main(String[] args) {
        마법사 magic1 = new 마법사();

        System.out.println(magic1.skill1);
        System.out.println(magic1.skill2);

    }
    
}
