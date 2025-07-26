package lang.string.test;

public class TestString6_2 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;

        //첫번째로 "hello" 가 나오는 인덱스 알아내기
        int index = str.indexOf(key); //index = 6

        while (index >= 0) { //indexOf()는 찾는 결과가 없을 때 -1을 반환해준다.
            index = str.indexOf(key, index + 1);
            count++;
        }

        System.out.println("count = " + count);
    }
}
