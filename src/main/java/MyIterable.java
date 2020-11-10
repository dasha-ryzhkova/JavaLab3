import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyIterable {

    //Returns a view of unfiltered containing all elements that satisfy the input predicate retainIfTrue.



    public static  <T> Iterable<T> filter(Iterable<T> unfiltered, Predicate<? super T> retainIfTrue){
        //Iterable<String> result = Iterable.filter(names, Predicate.containsPattern("a"));
        List<T> res = new LinkedList<>();
        for(T var: unfiltered){
            if(retainIfTrue.test(var)){
                res.add(var);
            }
        }
//        Iterator<T> iterable = new Iterator<T>() {
//            @Override
//            public Iterator<T> iterator() {
//                return null;
//            }
//        };
        return res;
    }

    /**
     * Returns a view of {@code unfiltered} containing all elements that satisfy the input predicate
     * {@code retainIfTrue}. The returned iterable's iterator does not support {@code remove()}.
     *
     * <p><b>{@code Stream} equivalent:</b> {@link Stream#filter}.
     */
//    public static <T> Iterable<T> filter(
//            final Iterable<T> unfiltered, final Predicate<? super T> retainIfTrue) {
//        checkNotNull(unfiltered);
//        checkNotNull(retainIfTrue);
//        return new FluentIterable<T>() {
//            @Override
//            public Iterator<T> iterator() {
//                return Iterators.filter(unfiltered.iterator(), retainIfTrue);
//            }
//
//            @Override
//            public void forEach(Consumer<? super T> action) {
//                checkNotNull(action);
//                unfiltered.forEach(
//                        (T a) -> {
//                            if (retainIfTrue.test(a)) {
//                                action.accept(a);
//                            }
//                        });
//            }
//
//            @Override
//            public Spliterator<T> spliterator() {
//                return CollectSpliterators.filter(unfiltered.spliterator(), retainIfTrue);
//            }
//        };
//    }



//    public static <F,T> Iterable<T> transform(Iterable<F> fromIterable, Function<? super F,? extends T> function){
//        Iterable<T> iterable = new Iterable<T>() {
//            @Override
//            public Iterator<T> iterator() {
//                return null;
//            }
//        };
//        return iterable;
//
//    }

    /**
     * Returns a view containing the result of applying {@code function} to each element of {@code
     * fromIterable}.
     *
     * <p>The returned iterable's iterator supports {@code remove()} if {@code fromIterable}'s
     * iterator does. After a successful {@code remove()} call, {@code fromIterable} no longer
     * contains the corresponding element.
     *
     * <p>If the input {@code Iterable} is known to be a {@code List} or other {@code Collection},
     * consider {@link Lists#transform} and {@link Collections2#transform}.
     *
     * <p><b>{@code Stream} equivalent:</b> {@link Stream#map}
     */
//    public static <F, T> Iterable<T> transform(
//            final Iterable<F> fromIterable, final Function<? super F, ? extends T> function) {
//        checkNotNull(fromIterable);
//        checkNotNull(function);
//        return new FluentIterable<T>() {
//            @Override
//            public Iterator<T> iterator() {
//                return Iterators.transform(fromIterable.iterator(), function);
//            }
//
//            @Override
//            public void forEach(Consumer<? super T> action) {
//                checkNotNull(action);
//                fromIterable.forEach((F f) -> action.accept(function.apply(f)));
//            }
//
//            @Override
//            public Spliterator<T> spliterator() {
//                return CollectSpliterators.map(fromIterable.spliterator(), function);
//            }
//        };
//    }


    //Returns a view containing the result of applying function to each element of fromIterable.
    public static <F,T> Iterable<T> transform(Iterable<F> fromIterable, Function<? super F,? extends T> function){
        List<T> res = new LinkedList<>();
        for(F var: fromIterable){
                res.add(function.apply(var));
        }
        return res;
    }
}

