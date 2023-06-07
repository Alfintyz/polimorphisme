
package com.mycompany.polimorphisme;


public class Main {
    public static void main(String[]args){
        String emailPenerima="pragos@petanicode.com";
        String nomerHp="3456765432345";
        String mobileId="android=77777";
        
        
        EmailNotifikasi emailNotif = new EmailNotifikasi();
        SMSNotifikasi smsNotif = new SMSNotifikasi();
        PushNotifikasi pushNotif = new PushNotifikasi();
        
        String message ="tutorial polimorfisme sudah terbit di petanicode";
        
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
    
}
