import java.util.ArrayList;

public class DikuPlus {

    public ArrayList<Person> Diku = new ArrayList();

    public void addPerson(Person addMe){
        Diku.add(addMe);
    }

    public void removePersonWithName(Person removeMe){
        Diku.remove(removeMe);
    }
}
