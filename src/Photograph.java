// class to produce diagrams that assemble photographs. The photographs are attributes for persons.

public class Photograph {

    private String[] pic;

    public Photograph(String[] photograph) {

        if (photograph == null) {
            photograph = new String[]{};
        }
        this.pic = photograph;
    }

    public int getWidth() {

        return (this.getHeight() < 1) ? 0 : this.pic[0].length();
    }

    public int getHeight() {
        return this.pic.length;
    }

    //@null if the index is out of bounds.

    public String getLine(int index) {

        if (index < 0 || index >= this.pic.length) {
            return null;
        }
        return this.pic[index];
    }
}
