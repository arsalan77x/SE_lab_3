package edu.sharif.selab.services;
import edu.sharif.selab.models.Message;


public class SmsMessageService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        if(validatePhoneNumber(message.getSource()) && validatePhoneNumber(message.getTarget())){
            System.out.println("Sending a SMS from " + message.getSource() + " to " + message.getTarget() 
                                + " with content : " + message.getContent());
        }else{
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {
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
