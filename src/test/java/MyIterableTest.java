//import com.google.common.base.Predicate;
//import com.google.common.base.Predicates;
//import com.google.common.collect.Iterables;
//import com.google.common.collect.Lists;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;

import static org.junit.Assert.*;

public class MyIterableTest {

    @Test
    public void filterInteger() {
        List<Integer> list = Lists.newArrayList(1, 2, -3, 4, -5, 6, 7);
        List<Integer> result = Lists.newArrayList(2, 4, 6, 7);
        Predicate<Integer> n = num -> num >= 2;
        Iterable<Integer> list2 = MyIterable.filter(list, n);
        assertEquals(result, list2);
    }


    @Test
    public void filterFloat() {
        List<Float> list = Lists.newArrayList(0.2f, 0.6f, 1.2f, 9.12f, 10.12f, 2.1f, 6.1f,1.9f);
        List<Float> result = Lists.newArrayList(9.12f, 10.12f, 6.1f);
        Predicate<Float> f = num -> num >= 4;
        Iterable<Float> list2 = MyIterable.filter(list, f);
        assertEquals(result, list2);

    }
    @Test
    public void filterString() {
        List<String> list = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        List<String> result = Lists.newArrayList("John", "Tom");
        Predicate<String> s = str-> str.contains("o");
        Iterable<String> list2 = MyIterable.filter(list, s);
        assertEquals(result, list2);
    }

    @Test
    public void filterBoolean() {
        List<Boolean> list = Lists.newArrayList(true, false, true, true ,false);
        List<Boolean> result = Lists.newArrayList(false, false);
        Predicate<Boolean> b = bl-> bl == false;
        Iterable<Boolean> list2 = MyIterable.filter(list, b);
        assertEquals(result, list2);
    }

    @Test
    public void transformInteger() {
        List<Integer> list = Lists.newArrayList(2, 4, 6, 8);
        List<Integer> result = Lists.newArrayList(1, 2, 3, 4);
        Function<Integer,Integer> n = num -> num/2;
        Iterable<Integer> list2 = MyIterable.transform(list, n);
        assertEquals(result, list2);
    }
    @Test
    public void transformFloat() {
        List<Float> list = Lists.newArrayList(0.2f, 0.6f, 1.2f);
        List<Float> result = Lists.newArrayList(0.4f, 1.2f, 2.4f);
        Function<Float, Float> f = num -> num*2;
        Iterable<Float> list2 = MyIterable.transform(list, f);
        assertEquals(result, list2);
    }
    @Test
    public void transformString() {
        List<String> list = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        List<String> result = Lists.newArrayList("JOHN", "JANE", "ADAM", "TOM");
        Function<String, String> s = str-> str.toUpperCase();
        Iterable<String> list2 = MyIterable.transform(list, s);
        assertEquals(result, list2);
    }
    @Test
    public void transformBoolean() {
        List<Boolean> list = Lists.newArrayList(true, false, true, true ,false);
        List<Boolean> result = Lists.newArrayList(false, true, false, false, true);
        Function<Boolean, Boolean> b = bl-> !bl;
        Iterable<Boolean> list2 = MyIterable.transform(list, b);
        assertEquals(result, list2);
    }

}