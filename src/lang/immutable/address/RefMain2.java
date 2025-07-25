package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울"); //x001
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다. //x001
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); //b의 값을 부산으로 변경해야함, 컴파일 오류남, 확인해보니 value 값을 바꾸면 안되네? final로 지정되어 있네? 그럼 새로운 객체를 만들어야 되는구나!
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
