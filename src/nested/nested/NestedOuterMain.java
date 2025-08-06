package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        //NestedOuter outer = new NestedOuter(); //이 코드 없어도 중첩 클래스 생성 가능
        NestedOuter.Nested nested = new NestedOuter.Nested();

        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
