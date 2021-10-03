/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
  @Test void linkedListTest (){
    LinkedList osaidList = new LinkedList();
    osaidList.insert("Hello");
    osaidList.insert("My");
    osaidList.insert("Name");
    osaidList.insert("Is");
    osaidList.insert("Slim");
    osaidList.insert("Shady");


    assertEquals(6,osaidList.size());
    assertTrue(osaidList.includes("Hello"));
    assertFalse(osaidList.includes("Bruhhh"));
    assertEquals("{ Hello } --> { My } --> { Name } --> { Is } --> { Slim } --> { Shady } --> NULL" , osaidList.toString());

  }

  @Test void linkedListInserationTest (){

    LinkedList osaidList = new LinkedList();
    osaidList.append("Hello");
    osaidList.append("My");
    osaidList.append("Name");
    osaidList.append("Is");
    osaidList.append("Slim");
    osaidList.append("Shady");

    assertEquals(6,osaidList.size());



  }

}
