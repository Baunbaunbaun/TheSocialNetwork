import java.util.ArrayList;

public class DikuPlus {

    public ArrayList<Person> Diku = new ArrayList();

    public void addPerson(Person addMe){
        this.Diku.add(addMe);
    }

    public void removePersonWithName(Person removeMe){
        this.Diku.remove(removeMe);
    }
}
