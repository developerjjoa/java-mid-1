package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;

        while (str.contains(key)) {
            int index = str.indexOf(key);
            str = str.substring(index + 1);
            count += 1;
        }
        System.out.println("count = " + count);
    }
}
