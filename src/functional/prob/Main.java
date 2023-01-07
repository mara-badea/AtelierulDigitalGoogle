package functional.prob;

import java.util.stream.Stream;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reader {
    Stream <String> reader;
    String adresa= "C:\\Users\\badea\\IdeaProjects\\AtelierulDigitalGoogle\\src\\functional\\prob\\text.txt";
    Integer count = reader
            .lines(adresa)
            .flatMap(line->{
                return Stream.of(line.split(" "));
                    })
            .count();
}
