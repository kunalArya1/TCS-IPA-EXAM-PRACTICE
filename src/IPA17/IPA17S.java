package IPA17;

import java.util.Scanner;

public class IPA17S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player [] arr = new Player[4];
        for (int i = 0; i < arr.length; i++) {
            int playerId = sc.nextInt();sc.nextLine();
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = sc.nextInt();sc.nextLine();

            arr[i] = new Player(playerId,skill,level,points);
        }
        String skills = sc.nextLine();
        String level  = sc.nextLine();

        int returnValue = findPointsForGivenSkill(arr,skills);
        if(returnValue > 0 ){
            System.out.println(returnValue);
        }else{
            System.out.println("The given Skill is not available");
        }
        Player result = getPlayerBasedOnLevel(arr,level,skills);
        if (result != null){
            System.out.println(result.getPlayerId());
        }else {
            System.out.println("No player is available with specified level, skill\n" +
                    "and eligibility points");
        }
    }
    public static int findPointsForGivenSkill(Player [] players ,String skills){
        int sum = 0;
        for (int i = 0; i < players.length; i++) {
            if(players[i].getSkill().equalsIgnoreCase(skills)){
                sum += players[i].getPoint();
            }
        }
        if (sum > 0){
            return sum;
        }else {
            return 0;
        }
    }

    public static Player getPlayerBasedOnLevel(Player [] players ,String level,String skills){
        for (int i = 0; i < players.length; i++) {
            if(players[i].getLevel().equalsIgnoreCase(level) && players[i].getSkill().equalsIgnoreCase(skills) && players[i].getPoint() >= 20 ){
                return players[i];
            }
        }
        return null;
    }
}

class Player {
    private int playerId;
    private String skill;
    private String level;
    private int point;

    public Player(int playerId, String skill, String level, int point) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.point = point;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getSkill() {
        return skill;
    }

    public String getLevel() {
        return level;
    }

    public int getPoint() {
        return point;
    }
}