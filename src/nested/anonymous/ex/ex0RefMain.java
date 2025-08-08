package nested.anonymous.ex;

public class ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작");
        System.out.println(str); //변하는 부분
        System.out.println("프로그램 종료");
        System.out.println();
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
