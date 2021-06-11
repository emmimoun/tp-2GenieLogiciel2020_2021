package org.emp.gl.messages;

public class RemovePonctuation extends MessageDecorator{

    public RemovePonctuation(IMessage messageinstence) {
        super(messageinstence);
        //TODO Auto-generated constructor stub

        this.setMessage(messageinstence.getMessage());
        
    }


    @Override
    public
    void setMessage(String message){
        messageinstence.setMessage(message.replaceAll("\\p{Punct}", ""));
    }




}