public class Main {

  public static void main(String[] args) {

    LinkedList osaidList = new LinkedList();

    osaidList.insert("Hello");
    osaidList.insert("My");
    osaidList.insert("Name");
    osaidList.insert("Is");
    osaidList.insert("Slim");
    osaidList.insert("Shady");

    System.out.println(osaidList.size());
    System.out.println(osaidList.includes("Hello"));

    System.out.println(osaidList);

  }

}
