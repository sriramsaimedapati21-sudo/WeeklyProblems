class UC2
 {
    public static void main(String[] args) {

        // Check if user provided name
        if (args.length == 0) {
            System.out.println("Usage: java HelloApp <your_name>");
            return;
        }

        // Print greeting
        System.out.println("Hello " + args[0] + "!");
    }
}