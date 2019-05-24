import utils.MathUtil;
import utils.UIUtils;

public class Game {

    /*private int randomNum;
    private int digit;*/
    private static final int MAX_RANGE = 51;

    public void start() {
        do {
            //utils.MathUtil mathUtil = new utils.MathUtil(); MathUtils - static(call w/o object)
            int randomNum = MathUtil.generateRundomNum(MAX_RANGE);
            int digit;

            do {
                digit = UIUtils.readNum("Your digit: ");
            } while (!compare(digit, randomNum));

        } while (exit());
    }

    private boolean compare(int digit, int randomNum){
        if(digit > MAX_RANGE){
            System.out.println("more than max value");
            return false;
        }else if (digit == randomNum){
            System.out.println("Bingo!");
            return true;
        } else if (digit < randomNum){
            System.out.println("Greater..");
            return false;
        } else if (digit > randomNum) {
            System.out.println("Less..");
            return false;
        }
        return false;
    }

    private boolean exit(){
        return UIUtils.readInput("Continue? y/n").equals("y");
    }
}
