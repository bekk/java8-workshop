import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * Sett opp et github repo
 *
 *
 *
 * IntStream og Stream<Integer> er to sider av samme sak.
 * <p>
 * "This is the {@code int} primitive specialization of
 * {@link java.util.stream.Stream}."
 *
 * http://java.dzone.com/articles/why-theres-interface
 * More generally: the philosophy behind having specialized primitive streams (e.g., IntStream) is fraught
 * with nasty tradeoffs. On the one hand, it’s lots of ugly code duplication, interface pollution, etc. On the other hand,
 * any kind of arithmetic on boxed ops sucks, and having no story for reducing over ints would be terrible.
 * So we’re in a tough corner, and we’re trying to not make it worse.

 Trick #1 for not making it worse is: we’re not doing all eight primitive types. We’re doing int, long, and double;
 all the others could be simulated by these. Arguably we could get rid of int too, but we don’t think most Java
 developers are ready for that. Yes, there will be calls for Character, and the answer is “stick it in an int.”
 (Each specialization is projected to ~100K to the JRE footprint.)

 Trick #2 is: we’re using primitive streams to expose things that are best done in the primitive domain (sorting, reduction)
 but not trying to duplicate everything you can do in the boxed domain. For example, there’s no IntStream.into(), as Aleksey
 points out. (If there were, the next question(s) would be “Where is IntCollection? IntArrayList? IntConcurrentSkipListMap?)
 The intention is many streams may start as reference streams and end up as primitive streams, but not vice versa. That’s OK, and
 that reduces the number of conversions needed (e.g., no overload of map for int -> T, no specialization of Function for int -> T, etc.)
 */
public class IntStreamStreamForskjell {

    @Test
    public void lagIntStreams() throws Exception {

        //Stream<int>

        IntStream
                .range(1, 6)
                .filter(v -> v < 5)
                .map(v -> v)
                .forEach(v -> System.out.println("intstream v = " + v));

        double gjennomsnitt = IntStream
                .builder()
                .add(1)
                .add(2)
                .add(3)
                .build()
                .filter(t -> t > 1)
                .average().orElse(999.0);
        System.out.println("gjennomsnitt = " + gjennomsnitt);

        long antall = IntStream
                .iterate(1, f -> f + 1)
                .limit(10l)
                .count();
        System.out.println("antall = " + antall);

    }


    @Test
    public void lagStream() throws Exception {

        // Stream
        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(v -> v < 5)
                .map(v -> v)
                .forEach(v -> System.out.println("stream v = " + v));

        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);

        List<Integer> tallListe = IntStream
                .iterate(1, f -> f + 1)
                .limit(10l)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("tallListe = " + tallListe);

    }


}
