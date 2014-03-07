/**
 * Created by baunbaun on 02/03/14.
 */
public class Message {

    private String message;
    private Person sender;

    public Message(String message, Person sender) {

        this.message = message;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public Person getSender() {
        return sender;
    }
    @Override
    public String toString(){
        return this.getSender().getName() + " - " + this.getMessage();
    }
}
