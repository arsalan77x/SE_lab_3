package edu.sharif.selab.services;

import java.util.regex.Pattern;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if(validateTelegramID(telegramMessage.getSourceTelegramID()) && validateTelegramID(telegramMessage.getTargetTelegramID())){
            System.out.println("Sending a telegram message from " + telegramMessage.getSourceTelegramID() + " to " + telegramMessage.getTargetTelegramID() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Telegram ID is Not Correct!");
        }  
    }

    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body
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
