//Class to simulate how the DikuPlus social network is working.

public class Simulation{

    private DikuPlus network;
    private Person kasper, knud, ole;

    public static void main(String[] args){
        new Simulation();
    }

    private Simulation(){

        this.network = new DikuPlus();
        this.generatePeople();
        this.makeFriends();
        this.addPeopleToTheNetwork(new Person[] { kasper, knud, ole });
        this.makeConversation();
        this.kasper.printWall();
        this.knud.printWall();
        this.ole.printWall();

    }

    private void generatePeople(){

        //3 pictures in arrays
        String[] knuds = new String[]{
                "_O/   ",
                "  \\   ",
                "  /\\_ ",
                "  \\   "};

        String[] kaspers = new String[]{
                "   /  ",
                " \\_\\  ",
                "    \\ ",
                "   /0\\"};

        String[] oles = new String[]{
                "  \\O_",
                "/\\/  ",
                " /   ",
                " \\   "};

        //create pictures
        Photograph knudsPic = new Photograph(knuds);
        Photograph olesPic = new Photograph(oles);
        Photograph kaspersPic = new Photograph(kaspers);

        //create persons
        this.knud = new Person("Knud Larsen", knudsPic);
        this.ole = new Person("Ole Sucker", olesPic);
        this.kasper = new Person("Kasper Knudsen", kaspersPic);
    }

    private void makeFriends(){

        this.knud.requestFriendship(this.ole);
        this.ole.requestFriendship(this.knud);

        this.kasper.requestFriendship(this.knud);
        this.kasper.requestFriendship(this.ole);
    }

    private void addPeopleToTheNetwork(Person[] people){

        for (Person person : people)
            this.network.addPerson(person);
    }

    private void makeConversation(){

        this.knud.sendMessage(this.kasper, "How's it going?");
        this.kasper.sendMessage(this.knud, "All good!");

        this.ole.sendMessage(this.knud, "Anything interesting going on?");
        this.ole.sendMessage(this.kasper, "Anything interesting going on?");

        this.kasper.sendMessage(this.ole, "Yes!");
        this.knud.sendMessage(this.ole, "No.");

        this.ole.sendMessage(this.knud, "We should meet soon!");
        this.ole.sendMessage(this.kasper, "We should meet soon!");
    }
}
