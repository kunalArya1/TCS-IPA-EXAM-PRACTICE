package IPA12;

import java.util.Scanner;

public class IPA12S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RRT [] arr = new RRT[4];
        for (int i = 0; i < arr.length; i++) {

            int ticketNo = sc.nextInt();sc.nextLine();
            String raiseBy = sc.nextLine();
            String assignedBY = sc.nextLine();
            int priority = sc.nextInt();sc.nextLine();
            String project = sc.nextLine();

            arr[i] = new RRT(ticketNo,raiseBy,assignedBY,priority,project);
        }

        String project = sc.nextLine();

        RRT result = getHighestPriorityTicket(arr,project);

        if (result != null){
            System.out.println(result.getTicketNo());
            System.out.println(result.getRaiseBy());
            System.out.println(result.getAssignedTo());
        }else{
            System.out.println("No such Ticket");
        }


    }
    public static RRT getHighestPriorityTicket(RRT [] rrt ,String project){
        RRT max = null;

        for (int i = 0; i < rrt.length; i++) {
            if (rrt[i].getProject().equals(project)){
                if ( max == null ||  rrt[i].getPriority() > max.getPriority()){
                    max = rrt[i];
                }
            }
        }
        if (max != null){
            return max;
        }
        else {

            return null;
        }
    }
}

class RRT{
    private int ticketNo;
    private String raiseBy;
    private String assignedTo;
    private int priority;
    private String project;

    public RRT(int ticketNo, String raiseBy, String assignedTo, int priority, String project) {
        this.ticketNo = ticketNo;
        this.raiseBy = raiseBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public String getRaiseBy() {
        return raiseBy;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public int getPriority() {
        return priority;
    }

    public String getProject() {
        return project;
    }
}