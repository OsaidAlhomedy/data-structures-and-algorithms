package stack.and.queue.challenges;

import stack.and.queue.challenges.base.GenericQueue;
import stack.and.queue.challenges.base.GenericStack;
import stack.and.queue.challenges.base.Queue;
import stack.and.queue.challenges.base.Stack;

import java.util.List;

public class Validator {


  public static boolean validateBrackets(String bracket) {

    if (bracket == null || bracket.equals("") || bracket.length() == 1) {
      return false;
    }

    GenericStack<Character> left = new GenericStack<>();
    GenericStack<Character> right = new GenericStack<>();

    for (char chr : bracket.toCharArray()) {

      if (chr == '{' || chr == '[' || chr == '(') {
        left.push(chr);
      } else if (chr == '}' || chr == ']' || chr == ')') {
        if (chr == '}') right.push('{');
        if (chr == ']') right.push('[');
        if (chr == ')') right.push('(');
      }
    }

    while (left.peek() != null) {
      if (left.peek() == right.peek()) {
        left.pop();
        right.pop();
      } else {
        return false;
      }
    }
    return true;
  }


}
