package stack.and.queue.challenges;

import org.checkerframework.checker.units.qual.A;
import stack.and.queue.challenges.base.PseudoQueue;

public class Library {

  public static void main(String[] args) {

    Animal didi = new Animal("cat");
    Animal roxy = new Animal("dog");

    AnimalShelter<Animal> planetZoo = new AnimalShelter<>();


    planetZoo.enQueue(roxy);
    planetZoo.enQueue(didi);

//    System.out.println(planetZoo.peek());

    System.out.println(planetZoo.deQueue("fish"));


  }
}
