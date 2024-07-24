package app;

public class StringAndScanner {
  public static void main(String[] args) {
    String message = new String("Hello Mundo");
    String[] messages = new String[message.split(" ").length];
    messages = message.split(" ");
    System.out.println("\"Upper:\" " + message.toUpperCase());
    System.out.println("\"Lower:\" " + message.toLowerCase());
    System.out.println(message + " \"Equals\" " + message.toLowerCase() + ": " + message.equals(message.toLowerCase()));
    System.out.println("\"message var is empty:\" " + message.isEmpty());
    System.out.println("\"Substring(0,3)\": " + message.substring(0,3));
    System.out.println("\"First Character:\" " + message.charAt(0));
    System.out.println("\"Split method:\" " + messages[0] + " - " + messages[1]);
    System.out.println("\"Containe Hello:\" " + message.contains("Hello"));
  }
}
