package inclasspractice;

import org.junit.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StringListTypeTest {

    // naming convention MethodName_StateUnderTest_ExpectedBehavior

    @Test
    public void isEmpty_Empty_True() {
        StringListType stringList = new StringListType();
        assertTrue(stringList.isEmpty());
    }

    @Test
    public void size_Empty_EqualsToZero() {
        StringListType stringList = new StringListType();
        assertEquals(stringList.size(),0);
    }

    @Test
    public void isEmpty_ContainsOneElement_False() {
        StringListType stringList = new StringListType();
        stringList.add("a");
        assertFalse(stringList.isEmpty());
    }

    @Test
    public void size_NotEmpty_NotEqualsToZero() {
        StringListType stringList = new StringListType();
        stringList.add("a");
        assertNotEquals(stringList.size(),0);
    }

    @Test
    public void add_ContainsOneString_ContainsTheString() {
        StringListType stringList = new StringListType();
        String str = "a";
        stringList.add(0, str);
        assertEquals(stringList.get(0), str);
    }

    @Test
    public void contains_ContainsOneElement_True() {
        StringListType stringList = new StringListType();
        stringList.add("a");
        assertTrue(stringList.contains("a"));
    }



}