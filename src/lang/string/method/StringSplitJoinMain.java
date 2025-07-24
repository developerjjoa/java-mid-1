package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        /*
        String joinStr = "";
        for (String string : splitStr) {
            joinStr += string + "-";
        }
        System.out.println(joinStr);
        //결과값 : Apple-Banana-Orange- 마지막 대시를 빼줘야함, 그래서 fori 를 해줘야한다.
        */

        /*
        String joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length - 1) {
                joinStr += "-";
            }
        }
        System.out.println(joinStr);
        //join 안쓰고 내가 하려고 하면 개복잡해짐 ㅠㅠ
         */

        // join() 합치다
        String joined = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joined);

        //문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
