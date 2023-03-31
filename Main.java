public class Main {

public static void main(String[] args) {
   String emailPenerima = "snowmoonlight08@gmail.com";
        String nomerHp = "+65 8474 0813";
        String mobileId = "iphone-346356";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message1 = "Hello !!!";
        String message2 = "Kamu Dimana";
        String message3 = "Di cariin emak";
        
        emailNotif.sendMessage(emailPenerima, message1);
        smsNotif.sendMessage(nomerHp, message2);
        pushNotif.sendMessage(mobileId, message3); 
}
    
}
