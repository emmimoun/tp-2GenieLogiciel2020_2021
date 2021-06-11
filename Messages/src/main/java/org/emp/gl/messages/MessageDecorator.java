package org.emp.gl.messages;

import java.security.NoSuchAlgorithmException;

public class MessageDecorator implements IMessage{

    IMessage messageinstence ;


    MessageDecorator(IMessage messageinstence ){
        this.messageinstence=messageinstence;
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return messageinstence.getTitle();
    }

    @Override
    public String getSender() {
        // TODO Auto-generated method stub
        return messageinstence.getSender();
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return messageinstence.getMessage();
    }

    @Override
    public void setTitle(String title) {
        // TODO Auto-generated method stub
        messageinstence.setTitle(title);
        
    }

    @Override
    public void setSender(String sender) {
        // TODO Auto-generated method stub
         messageinstence.setSender(sender);
        
    }

    @Override
    public void setMessage(String message) {
         //messageinstence.setMessage(message);
        
    }
@Override
public String toString() {
    // TODO Auto-generated method stub
    return messageinstence.toString();
}    
}
