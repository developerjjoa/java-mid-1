package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        //int, double, boolean : 기본형
        String str1 = "hello"; //기존
        String str2 = new String("hello"); //자동으로 변경

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
