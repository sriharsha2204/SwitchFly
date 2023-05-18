package Json;

public class Calculation {

    public int charLength(String title)
    {
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < title.length(); i++) {
            if(title.charAt(i) != ' ')
                count++;
        }
        return count;
    }
}
