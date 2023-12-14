import java.util.Random;

public class lotakbank implements Bank {


    private  Random rand;
    private String accountnumber;
    private double balance;
    private String password;
    public static final double rateofinterest=6.5;

    public lotakbank() {

    }

    public lotakbank(double balance, String password) {
        rand=new Random();
        this.accountnumber = rand.nextDouble(1000000)+"";
        this.balance = balance;
        this.password = password;
        System.out.println("Lotak Bank account created with account number "+ accountnumber);
    }

    @Override
    public String withdrawmoney(String password, double money) {
        if(password.equals(this.password) && money<=balance) {
            balance-=money;
            return money+" has been withdrawn";
        }

        return "Password mismatch or not enough balance";
    }

    @Override
    public double checkbalance(String password) {
        if(password.equals(this.password))
        return balance;
        else {
            System.out.println("PASSWORD MISMATCH");
            return -1;
        }
    }

    @Override
    public String depositmoney(double money) {
        balance+=money;
        String s = money + " has been deposited and FINAL AMOUNT " + balance;
        return s;

    }

    @Override
    public double getinterest(String password,int years) {
        if(password.equals(this.password))
        return (lotakbank.rateofinterest*balance*years)/100;
        else return -1;
    }

}
