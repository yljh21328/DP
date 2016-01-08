
public class Message {
    public Message(Session session) {
        // TODO Auto-generated constructor stub
        _session = session;
    }
    private Session _session;
    public String _from;
    public String _subject;
    public String _text;
    public void setFrom(String from) {
        // TODO Auto-generated method stub
        _from = from;
    }
    public void setSubject(String subject) {
        // TODO Auto-generated method stub
        _subject = subject;
    }
    public void setText(String text) {
        // TODO Auto-generated method stub
        _text = text;
    }
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Message Send");
    }
}
