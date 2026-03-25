class UC3 {
    public static void main(String[] args) {

        String name;

        // If no argument → default to "World"
        if (args.length == 0) {
            name = "World";
        } else {
            name = args[0];
        }

        System.out.println("Hello " + name + "!");
    }
}