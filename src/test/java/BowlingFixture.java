import java.util.ArrayList;
import java.util.List;


public class BowlingFixture {

    private String name;
    private List<Integer> rolls = new ArrayList<Integer>();

    public void setName(String string){
        this.name = string;
        rolls = new ArrayList<Integer>();
    }


    public void setFrame(String roll){
        int[] result = parse(roll);
        for (int i : result) {
            rolls.add(i);
        }
    }

    public int score(){

        return -1;
    }

    public int size(){
        return rolls.get(rolls.size()-3);
    }

    private int[] rollsArray() {
        int[] rollsArray = new int[rolls.size()];
        int index = 0;
        for (int i : rolls) {
            rollsArray[index] = i;
            index++;
        }
        return rollsArray;
    }

    private int[] parse(String roll) {
        String[] items = roll.replaceAll("\\[", "").replaceAll("\\s+","").split(",");

        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {};
        }
        return results;
    }
}

