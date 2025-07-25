package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
            //최적화가 밑에 코드처럼 된다.
            //result = new StringBuilder().append(result).append("Hello Java).toString()
            //이런 과정을 10만번 하기 때문에 2.7초 정도의 시간이 나오는데 이거는 되게 오래 걸리는 시간이다.
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime));
    }
}
