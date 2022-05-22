package Banking;

import org.omg.Messaging.SyncScopeHelper;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
public static  void main(String args[]) throws FileNotFoundException {



    String file ="/Users/sbasavaraju/Downloads/JavaProject_sample_Data.csv";

//    Checking checking1 = new Checking("Basavaraju S","1234234",1500);
//    checking1.showInfo();
//
//    System.out.println("\n"+"********************** " + "\n");
//
//    Savings saving1 = new Savings("Nagaraj S","1234234",1500);
//    saving1.showInfo();
//    saving1.deposit(500);
//    saving1.withdraw(200);
//    saving1.transfer("to Brokerage" ,100);
  //  saving1.compound();
    //Read a CSV file then create new account based on the data


    List<Account> accounts = new LinkedList<Account>();

    List<String []> newAccountHolders = utilities.CSV.read(file);
    for (String[] accountholder :newAccountHolders){
        String name = accountholder[0];
        String sSN = accountholder[1];
        String accountType = accountholder[2];
        double initDeposit = Double.parseDouble(accountholder[3]);
        if(accountType.equals("Savings")){
            accounts.add(new Savings(name,sSN,initDeposit));
        }
        else if(accountType.equals("Checking")){
            accounts.add(new Checking(name,sSN,initDeposit));
        }
        else{
            System.out.println("Invalid Account Type found");
        }

    }

   for(Account acc: accounts ){
       System.out.println("\n*************************");
       acc.showInfo();
   }
}


}
