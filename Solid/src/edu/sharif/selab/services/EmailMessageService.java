package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;


import java.util.regex.Pattern;

public class EmailMessageService implements MessageService, ValidationService{

    @Override
    public void sendMessage(Message message) {
        if(validate(message.getSource()) && validate(message.getTarget())){
            System.out.println("Sending a Email from " + message.getSource() + " to " + message.getTarget() +
             " with content : " + message.getContent());
        }else{
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }

    @Override
    public boolean validate(String email) {
        // Regular expression pattern for validating email addresses
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(email).matches();
    }

}
