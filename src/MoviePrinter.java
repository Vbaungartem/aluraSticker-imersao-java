import java.util.List;
import java.util.Map;

public class MoviePrinter {
    
    private static double rating = 0;
    private static final String  ANSI_RED= "\u001B[43m";
    private static final String  ANSI_BLACK= "\u001B[30m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void recebeLista(List<Map<String, String>> lista){

        for (Map<String, String> filme : lista) {

            System.out.println(ANSI_BLACK + ANSI_RED + "Título: " + filme.get("title") + ANSI_RESET);
            rating = Double.parseDouble(filme.get("imDbRating"));
            
            

            if(Double.valueOf(filme.get("imDbRating"))  >= 9){
                System.out.println("Rating: ⭐⭐⭐⭐⭐ - " + filme.get("imDbRating"));
            }
            if(Double.valueOf(filme.get("imDbRating"))  >= 8.8 && Double.valueOf(filme.get("imDbRating"))  < 9.0){
                System.out.println("Rating: ⭐⭐⭐⭐ - " + filme.get("imDbRating"));
            }
            if(Double.valueOf(filme.get("imDbRating"))  >= 8.6 && Double.valueOf(filme.get("imDbRating"))  < 8.8){
                System.out.println("Rating: ⭐⭐⭐ - " + filme.get("imDbRating"));
            }
            if(Double.valueOf(filme.get("imDbRating"))  >= 8.4 && Double.valueOf(filme.get("imDbRating"))  < 8.6){
                System.out.println("Rating: ⭐⭐ - " + filme.get("imDbRating"));
            }
            if(Double.valueOf(filme.get("imDbRating"))  <= 8.1){
                System.out.println("Rating: ⭐ - " + filme.get("imDbRating"));
            }
            System.out.println("Ranking: " + filme.get("rank"));
            System.out.println("Thumb: " + filme.get("image"));
        }
    }
}
