package reactive.ch1;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CreateFlux {

        Flux<String> emptyFlux()
        {
            return Flux.empty();
        }
        Flux<String> fooBarFluxFromValues()
        {
            return Flux.just("foo","Bar");
        }
        Flux <String> fooBarFluxFromList()
        {
            List<String> lista = new ArrayList<>();
            lista.add("foo");
            lista.add("Bar");
            Flux<String> seq1=Flux.fromIterable(lista);
            return seq1;
        }
        Flux <String> errorFlux()
        {
            IllegalStateException e = new IllegalStateException();

            return Flux.error(e);
        }
        Flux <Long> counter()
        {
            return Flux.interval(Duration.ofMillis(100)).take(10);
        }
}
