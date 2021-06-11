package org.emp.gl.messages;

public class HashSimple extends MessageDecorator{


    public HashSimple(IMessage messageinstence) {
        super(messageinstence);
        //TODO Auto-generated constructor stub
        this.setMessage(messageinstence.getMessage());

       
    }


    @Override
    public
    void setMessage(String message){

        
        messageinstence.setMessage(message+message.hashCode());
    }
    
}
