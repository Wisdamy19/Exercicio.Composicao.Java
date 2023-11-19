package Exerc02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow, that's awesome");

        Date currentDate = new Date();
        Post p1 = new Post(sdf.parse("19/10/2000 13:05:43"), "Traveling to Tokyo",
                "I am going to the universe",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
