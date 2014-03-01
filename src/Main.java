public class Main {

    public static void main(String[] args) {

        //3 pictures in arrays
        String[] knud = new String[]{
                "_O/   ",
                "  \\   ",
                "  /\\_ ",
                "  \\   "};

        String[] kasper = new String[]{
                "   /  ",
                " \\_\\  ",
                "    \\ ",
                "   /0\\"};

        String[] ole = new String[]{
                "  \\O_",
                "/\\/  ",
                " /   ",
                " \\   "};

        Photograph knudsPic = new Photograph(knud);

        //print picture
        for (int i = 0; i < knud.length; i++) {
            System.out.println(knudsPic.getLine(i));
        }

        //testing methods
        System.out.println(knudsPic.getHeight());
        System.out.println(knudsPic.getWidth());

        Person KnudLarsen = new Person("Knud Larsen", knudsPic);
    }
}