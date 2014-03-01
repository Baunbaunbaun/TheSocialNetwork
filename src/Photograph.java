public class Photograph {

    private String[] pic;

    public Photograph(String[] photograph) {

        if (photograph == null) {
            photograph = new String[]{};
        }
        pic = photograph;
    }

    public int getWidth() {

        if (this.getHeight() < 1) {
            return 0;
        } else {
            return this.pic[0].length();
        }
    }

    public int getHeight() {
        return this.pic.length;
    }

    //@null if the index is out of bounds.

    public String getLine(int index) {

        if (index < 0 || index >= this.pic.length) {
            return null;
        }
        return pic[index];
    }
}
