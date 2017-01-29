package com.gecko.lang;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 01/29/17.
 */
public class GstringTest {

   private Gstring underTest;
   {
      underTest = new Gstring ();
   }

   @Test
   public void test_doNothing () {
      int toVerify = underTest.doNothing();
      Assert.assertEquals (toVerify, 0);
   }

}