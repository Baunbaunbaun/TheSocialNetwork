//Class to produce messages to be send between persons in the DikuPlus social network

public class Message {

    private String message;
    private Person sender;

    public Message(String message, Person sender) {

        this.message = message;
        this.sender = sender;
    }

    public String getMessage() {
        return this.message;
    }

    public Person getSender() {
        return this.sender;
    }
    @Override
    public String toString(){
        return this.getSender().getName() + " - " + this.getMessage();
    }
}
