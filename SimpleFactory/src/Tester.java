
public class Tester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String from = "from";
        String subject = "subject";
        String text = "text";
        Session session = new Session(from, subject, text);
        Message message = MessageFactory.getMessage(session);
        message.send();
    }

}
