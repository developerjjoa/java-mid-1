package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService(); //x009

        //임의로 ClassGrade의 인스턴스 생성을 막아야한다.
        //ClassGrade classGrade = new ClassGrade(); //x009
        //int result = discountService.discount(classGrade, price);
        //System.out.println("newClassGrade 등급의 할인 금액: " + result);
    }
}
