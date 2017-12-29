import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MealTimeTwo {

    public static void main(String[] args) {

        askWhatYouAteFor("breakfast");
        askWhatYouAteFor("lunch");
        askWhatYouAteFor("dinner");
    }

    public static void askWhatYouAteFor(String meal) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What did you eat for " + meal + "?");
            String yourMeal = bufferedReader.readLine();
            System.out.println("You had " + yourMeal + " for " + meal + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}