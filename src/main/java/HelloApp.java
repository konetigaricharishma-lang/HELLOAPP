public class HelloApp {

    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Create StringBuilder to store names
        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }
        String result;
        if (nameBuilder.length() > 0) {
            result = nameBuilder.substring(0, nameBuilder.length() - 2);
        } else {
            result = "";
        }
        System.out.println("Hello, " + result + "!");
    }
}
