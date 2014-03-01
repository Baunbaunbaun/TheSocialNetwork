/**
 * Created by baunbaun on 01/03/14.
 */
public class Person {

    private Photograph photo;
    private String name;

    public Person(String name, Photograph photo) {
        this.photo = photo;
        this.name = name;
    }

    public Photograph getPhotograph() {
        return this.photo;
    }
}
