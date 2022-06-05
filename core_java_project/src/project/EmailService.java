package project;


	import java.util.ArrayList;
	import java.util.Properties;

	import javax.mail.Message;
	import javax.mail.Multipart;
	import javax.mail.Session;
	import javax.mail.internet.InternetAddress;
	import javax.mail.internet.MimeBodyPart;
	import javax.mail.internet.MimeMessage;
	import javax.mail.internet.MimeMultipart;

	public class EmailService {
	public void sendmail(ArrayList<String>Name,ArrayList<String>EmailId) throws Exception {
		int i=0;
		for(String email:EmailId) {
			sendto(Name.get(i),email);
			i++;
		}
	}
	public static void sendto(String name,String email) throws Exception {
		final String username="ZAK Instituted of Arts,Commerce and Science";
		final String userpassword="xxx@a";
		String FromMail="Zakiyams25@gmail.com";
		String ToMail=email;
		
		Properties prop= new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		
		Session session=Session.getInstance(prop,new javax.mail.Authenticator(){
			protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
				return new javax.mail.PasswordAuthentication(username,userpassword);
			}
		});
		MimeMessage msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress(FromMail));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(ToMail));
		msg.setSubject("Collage Reopen");
		Multipart Content=new MimeMultipart();
		MimeBodyPart text=new MimeBodyPart();
		
		text.setText("Dear"+name+"\n\n"+"Collage is Starting From 1st June 2022 "
		             +"\n"+"First Day Attendence is compulsory"+"\n"
				     +"Regards"+"\n"+"ZAK Instituted of Arts,Commerce and Science ");
		Content.addBodyPart(text);
		msg.setContent(Content);
		javax.mail.Transport.send(msg);
		System.out.println("EMail send Sucessfully......");
	}
	}


