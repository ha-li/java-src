package com.gecko.lang;

import java.util.Arrays;

/**
 * An immutable string class, for the sake of learning immutable and strings.
 * An immutable object must be final, so that other class does not extend it.
 *
 * Created by hlieu on 01/28/17.
 */
public final class Gstring
   implements java.io.Serializable {

   private static final long serialVersionUID = 8260967008777211795L;

   /** The value used for character storage. */
   private final char[] value;

   public Gstring () {
      value = new char[0];
   }

   public Gstring (char[] val) {
      value = Arrays.copyOf(val, val.length);
   }

   /**
    * This is a deep copy constructor, it copies over the underlying
    * character sequence.
    * @param original
    */
   public Gstring (Gstring original) {
      this.value = Arrays.copyOf(original.value, original.value.length);
   }

   public int doNothing () {
     return 0;
   }
}
