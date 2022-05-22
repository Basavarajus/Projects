package Banking;

public class Checking extends Account {
    //list properties specific to checking account
    int debitCardNumber;
    int debitCardPIN;

    //constructor to intialize checking account properties
    public Checking(String name,String ssN,double initDepost){
        super(name,ssN,initDepost);
        accountNumber = "2" +accountNumber;
        setDebitCard();
    }

    public void setRate(){
       rate = getBaseRate() * .15;
    }
    private void setDebitCard() {
                debitCardNumber=(int)( Math.random() * Math.pow(10,12));
                debitCardPIN=(int)( Math.random() * Math.pow(10,4));
    }

    //list any  methods specific to checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account features " +
                "\n *Debit Card Number: " +debitCardNumber+
                "\n *Debit Card PIN: "+debitCardPIN
        );

    }
}
