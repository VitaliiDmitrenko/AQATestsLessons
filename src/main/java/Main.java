import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String str = "Привет всем кто живет на луне!";

        //System.out.println(StringUtils.capitalize("vitalii"));
        simpleTest();
        numberTest();
        nullTest();
        emptyTest();


    }

    public static void simpleTest () {
        System.out.println(
                "Vitalii".equals(StringUtils.capitalize("vitalii")));
    }
    public static void numberTest () {
        System.out.println(
                "123456".equals(StringUtils.capitalize("123456")));

    }
    public static void nullTest () {
        System.out.println(
                null == StringUtils.capitalize(null));

    }
    public static void emptyTest () {
        System.out.println(
                "".equals(StringUtils.capitalize("")));

    }

}
