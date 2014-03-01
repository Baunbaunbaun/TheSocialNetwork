public class Main {

    public static void main(String[] args) {


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

    }
}