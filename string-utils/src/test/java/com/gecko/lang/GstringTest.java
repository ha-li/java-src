package com.gecko.lang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by hlieu on 01/29/17.
 */
public class GstringTest {
   /**
    * The resource under test.
    */
   private Gstring gstring;

   @Before
   public void setUp(){
      gstring = new Gstring ();
   }

   @Test
   public void test_instantiation () throws NoSuchFieldException, IllegalAccessException {
      char[] a = {'a', 'b', 'c'};

      Gstring g1 = new Gstring (a);
      Field f = Gstring.class.getDeclaredField ("value");
      f.setAccessible (Boolean.TRUE);
      char[] value = (char[]) f.get(g1);

      Assert.assertNotSame(a, value);
   }

   @Test
   public void test_copy_instantiation () throws NoSuchFieldException, IllegalAccessException {
      char[] a = {'a', 'b', 'c'};
      Gstring g1 = new Gstring(a);

      // Gstring copy constructor does a copy over of the underlying
      // character sequence. So g2's value should be a different
      // instance from g1's value.
      Gstring g2 = new Gstring(g1);

      Field f = Gstring.class.getDeclaredField ("value");
      f.setAccessible (Boolean.TRUE);

      char[] value1 = (char[]) f.get(g1);
      char[] value2 = (char[]) f.get(g2);

      Assert.assertNotSame (value1, value2);
      Assert.assertNotSame (g1, g2);
   }

   @Test
   public void test_string_copy () throws NoSuchFieldException, IllegalAccessException{
      String s1 = new String("abc");

      // this is string's shallow copy, even though it is a different
      // object, the underlying char[] is the same as s1's char[]
      String s_copy = new String(s1);

      Field f = String.class.getDeclaredField ("value");
      f.setAccessible (Boolean.TRUE);

      char[] v1 = (char[]) f.get(s1);
      char[] v2 = (char[]) f.get(s_copy);

      Assert.assertSame (v1, v2);
      Assert.assertNotSame (s1, s_copy);
   }

}