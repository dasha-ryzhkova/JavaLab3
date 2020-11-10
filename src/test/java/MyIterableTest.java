import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class MyIterableTest {

    private static class TypeA {}

    private interface TypeB {}

    private static class HasBoth extends TypeA implements TypeB {}

    @Test
    public void filter() {
//        HasBoth hasBoth = new HasBoth();
//        Iterable<TypeA> alist = Lists.newArrayList(new TypeA(), new TypeA(), hasBoth, new TypeA());
//        Iterable<TypeB> blist = Iterables.filter(alist, TypeB.class);
//        assertThat(blist).containsExactly(hasBoth).inOrder();
        List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        Iterable<String> result = Iterables.filter(names, Predicates.containsPattern("a"));

        //assertEquals(2, result.iterator());
        System.out.println(result);


    }

}
}