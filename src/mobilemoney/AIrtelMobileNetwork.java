//Airtel Mobile Money
package mobilemoney;

// @author brevin
import java.text.NumberFormat;
import java.util.Scanner;

public class AIrtelMobileNetwork {
       public void Airtel() {
        //airtime available
          int airtimeAvailable = 58;
          NumberFormat airtimeCuurency = NumberFormat.getCurrencyInstance();
          String realAirtime = airtimeCuurency.format(airtimeAvailable);
        
          for(int i=0; i < 15; i++){
                System.out.print("1. Airtime\n"
                        + "2. Bundles\n"
                        + "3. Mobile money\n"
                        + "4. Airtime balance\n");

                Scanner ScanChoice = new Scanner(System.in);
                int choiceTaken = ScanChoice.nextInt();
                if(choiceTaken == 1)
                {               
                    //buying airtime
                    System.out.print("Enter amount of airtime to buy \n");

                    //entering amount
                    Scanner scanAirtime = new Scanner(System.in);
                    int airtimeInput = scanAirtime.nextInt();

                    //outputting airtime amount in Ugandan Shillings
                    NumberFormat UgShillings = NumberFormat.getCurrencyInstance();
                    String currencyAirtime = UgShillings.format(airtimeInput);
                    System.out.print("Airtime bout is: " + currencyAirtime + "\n");

                    //Account balance of airtime now
                    int collectedRealAirtime = airtimeAvailable + airtimeInput;
                    NumberFormat NiceAirtime = NumberFormat.getCurrencyInstance();
                    String AT = NiceAirtime.format(collectedRealAirtime);

                    //output the Airtime
                    System.out.print("Your airtime now is: "+ AT + "\n\n");
                }

                else if(choiceTaken == 4)
                {
                    System.out.print("Your Airtime Balance is: "+ realAirtime + "\n\n");
                }

                else if(choiceTaken == 2)
                {
                    System.out.print("1. Voice\n"
                                   + "2. SMS\n"
                                   + "3. Data\n");

                    //choose
                    Scanner bundleChoice = new Scanner(System.in);
                    int choiceTake = bundleChoice.nextInt();

                    if(choiceTake == 1)
                    {
                        System.out.print("Enter amount of Voie bundles: \n");
                             Scanner voiceBundleChoice = new Scanner(System.in);
                             int voiceBundleChoiceTake = voiceBundleChoice.nextInt();

                             switch(voiceBundleChoiceTake)
                                     {
                                         case 500:
                                             System.out.print("15Voice Bundles for a day \n");
                                                 System.out.print("Do you want to continue \n");
                                                     Scanner answer = new Scanner(System.in);
                                                     String goodAnswers = answer.next();
                                                         goodAnswers = "yes";
                                                             if(goodAnswers == "yes")
                                                             {
                                                                 System.out.print("You have recieved 15Voice Bundles at "+ goodAnswers +"\n"
                                                                                + "Your new balnce is 15Voice Bundles. \n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 1000:
                                             System.out.print("30Voice Bundles for a week\n");
                                                 System.out.print("Do you want to continue\n");
                                                         goodAnswers = "yes";
                                                             if(goodAnswers == "yes")
                                                             {
                                                                 System.out.print("You have recieved 30Voice Bundles at "+ goodAnswers +"\n"
                                                                                + "Your new balnce is 30Voice Bundles.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 2000:
                                             System.out.print("50Voice Bundles for two weeks\n");
                                              System.out.print("Do you want to continue\n");
                                                         goodAnswers = "yes";
                                                             if(goodAnswers == "yes")
                                                             {
                                                                 System.out.print("You have recieved 50Voice Bundles at "+ goodAnswers +"\n"
                                                                                + "Your new balnce is 50Voice Bundles.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 5000:
                                             System.out.print("100Voice Bundles for three weeks");
                                                 System.out.print("Do you want to continue");
                                                         goodAnswers = "yes";
                                                             if(goodAnswers == "yes")
                                                             {
                                                                 System.out.print("You have recieved 100Voice Bundles at "+ goodAnswers +"\n"
                                                                                + "Your new balnce is 100Voice Bundles.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 10000:
                                             System.out.print("700Voice Bundles for a month\n");
                                                 System.out.print("Do you want to continue\n");
                                                         goodAnswers = "yes";
                                                             if(goodAnswers == "yes")
                                                             {
                                                                 System.out.print("You have recieved 700Voice Bundles at "+ goodAnswers +"\n"
                                                                                + "Your new balnce is 700Voice Bundles.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         default:
                                             System.out.print("Sorry, wrong input\n\n");
                                             break;
                                     }
                    }

                    else if(choiceTake == 2)
                    {
                         System.out.print("Enter amount of SMS: \n");
                             Scanner SMSChoice = new Scanner(System.in);
                             int SMSChoiceTake = SMSChoice.nextInt();

                             switch(SMSChoiceTake)
                                     {
                                         case 500:
                                             System.out.print("100SMS for a day\n");
                                                 System.out.print("Do you want to continue\n");
                                                     Scanner answer = new Scanner(System.in);
                                                     String goodAnswer = answer.next();
                                                         goodAnswer = "yes";
                                                             if(goodAnswer == "yes")
                                                             {
                                                                 System.out.print("You have recieved 100SMS at "+ goodAnswer +"\n"
                                                                                + "Your new balnce is 100SMS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 1000:
                                             System.out.print("700SMS for a week\n");
                                                 System.out.print("Do you want to continue\n");
                                                         goodAnswer = "yes";
                                                             if(goodAnswer == "yes")
                                                             {
                                                                 System.out.print("You have recieved 700SMS at "+ goodAnswer +"\n"
                                                                                + "Your new balnce is 700SMS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 2000:
                                             System.out.print("800SMS for two weeks\n");
                                              System.out.print("Do you want to continue\n");
                                                         goodAnswer = "yes";
                                                             if(goodAnswer == "yes")
                                                             {
                                                                 System.out.print("You have recieved 800SMS at "+ goodAnswer +"\n"
                                                                                + "Your new balnce is 800SMS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 5000:
                                             System.out.print("1000SMS for three weeks\n");
                                                 System.out.print("Do you want to continue\n");
                                                         goodAnswer = "yes";
                                                             if(goodAnswer == "yes")
                                                             {
                                                                 System.out.print("You have recieved 1000SMS at "+ goodAnswer +"\n"
                                                                                + "Your new balnce is 1000SMS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 10000:
                                             System.out.print("7000SMS for a month\n");
                                                 System.out.print("Do you want to continue\n");
                                                         goodAnswer = "yes";
                                                             if(goodAnswer == "yes")
                                                             {
                                                                 System.out.print("You have recieved 7000SMS at "+ goodAnswer +"\n"
                                                                                + "Your new balnce is 7000SMS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         default:
                                             System.out.print("Sorry, wrong input\n\n");
                                             break;
                                     }
                    }

                    else if(choiceTake == 3)
                    {
                        System.out.print("Enter amount of Data: \n");
                             Scanner DataChoice = new Scanner(System.in);
                             int DataChoiceTake = DataChoice.nextInt();

                             switch(DataChoiceTake)
                                     {
                                         case 500:
                                             System.out.print("40MBS for a day\n");
                                                 System.out.print("Do you want to continue\n");
                                                     Scanner answer1 = new Scanner(System.in);
                                                     String goodAnswer1 = answer1.next();
                                                         goodAnswer1 = "yes";
                                                             if(goodAnswer1 == "yes")
                                                             {
                                                                 System.out.print("You have recieved 40MBS at "+ goodAnswer1 +"\n"
                                                                                + "Your new balnce is 40MBS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 1000:
                                             System.out.print("100MBS for a week\n");
                                                 System.out.print("Do you want to continue\n");
                                                         goodAnswer1 = "yes";
                                                             if(goodAnswer1 == "yes")
                                                             {
                                                                 System.out.print("You have recieved 100MBS at "+ goodAnswer1 +"\n"
                                                                                + "Your new balnce is 100MBS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 2000:
                                             System.out.print("240MBS for two weeks\n");
                                              System.out.print("Do you want to continue\n");
                                                         goodAnswer1 = "yes";
                                                             if(goodAnswer1 == "yes")
                                                             {
                                                                 System.out.print("You have recieved 240MBS at "+ goodAnswer1 +"\n"
                                                                                + "Your new balnce is 240MBS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 5000:
                                             System.out.print("1024MBS for three weeks\n");
                                                 System.out.print("Do you want to continue\n");
                                                         goodAnswer1 = "yes";
                                                             if(goodAnswer1 == "yes")
                                                             {
                                                                 System.out.print("You have recieved 1024MBS at "+ goodAnswer1 +"\n"
                                                                                + "Your new balnce is 1024MBS.\n\n");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         case 10000:
                                             System.out.print("2028MBS for a month\n");
                                                 System.out.print("Do you want to continue");
                                                         goodAnswer1 = "yes";
                                                             if(goodAnswer1 == "yes")
                                                             {
                                                                 System.out.print("You have recieved 2048MBS at "+ goodAnswer1 +"\n"
                                                                                + "Your new balnce is 2048MBS\n\n.");
                                                             }
                                                             else{
                                                                 System.out.print("You cancelled\n\n");
                                                                 break;
                                                             }
                                             break;

                                         default:
                                             System.out.print("Sorry, wrong input\n\n");
                                             break;
                                     }
                    }

                    else{
                        System.err.print("Err occured\n\n");
                        System.exit(400);
                    }
                }

                else if(choiceTaken == 3)
                {
                    System.out.print("Welcome to MTN mobile money Services\n");

                    //services of the mobile money
                    System.out.print("1. Send money\n"
                            + "2. Withdraw money\n");

                    //account amount on mobile
                    int account_balance = 1200000;

                    Scanner MMScanner = new Scanner(System.in);
                    int inputScanned = MMScanner.nextInt();

                    //veriy input
                    if(inputScanned == 1)
                    {
                        //catching input
                        System.out.print("Enter amount to send \n");
                        Scanner sendingScanner = new Scanner(System.in);
                        int sendInputScanned = sendingScanner.nextInt();

                        System.out.print("Enter Mobile number to send to: \n");
                        Scanner sendingMoneyScanner = new Scanner(System.in);
                        String sendingInputScanned = sendingMoneyScanner.next();

                        //verify amount entered
                        if(sendInputScanned < account_balance)
                        {   
                            NumberFormat realBalance = NumberFormat.getCurrencyInstance();
                            String realBalancenow = realBalance.format(sendInputScanned);

                             System.out.print("You have sent "+ realBalancenow +" to " + sendingInputScanned +"\n");
                              int balance = account_balance - sendInputScanned;

                              NumberFormat realAccountBalance = NumberFormat.getCurrencyInstance();
                            String realAccountBalancenow = realAccountBalance.format(balance);

                             System.out.print("Your account balance is: "+ realAccountBalancenow +"\n\n");
                        }
                        else{
                            System.out.print("You have insufficient amount on your account \n"
                                    + "try again later\n\n");
                        }

                    }

                    else if(inputScanned == 2)
                    {
                        System.out.print("Enter amount to withdraw: \n");
                        Scanner withdrawAmount = new Scanner(System.in);
                        int withdrawn = withdrawAmount.nextInt();
                        
                        //convert amount
                        NumberFormat newAmount = NumberFormat.getCurrencyInstance();
                        String amount = newAmount.format(withdrawn);
                        
                        //balance after withdraw
                        int realNewBalance = account_balance - withdrawn;
                        System.out.print("You are withdrawing \n"+ amount + "\n");
                        
                        //query
                        System.out.print("Are you sure you want to continue? \n");
                        
                        //answer to the query
                        System.out.print("1. yes \n"
                                + "2. No \n");
                        Scanner Query = new Scanner(System.in);
                        int QueryAnswer = Query.nextInt();
                        
                        if(QueryAnswer == 1)
                        {
                            System.out.print("You are withdrawing "+ amount + "\n");
                            System.out.print("you account balance is "+ realNewBalance + "\n");
                            System.exit(200);
                            System.out.print("\n\n");
                        }
                        else{
                            System.out.print("You have cancelled.\n\n");
                        }
                    }

                    else{
                        System.err.print("Wrong input");
                        System.exit(200);
                        System.out.print("\n\n");
                    }
                }
            }
          
          //thanksgiving
          System.out.print("Thanks for using Airtel Mobile Services");
    }
}
