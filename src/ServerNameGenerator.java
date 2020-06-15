import org.w3c.dom.ls.LSOutput;

import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {


        String[] Adj = {
                "Bitter ",
                "Bland",
                "Delicious",
                "Fruity",
                "Gingery",
                "Minty",
                "Pickled",
                "Salty",
                "Sweet",
                "Tangy"

        };
        Random random = new Random();
        int index = random.nextInt(Adj.length);
        System.out.println(Adj[index]);

        String[] Noun = {
                "China",
                "Jack",
                "Shop",
                "Brush",
                "Niagra Falls",
                "Nile",
                "Bird",
                "Chocolate",
                "Sony",
                "Camera"

        };
        Random random2 = new Random();
        int index2 = random2.nextInt(Noun.length);
        System.out.println(Noun[index2]);
        System.out.println("Your new name is " + Adj[index]  + " - " + Noun[index2]);
    }

}