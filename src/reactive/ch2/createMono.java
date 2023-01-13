package reactive.ch2;

import reactor.core.publisher.Mono;

public class createMono
{
    Mono<String> emptyMono()
    {
        return Mono.empty();
    }
    Mono<String> monoWithNoSignal()
    {
        return Mono.never();
    }
    Mono<String> fooMono()
    {
        return Mono.just("foo");
    }
    Mono<String> errorMono()
    {
        IllegalStateException e = new IllegalStateException();
        return Mono.error(e);
    }

}
