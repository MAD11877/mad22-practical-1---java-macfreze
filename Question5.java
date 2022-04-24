import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    int num = in.nextInt();

    ArrayList<Integer> numbers = new ArrayList();

    for(int i = 0; i < num ; i++){
      System.out.print("Input another number: ");
      int newNum = in.nextInt();

      numbers.add(newNum);
    }

      
    int mode = numbers.get(0);
    int maxCount = 0;
    for (int i = 0; i < numbers.size(); i++) {
        int number = numbers.get(i);
        int count = 1;
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) == number)
                count++;
            if (count > maxCount) {
                mode = number;
                maxCount = count;
            }
        }
    }

    System.out.print("Mode of your numbers is: " + mode);
    
  }
}
