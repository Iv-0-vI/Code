package Demo.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {
    public static void main(String[] args) {
        try {
            Pattern pattern = Pattern.compile("\\w+");
            Matcher matcher = pattern.matcher("刘343423紫3242柯");
            while (matcher.find()) {
                String result = matcher.group();
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
Vscode 最美的代码
/*
刘
343423
紫
3242
柯
 */
