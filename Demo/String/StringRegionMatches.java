package Demo.String;

public class StringRegionMatches {
    public static void main(String[] args) {
        String s1 = "m";
        String s2 = "m";
        boolean match1 = s1.regionMatches(true,0,s2,0,1);
        System.out.println("匹配为"+match1);
    }
}
