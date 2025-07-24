package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello"; //x001
        String b = " java"; //x002

        String result1 = a.concat(b); //x001.concat((b))
        String result2 = a + b; //x001 + x002 참조값은 더할 수 없다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
