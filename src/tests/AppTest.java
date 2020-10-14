package tests;

import org.junit.jupiter.api.Test;
import main.App;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest<T> {

    App<T> app = new App();

    @Test
    public void shouldFlattenIntList() {
//        List<Integer> intList = Arrays.asList(1,2,3,4,5);
//
//        assertNotNull(intList);
//        assertEquals(5, intList.size());
//        // assertEquals(5, App.methodName.size());
//        assertEquals(5,flattenArray(intList).size());
    }

    @Test
    public void shouldFlattenListofintLists() {

        List<Integer> intList1 = Arrays.asList(1,8);
        List<Integer> intList2 = Arrays.asList(null,null);
        List<Integer> intList3 = Arrays.asList(-4,0,12,null);

        List<List<Integer>> listList = Arrays.asList(intList1, intList2, intList3);

        assertNotNull(listList);
        assertEquals(3, listList.size());
        // assertEquals(6, App.methodName.size());
        assertEquals(5,app.flattenArray(listList).size());

    }

    @Test
    public <T> void shouldFlattenListofGenericLists() {

        List<T> intList1 = (List<T>)Arrays.asList("Hello", "hi", null, 6);
        List<T> intList2 = (List<T>)Arrays.asList("Hi",null);
        List<T> intList3 = (List<T>)Arrays.asList(-4,0,12,null);

        List<List<T>> listList = new ArrayList<>();
        listList.add(intList1);
        listList.add(intList2);
        listList.add(intList3);

        assertNotNull(listList);
        assertEquals(3, listList.size());
        // assertEquals(6, App.methodName.size());
        assertEquals(7,app.flattenArray(listList).size());

    }

}