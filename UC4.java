class UC4 {
    public static void main(String[] args) {

        // If no names → default
        if (args.length == 0) {
            System.out.println("Hello World!");
        } 
        else {
            System.out.print("Hello ");

            // Loop through all names
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);

                // Add comma between names
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("!");
        }
    }
}