package functional.prob;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String adresa= "C:\\Users\\badea\\IdeaProjects\\AtelierulDigitalGoogle\\src\\functional\\prob\\text.txt";
        BufferedReader reader= new BufferedReader(new FileReader(adresa));
        long count = reader
                .lines()
                .flatMap(line->{
                    //System.out.println(line);
                    return Stream.of(line.split("\n"));
                })
                .count();
        System.out.println(count);
    }

}
