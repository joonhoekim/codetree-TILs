import java.util.Scanner;

public class Main {
  static int minDifference = Integer.MAX_VALUE;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] abilities = new int[6];

    for (int i = 0; i < 6; i++) {
      abilities[i] = scanner.nextInt();
    }

    divideTeams(abilities, new int[3], 0);

    System.out.println(minDifference);
  }

  static void divideTeams(int[] abilities, int[] teamAbilities, int idx) {
    if (idx == abilities.length) {
      int minTeamAbility = Integer.MAX_VALUE;
      int maxTeamAbility = Integer.MIN_VALUE;
      for (int teamAbility : teamAbilities) {
        minTeamAbility = Math.min(minTeamAbility, teamAbility);
        maxTeamAbility = Math.max(maxTeamAbility, teamAbility);
      }
      minDifference = Math.min(minDifference, maxTeamAbility - minTeamAbility);
      return;
    }

    for (int i = 0; i < teamAbilities.length; i++) {
      teamAbilities[i] += abilities[idx];
      divideTeams(abilities, teamAbilities, idx + 1);
      teamAbilities[i] -= abilities[idx];
    }
  }
}