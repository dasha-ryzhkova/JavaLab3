import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyIterable {
    public static  <T> Iterable<T> filter(Iterable<T> unfiltered, Predicate<? super T> retainIfTrue){
        List<T> res = new LinkedList<>();
        for(T var: unfiltered){
            if(retainIfTrue.test(var)){
                res.add(var);
            }
        }
        return res;
    }

    public static <F,T> Iterable<T> transform(Iterable<F> fromIterable, Function<? super F,? extends T> function){
        List<T> res = new LinkedList<>();
        for(F var: fromIterable){
                res.add(function.apply(var));
        }
        return res;
    }
}

