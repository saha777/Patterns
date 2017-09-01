package structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer teamLead = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(teamLead.makeJob());
    }
}
