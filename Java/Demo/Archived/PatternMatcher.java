package Demo.Archived;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternMatcher {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("\\d+");// "//"表示正则表达式转化为字符串
        Matcher matcher = pattern.matcher("aba123abc255abc555");
        while (matcher.find()) {
            System.out.println("找到数字: " + matcher.group());
        }
    }
    
}
