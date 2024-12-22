import java.util.Scanner;

public class FlipCoin {
    public  void flipCoin() {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome User");
        System.out.println(" how many times you want to flip a coin");
        int n=sc.nextInt();
        if(n<=0) {

            System.out.println("Please Enter a Positive Number");
            return;}
        int h=0,t=0,cnt=n;
        while(cnt!=0) {
            double randomVal=Math.random();
            if(randomVal<0.5) {
                System.out.println("You have got tails");
                t++;}
            else {
                System.out.println("You got Heads");
                h++;
            }
            cnt--;
        }
        int headPercent=(h*100)/n;
        int tailPercent=(t*100)/n;
        System.out.println("HeadPercentage is :"+headPercent+"%");
        System.out.println("tailPercentage is:"+tailPercent+"%");



    }
}
