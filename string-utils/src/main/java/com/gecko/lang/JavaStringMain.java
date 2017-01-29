package com.gecko.lang;

/**
 * Created by hlieu on 01/28/17.
 */
public class JavaStringMain {
   public static void main (String[] args) {
      int cp = "A String is here".codePointAt(5);
      System.out.println (cp);

      char c = (char)cp;
      System.out.println (c);

      char b = (char) 0xFF;
      System.out.println(b);
   }
}
