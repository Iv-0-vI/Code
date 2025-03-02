package MiniProgram;
import java.util.ArrayList;
public class GunBought {
    public static void main(String[] args) {
        //所有情况之一
        //1
        Gun a1 = new Gun();
        a1.newdeque.add(3);
        a1.Buy("AK47狂徒");
        Gun a2 = new Gun();
        a2.newdeque.add(2);
        a2.Buy("M4A1雷神");
        Gun a3 = new Gun();
        a3.newdeque.add(1);
        a3.Buy("AK47火麒麟");
        Gun a4 = new Gun();
        a4.newdeque.add(4);
        a4.Buy("Glock格洛克");
        Gun a5 = new Gun();
        a5.newdeque.add(5);
        a5.Buy("M82巴雷特");

        //2
        Gun b1 = new Gun();
        b1.newdeque.add(6);
        b1.Buy("AK47狂徒");
        Gun b2 = new Gun();
        b2.newdeque.add(9);
        b2.Buy("M4A1雷神");
        Gun b3 = new Gun();
        b3.newdeque.add(10);
        b3.Buy("AK47火麒麟");
        Gun b4 = new Gun();
        b4.newdeque.add(8);
        b4.Buy("Glock格洛克");
        Gun b5 = new Gun();
        b5.newdeque.add(7);
        b5.Buy("M82巴雷特");
        
        ArrayList<Integer> totaldeque = new ArrayList<>();
        totaldeque.addAll(a1.newdeque);
        totaldeque.addAll(a2.newdeque);
        totaldeque.addAll(a3.newdeque);
        totaldeque.addAll(a4.newdeque);
        totaldeque.addAll(a5.newdeque);
        totaldeque.addAll(b1.newdeque);
        totaldeque.addAll(b2.newdeque);
        totaldeque.addAll(b3.newdeque);
        totaldeque.addAll(b4.newdeque);
        totaldeque.addAll(b5.newdeque);
        System.out.println("队列序号为: "+totaldeque);
    }
}
class Gun{
    private String Gun_name;
    private int Gun_count;
    private int Team_code;//1|2
    public int num;
    public ArrayList<Integer> newdeque; 
    Gun(){
        System.out.println("GunShop");
        this.newdeque = new ArrayList<>();
        this.Gun_count=0;
    }
    public void Buy(String gun_name){
        this.Gun_name=gun_name;
        System.out.print(this.Gun_name);
        this.Gun_count+=1;
        System.out.println(this.Gun_count+"次");
        if (this.Gun_count>1) {
            this.Gun_name="AK47";
        }
    }
    public void giveNumber(int n){
        System.out.println("我是"+n+"号选手");//随机分配十个number QAQ手动分配
        if(num<=5){
        this.Team_code=1;
            System.out.println("我是"+Team_code+"队");
        }else if(num>5&&num<=10){
            this.Team_code=2;
            System.out.println("我是"+Team_code+"队");

        }else{
            System.out.println("未考虑的状况");
        }
    }
}
