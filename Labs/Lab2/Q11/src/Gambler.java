public class Gambler
{
  public static void main(String[] args)
  {
    int stake = Integer.parseInt(cin.linie());
    int goal = Integer.parseInt(cin.linie());
    int num_trials = Integer.parseInt(cin.linie());
    int bets = 0;
    int wins = 0;
    double prob=Double.parseDouble(cin.linie());

    for (int t = 0; t < num_trials; t++)
    {
      int cash = stake;
      while (cash > 0 && cash < goal)
      {
        bets++;
        if (Math.random() < prob ) cash++;
        else                      cash--;
      }
      if (cash == goal) wins++;
    }

    System.out.println(100 * wins/num_trials + "% wins");
    System.out.println("Avg # bets: " + bets/num_trials);

  }
}