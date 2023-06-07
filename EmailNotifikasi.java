
package com.mycompany.polimorphisme;


public class EmailNotifikasi implements InterfaceNotifikasi {
 
    @Override
    public void sendMessage(String receiver,String content){
        System.out.println("Mengirim email ke"+receiver+"dengan sisi");
        System.out.println(content);
    }
}
