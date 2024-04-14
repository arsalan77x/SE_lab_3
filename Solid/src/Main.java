import edu.sharif.selab.models.Message;
import edu.sharif.selab.services.EmailMessageService;
import edu.sharif.selab.services.MessageService;
import edu.sharif.selab.services.SmsMessageService;
import edu.sharif.selab.services.TelegramMessageService;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
        int userAnswer=0;
        do{
            Message message = new Message();
            MessageService messageService = null;
            String source;
            String target;
            String content;

            System.out.println("In order to send Sms message enter 1");
            System.out.println("In order to send Email message enter 2");
            System.out.println("In order to send Telegram message enter 3");
            System.out.println("In order to Exit, Enter 0");

            userAnswer= scanner.nextInt();

            if(userAnswer==0){
                break;
            }

            switch (userAnswer){
                case 1:
                    System.out.print("Enter source phone : ");
                    source = scanner.next();
                    message.setSource(source);
                    System.out.print("Enter target phone : ");
                    target = scanner.next();
                    message.setTarget(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next(".*$");
                    message.setContent(content);
                    messageService = new SmsMessageService();
                    break;
                case 2:
                    System.out.print("Enter source phone : ");
                    source = scanner.next();
                    message.setSource(source);
                    System.out.print("Enter target phone : ");
                    target = scanner.next();
                    message.setTarget(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next();
                    message.setContent(content);
                    messageService = new EmailMessageService();
                    break;
                case 3:
                    System.out.print("Enter source Id : ");
                    source = scanner.next();
                    message.setSource(source);
                    System.out.print("Enter target Id : ");
                    target = scanner.next();
                    message.setTarget(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next();
                    messageService = new TelegramMessageService();
                    break;
            }

            messageService.sendMessage(message);


        }while (true);
    }
}