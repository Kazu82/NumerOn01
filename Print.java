import java.util.ArrayList;

public class Print {
    Logic logic2 = new Logic();
    ArrayList<Integer> Arr = new ArrayList<>();

    public void printAnswer(int remain, ArrayList<Integer>  answerArr, ArrayList<Integer> numberArr) {
        if(logic2.eatCount(answerArr, numberArr) == 3) {
            System.out.println("正解です！");
            System.out.println(10 - remain +"回目でのクリアです！おめでとうございます！");
        }
        else {
            System.out.println("残念！");
            System.out.println("答えは");
            for(int i = 0; i < 3; i++){
                System.out.print(answerArr.get(i));
            }
            System.out.println("です。");
        }
    }
}
