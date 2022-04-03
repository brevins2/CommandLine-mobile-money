package mobilemoney;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MobileMoney {

    public static void main(String[] args) {
        
        System.out.print("Our Application runs with Airtel, MTN and Africel to offer you the best services\n");
        //our app does all network mobile money services
        System.out.print("Enter mobile number: \n");
        Scanner scanNumber = new Scanner(System.in);
        String enterNumber = scanNumber.next();
        
        //checking the number to see if it fits the kind of networks we have
        if((enterNumber.startsWith("077") || enterNumber.startsWith("076")|| enterNumber.startsWith("078")) && enterNumber.length() == 10)
        {
            System.out.print("You are using MTN mobile Money network Uganda\n");
                MTNMobileNetwork mobileService = new MTNMobileNetwork();
                    mobileService.MTN();
        }
        else if((enterNumber.startsWith("070") || enterNumber.startsWith("075")) && enterNumber.length() == 10)
        {
            System.out.print("You are using Airtel mobile Money network Uganda\n");
                AIrtelMobileNetwork mobileService = new AIrtelMobileNetwork();
                    mobileService.Airtel();
        }
        else if(enterNumber.startsWith("079")  && enterNumber.length() == 10)
        {
            System.out.print("You are using Africel mobile Money network Uganda\n");
                AfricelMobileNetwork mobileService = new AfricelMobileNetwork();
                    mobileService.Africel();
        }
        else{            
            System.err.print( "error occured\n");
            System.exit(200);
        }
    }

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Date now = new Date();
//    System.out.println(formatter.format(now));
}
