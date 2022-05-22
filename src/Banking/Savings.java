package Banking;

public class Savings extends Account {
    //list properties specific to Savings account
    int safetyDepositBoxID;
    int SafetyDepositBoxKey;

    //constructor to initialize Savings account properties
    public Savings(String name,String ssN,double initDeposit){
        super(name,ssN,initDeposit);
        accountNumber= "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID =(int)( Math.random() * Math.pow(10,3));
        SafetyDepositBoxKey = (int)( Math.random() * Math.pow(10,4));
    }




    //list any  methods specific to Savings account

    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Savings Account features" +
                        "\n *Safety Deposit Box ID: "+safetyDepositBoxID+
                        "\n *Safety Deposit Box Key: " +SafetyDepositBoxKey
        );
    }

}
