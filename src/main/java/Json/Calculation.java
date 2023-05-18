package Json;

public class Calculation {

    /**
     * Counts each character except space in a Sentence
     *
     * @param title
     * @return int
     */
    public int charLength(String title) {
        int count = 0;


        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) != ' ')
                count++;
        }
        return count;
    }
}
