import java.util.Random;

public class nobank implements Bank{

    private Random r;
    private String bankaccno;
    private double accbal;
    private String secretcode;
    public static final int minbal= 5000;
    public static final double roi=8.0;

    public nobank() {

    }

    public nobank(double accbal, String secretcode) {
        r=new Random();
        this.bankaccno = String.valueOf(r.nextInt(100000));
        this.accbal = accbal;
        this.secretcode = secretcode;
    }

    @Override
    public String withdrawmoney(String password, double money) {

        if(password.equals(this.secretcode))
            if(accbal-money>nobank.minbal)
            {
                accbal-=money;
                return money+" withdrawn and Current Balance is "+accbal;
            }
            else{
                return "Too less remaining balance! Sorry can't withdraw";
            }

        return "Password Mismatch";
    }

    @Override
    public double checkbalance(String password) {
        if(password.equals (this.secretcode)){
            return accbal;
        }
        System.out.println("Password Mismatch");
        return -1;
    }

    @Override
    public String depositmoney(double money) {
        accbal+=money;
        return money+" has been deposted and balance is "+accbal;
    }

    @Override
    public double getinterest( String password,int years) {
        if(password.equals(secretcode))
            return accbal*nobank.roi*years/100;
        System.out.println("Password mismatch");
        return -1;
    }
}
