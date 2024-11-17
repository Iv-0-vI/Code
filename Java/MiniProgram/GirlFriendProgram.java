package MiniProgram;

import java.util.ArrayList;

public class GirlFriendProgram{
    public static void main(String[] args) {
        ArrayList<GirlFriend> girls_List= new ArrayList<>();
        GirlFriend gf1 = new GirlFriend("treasure", "white black yellow pink orange");
        girls_List.add(gf1);
        GirlFriend gf2 = new GirlFriend("korean", "yellow gray orange green");
        girls_List.add(gf2);

        System.out.println(gf1.color);
        System.out.println(gf2.color);
    }
}
class GirlFriend{
    public String name;
    public String color;
    public GirlFriend(String name, String color){
        this.name = name;
        this.color = color;
    }

}