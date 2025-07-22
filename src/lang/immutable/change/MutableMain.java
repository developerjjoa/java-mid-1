package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        //계산 이후의 기존 값은 사라짐(처음 MutableObj는 10이라는 값으로 생성됨. 이후에 obj.add(20)을 통해서 기존에 있던 10이라는 값은 사라지고 30으로 변경)
        System.out.println("obj = " + obj.getValue());
    }
}
