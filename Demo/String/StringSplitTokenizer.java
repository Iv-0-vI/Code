package Demo.String;
import java.util.StringTokenizer;
public class StringSplitTokenizer {
    public static void main(String[] args) {
        String string = "淘宝, 腾讯, 字节跳动, 京东。";
        StringTokenizer st = new StringTokenizer(string,", ");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
