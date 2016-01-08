
public class MessageFactory {
    public static Message getMessage(Session session) {
        Message msg = new Message(session);
        msg.setFrom(session._from);
        msg.setSubject(session._subject);
        msg.setText(session._text);
        return msg;
    }
}
