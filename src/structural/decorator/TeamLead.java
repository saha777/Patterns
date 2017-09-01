package structural.decorator;

public class TeamLead implements Developer{

    Developer developer;

    public TeamLead(Developer developer) {
        this.developer = developer;
    }

    public String makeCodeReport(){
        return "Team Lead report code ...";
    }

    @Override
    public String makeJob() {
        return developer.makeJob()+"\n"+makeCodeReport();
    }
}
