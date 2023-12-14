import java.util.Scanner;
import java.util.function.LongToDoubleFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your password");
        String pass=sc.next();
        System.out.println("Enter initial balance");
        double bal=sc.nextDouble();

        Bank b1=new lotakbank(bal,pass);
        System.out.println("Congratulations ! New Account created  " );
        System.out.println("Let' check Balance ! Enter passsword");
        pass=sc.next();
        System.out.println(b1.checkbalance(pass));

        System.out.println("Enter amount to add");
        bal=sc.nextDouble();
        System.out.println(b1.depositmoney(bal));

        System.out.println("Let' check Balance ! Enter passsword");
        pass=sc.next();
        System.out.println(b1.checkbalance(pass));

        System.out.println("For how many years you want to check interest?");
        int yrs=sc.nextInt();
        System.out.println(b1.getinterest(pass,yrs));


        System.out.println("Let's withdraw money,enter amount to withdraw and password");
        bal=sc.nextDouble();
        pass=sc.next();
        System.out.println(b1.withdrawmoney(pass,bal));

        System.out.println("Let' check Balance ! Enter passsword");
        pass=sc.next();
        System.out.println(b1.checkbalance(pass));





    }
}