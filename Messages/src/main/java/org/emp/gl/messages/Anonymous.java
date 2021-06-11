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
public class Anonymous extends MessageDecorator {

    public Anonymous(IMessage messageinstence) {
        super(messageinstence);
        setSender("Anonymous");
    }
      @Override
    public
    void setMessage(String message)  {
        
        messageinstence.setMessage(message );
    }
    
}
