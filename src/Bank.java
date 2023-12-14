public interface Bank {

    public String withdrawmoney (String password,double money);
    public double checkbalance (String password);
    public String depositmoney(double money);
    public double getinterest (String password,int years);


}
