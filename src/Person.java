//Class to produce persons for the DikuPlus social network. The persons have a photograph connected and a wall for messages

import java.util.ArrayList;

public class Person {

    private Photograph photo;
    private String name;
    private ArrayList<Person> friends = new ArrayList(), enemies = new ArrayList();
    private ArrayList<Message> wall = new ArrayList();

    public Person(String name, Photograph photo) {
        this.photo = photo;
        this.name = name;
    }

    public boolean sendMessage(Person reciever, String content) {

        Message message = new Message(content, this);

        return reciever.receiveMessage(message);
    }

    public boolean requestFriendship(Person otherPerson) {

        if (this.friends.contains(otherPerson)){
            return true;
        }
        if(this.sendMessage(otherPerson, "/friend")){
            this.friends.add(otherPerson);
            return true;
        }
        return false;
    }

    private boolean receiveMessage(Message message) {

        if (this.enemies.contains(message.getSender())){
            return false;
        }
        else if (this.friends.contains(message.getSender())) {
            this.wall.add(message);
            return true;
        }
        else if (message.getMessage().equals("/friend")){
                this.friends.add(message.getSender());
                return true;
        }
        else
            return false;
        }

    public Photograph getPhotograph() {
        return this.photo;
    }
    public void printWall(){

        for (Message m : this.wall) {
            System.out.println(m);
        }
    }
    public String getName(){
        return this.name;
    }
}
