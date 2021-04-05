import java.util.ArrayList;
import java.util.Random;

public class Logic {
    
    private ArrayList<Integer> threeNumberArr = new ArrayList<Integer>();

    public ArrayList<Integer> getThreeNumberArr() {
        return this.threeNumberArr;
    }

    public void createThreeNumber() {
        for(;;) {
            for(int i = 0; i < 3; i++){
                Random rand = new Random();
                threeNumberArr.add(rand.nextInt(10));
            }
            if(threeNumberArr.get(0) != threeNumberArr.get(1) && threeNumberArr.get(0) != threeNumberArr.get(2) && threeNumberArr.get(1) != threeNumberArr.get(2) ) {
                break;
            }
        }
    }

    public int biteCount(ArrayList<Integer> answerArr, ArrayList<Integer> numberArr) {
        int biteCount = 0;
        if(answerArr.get(0) == numberArr.get(1) || answerArr.get(0) == numberArr.get(2)) {
            biteCount++;
        }
        if(answerArr.get(1) == numberArr.get(0) || answerArr.get(1) == numberArr.get(2)) {
            biteCount++;
        }
        if(answerArr.get(2) == numberArr.get(0) || answerArr.get(2) == numberArr.get(1)) {
            biteCount++;
        }
        return biteCount;
    }

    public int eatCount(ArrayList<Integer> answerArr, ArrayList<Integer> numberArr) {
        int eatCount = 0;
        for(int i = 0; i < 3; i++) {
            if(answerArr.get(i) == numberArr.get(i)){
                eatCount++;
            }
        }
        return eatCount;
    }

}
