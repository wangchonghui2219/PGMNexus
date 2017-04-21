package com.example.administrator.pgmnexus.test;

import android.test.AndroidTestCase;

import junit.framework.Assert;

/**
 * Created by Administrator on 2017/4/21/021.
 */

public class MyTest extends AndroidTestCase {
    private static final String Tag="MyTest";



    public void testSave() throws Throwable

    {

        int i=4+8;

        Assert.assertEquals(5,i);

    }



    public void testSomethingElse() throws Throwable {

        Assert.assertTrue(1 + 1 == 12);

    }
}
