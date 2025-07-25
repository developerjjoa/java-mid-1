package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String format = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println("format = " + format);

        String format1 = String.format("숫자: %.2f", 10.1234);
        System.out.println("format1 = " + format1);

        //printf
        System.out.printf("숫자: %.2f\n", 10.1234); //String.format은 포맷을 받아서 출력한다면 printf는 한 번에 출력할 때 포맷을 쓰고 싶을 때 쓰면 된다.

        //matches 메서드
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
