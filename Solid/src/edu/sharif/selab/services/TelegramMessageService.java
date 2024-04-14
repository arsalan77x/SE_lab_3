package edu.sharif.selab.services;

import java.util.regex.Pattern;
import edu.sharif.selab.models.Message;


public class TelegramMessageService implements MessageService, ValidationService{
    @Override
    public void sendMessage(Message message) {
        if(validate(message.getSource()) && validate(message.getTarget())){
            System.out.println("Sending a telegram message from " + message.getSource() + " to " + message.getTarget() 
                                + " with content : " + message.getContent());
        }else{
            throw new IllegalArgumentException("Telegram ID is Not Correct!");
        }  
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> c6d8bc36ae01b88c3ba70777be233b1b772b5f9d
    public boolean validate(String id) {
        // Regular expression pattern for validating email addresses
        String idRegex = "^@[a-zA-Z0-9-]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(idRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(id).matches();
    }


}
