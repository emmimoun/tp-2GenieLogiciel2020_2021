package org.emp.gl.messages;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 extends MessageDecorator{

    public Md5(IMessage messageinstence) throws NoSuchAlgorithmException {
        super(messageinstence);
        //TODO Auto-generated constructor stub

        byte[] result =calculateMd5 (messageinstence.getMessage());
        this.setMessage(messageinstence.getMessage() + result);

       
    }



    byte[] calculateMd5(String message) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] result = md.digest(message.getBytes(StandardCharsets.UTF_8));
        return result;
    }

    @Override
    public
    void setMessage(String message)  {
        
        
        messageinstence.setMessage(message );
    }

    
    
}