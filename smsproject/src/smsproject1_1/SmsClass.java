package smsproject1_1;
import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import java.net.URI;
import java.math.BigDecimal;

public class SmsClass {
	

	 // Find your Account Sid and Token at twilio.com/console
  public static final String ACCOUNT_SID = "ACb7351e0081bfef9fe3810c8738873b5b";
  public static  final String AUTH_TOKEN = "39d61706ec519bc48fe9fd3d1c24efe6";
  public static void main(String[] args) {
  Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
   Message msg=Message.creator(new PhoneNumber("+9769069454"),
		 new PhoneNumber("+19472254218"), 
		 "Welcome Zakiya M Salim Shaikh"
	+ "Thankyou for completing your project you are eligible for module two sessions")
		   .create();
    
  }

}
