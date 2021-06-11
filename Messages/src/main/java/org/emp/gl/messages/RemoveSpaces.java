package org.emp.gl.messages;

public class RemoveSpaces extends MessageDecorator{

    public RemoveSpaces(IMessage messageinstence) {
        super(messageinstence);
        //TODO Auto-generated constructor stub
        this.setMessage(messageinstence.getMessage());

       
    }


    @Override
    public
    void setMessage(String message){

        
        messageinstence.setMessage(message.replaceAll("\\s", ""));
    }

    
    
}
