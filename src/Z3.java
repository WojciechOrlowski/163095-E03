import java.io.File;
import java.util.List;
import java.util.stream.Stream;

public class Z3 {
    public static List<String> bezRozszerzenia(File file, String rozszerzenie){
        String[] wynik = file.list((x, y) -> true);
        Stream<String> stream = Stream.of(wynik).map(x -> x.substring(0, x.indexOf(rozszerzenie)));
        return stream.toList();
    }

    public static void main(String[] args){
        System.out.println(bezRozszerzenia(new File("D:\seriale"), ".java"));
    }
}
