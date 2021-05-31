import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TDD {

    /*
    Realizar 3 unit tests por cada uno de los siguientes requerimientos para una lista:

    We need to get the size of the list
    - getSizeOfList()
    - getSizeOfListEmpty()
    - getSizeOfListNull()
    - getSizeOfListWhenRemovingElements()

    We need to clear the list
    - clearList()
    - clearEmptyList()
    - clearNullList()

    We need to add Items
    - addItemsToEmptyList
    - addItemsToNullList
    - addItemsToInitList

    We need to be able to check if an item exists
    - findItemOnEmptyList
    - findItemOnNullList
    - findItemOnList

    We need to get elements by index
    - getElementOnEmptyList
    - getElementOnNullList
    - getElementOnList

    We need to search the index of an object
    - findIndexOnEmptyList
    - findIndexOnNullList
    - findIndexOnList

    We need to remove an item by index
    - removeItemOnEmptyList
    - removeItemOnNullList
    - removeItemOnList

    */


    // Tests for size of list
    @Test
    public void getSizeOfList(){
        // Init scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Test
        assertEquals(4, list.size());
    }
    @Test
    public void getSizeOfListEmpty() {
        // Init scenario
        List<Integer> list = new ArrayList<>();

        // Test
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        // Init scenario
        List<Integer> list = null;

        // Test
        list.size();
    }

    @Test
    public void getSizeOfListWhenRemovingElements() {
        // Init scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Test
        assertEquals(4, list.size());

        list.remove(1);

        // Test after removing
        assertEquals(3, list.size());
    }

    // Tests for clearing the list
    @Test
    public void clearList() {
        // Init scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        // Test
        assertEquals(0, list.size());
    }

    @Test
    public void clearEmptyList(){
        // Init scenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void clearNullList(){
        List<Integer> list = null;

        list.clear();
    }

    // Tests for adding elements

    @Test
    public void addItemsToEmptyList(){
        List<Integer> list = new ArrayList<>();

        list.add(1);

        assertEquals(1, list.size());

    }

    @Test(expected = NullPointerException.class)
    public void addItemsToNullList(){
        List<Integer> list = null;

        list.add(1);
    }

    @Test
    public void addItemsToInitList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);

        assertEquals(5, list.size());
    }

    // Tests if an item exists
    @Test
    public void findItemOnEmptyList(){
        List<Integer> list = new ArrayList<>();

        assertFalse(list.contains(1));
    }

    @Test(expected = NullPointerException.class)
    public void findItemOnNullList(){
        List<Integer> list = null;

        list.contains(1);
    }

    @Test
    public void findItemOnList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertTrue(list.contains(4));

    }

    // Test for getting elements

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementOnEmptyList(){
        List<Integer> list = new ArrayList<>();

        list.get(0);
    }

    @Test(expected = NullPointerException.class)
    public void getElementOnNullList(){
        List<Integer> list = null;

        list.get(0);
    }

    @Test
    public void getElementOnList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(2, (int) list.get(1));
    }

    //Tests for finding index

    @Test
    public void findIndexOnEmptyList(){
        List<Integer> list = new ArrayList<>();

        assertEquals(-1, list.indexOf(0));
    }

   @Test(expected = NullPointerException.class)
   public void findIndexOnNullList(){
       List<Integer> list = null;
       list.indexOf(0);
   }

   @Test
    public void findIndexOnList(){
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);

       assertEquals(   1,(int) list.indexOf(2));
   }

    //Tests for deleting item by index

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeItemOnEmptyList(){
        List<Integer> list = new ArrayList<>();

        list.remove(0);
    }

    @Test(expected = NullPointerException.class)
    public void removeItemOnNullList(){
        List<Integer> list = null;

        list.remove(0);
    }

    @Test
    public void removeItemOnList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(0);

        assertEquals(3,(int) list.get(1));
    }
}
