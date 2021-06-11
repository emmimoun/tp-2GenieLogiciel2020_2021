/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.messages;

/**
 *
 * @author User
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author islam
 */
public class Decalage extends MessageDecorator{
    
    public int decalage = 1;
    
    public Decalage(IMessage base) {
        super(base);
        this.setMessage(messageinstence.getMessage());
    }
    
    @Override
    public void setMessage(String newMessage){
        String cipher = "";
        
        for (int i = 0; i < newMessage.length(); i++){
            char letter = newMessage.charAt(i);
            letter = (char) (letter + decalage);
            cipher += letter;
        }
        messageinstence.setMessage(cipher);
    }
    
    public String getMessage(){
        String clear = "";
        String cipher = messageinstence.getMessage();
        
        for (int i = 0; i < cipher.length(); i++){
            char letter = cipher.charAt(i);
            letter = (char) (letter - decalage);
            clear += letter;
        }
        return clear;
    }
    
}

