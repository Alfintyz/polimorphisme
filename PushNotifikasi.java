
package com.mycompany.polimorphisme;


public class PushNotifikasi implements InterfaceNotifikasi{
    
    
    @Override
    public void sendMessage(String receiver,String content){
        System.out.println("mengirim SMS ke"+receiver+"dengan isi:");
        System.out.println(content);
    }
}
