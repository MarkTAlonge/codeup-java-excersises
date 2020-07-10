import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class IOLesson {
    public static void main(String[] args) {


        String directory = "gitIgnore";
        String filename = "gitIgnore";


        Path gitignore = Paths.get(".gitignore");

        System.out.println(Files.exists(Paths.get("gitignore")));




    }



}
