package edu.sharif.selab.services;

import java.util.regex.Pattern;
import edu.sharif.selab.models.Message;


public class TelegramMessageService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        if(validateTelegramID(message.getSource()) && validateTelegramID(message.getTarget())){
            System.out.println("Sending a telegram message from " + message.getSource() + " to " + message.getTarget() 
                                + " with content : " + message.getContent());
        }else{
            throw new IllegalArgumentException("Telegram ID is Not Correct!");
        }  
    }

    public boolean validateTelegramID(String id) {
        // Regular expression pattern for validating email addresses
        String idRegex = "^@[a-zA-Z0-9-]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(idRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(id).matches();
    }


}