package stack.and.queue.challenges;

import stack.and.queue.challenges.base.GenericQueue;
import stack.and.queue.challenges.base.Queue;

import java.util.List;

public class Validator{


  public static boolean validateBrackets(String bracket){

    GenericQueue<Character> queue = new GenericQueue<>();

    char[] newList = bracket.toCharArray();
    for(char chr : newList){
      queue.enQueue(chr);
    }
    return false;

  }

}
