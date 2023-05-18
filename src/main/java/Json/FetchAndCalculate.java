package Json;

public class FetchAndCalculate {

    private FetchJson _json;
    private Calculation _cal;

    public FetchAndCalculate(FetchJson json, Calculation calculation) {
        _json = json;
        _cal = calculation;
    }


    public int getAndProcess() throws Exception {
        String title = _json.fetch();
        int charLength = _cal.charLength(title);

        //Displays the total number of characters present in a sentence
        System.out.println("Total number of characters in a sentence: " + charLength);
        return charLength;
    }
}
