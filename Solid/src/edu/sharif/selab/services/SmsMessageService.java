package edu.sharif.selab.services;
import edu.sharif.selab.models.Message;


public class SmsMessageService implements MessageService, ValidationService{
    @Override
    public void sendMessage(Message message) {
        if(validate(message.getSource()) && validate(message.getTarget())){
            System.out.println("Sending a SMS from " + message.getSource() + " to " + message.getTarget() 
                                + " with content : " + message.getContent());
        }else{
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }

<<<<<<< HEAD
    @Override
    public boolean validate(String phoneNumber) {
=======
    private boolean validate(String phoneNumber) {
>>>>>>> c6d8bc36ae01b88c3ba70777be233b1b772b5f9d
        // Check if the phone number is exactly 11 characters long
        if (phoneNumber.length() != 11) {
            return false; // Phone number length is not valid
        }

        // Check if the phone number contains only numeric digits
        for (char digit : phoneNumber.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false; // Phone number contains non-numeric characters
            }
        }

        // If all checks pass, return true (valid phone number)
        return true;
    }




}
