import org.apache.commons.lang3.StringUtils;

public class CutString {
    public static void main(String[] args) {

        cutStr("Привет всем кто живет на луне!", 20);

        // StringUtils.abbreviate("Привет всем кто живет на луне!",10);

        count10();
        count20();

    }

    public static void cutStr(String str, int num) {
        System.out.println(StringUtils.abbreviate(str, num));

    }

    public static void count10 () {
        System.out.println("Привет ...".equals(StringUtils.abbreviate("Привет всем кто живет на луне!", 10)));

    }
    public static void count20 () {
        System.out.println("Привет всем кто ж...".equals(StringUtils.abbreviate("Привет всем кто живет на луне!", 20)));

    }
}