package ch04;

public class S04 {

    public static void main(String[] args) {

        //Math.random은 
        //0에서 0보다 크거나 같고
        //1보다 작다
        //45를 곱하면 0~44.9999999가 나온다
        double num = Math.random()* 45;
        //int 로 캐스팅해서 0~44로 나온다
        int intnum = (int) num;
        // +1gownaus 1~45가 된다
        int result = intnum + 1;


        System.out.println(result);
    }
    
}
