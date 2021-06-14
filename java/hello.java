public class hello {

  public static void main(String []args) {
    System.out.println("Hello, World!");

    System.out.println("This is test.");

    int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

    System.out.format("The sum of %s and %s is %s.\n",
      args[0], args[1], Integer.toString(sum));
  }
}