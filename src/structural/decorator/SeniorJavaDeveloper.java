package structural.decorator;

public class SeniorJavaDeveloper implements Developer {
    Developer developer;
    public SeniorJavaDeveloper(Developer developer) {
        this.developer = developer;
    }

    public String makeCodeReview(){
        return "Senior review code";
    }

    @Override
    public String makeJob() {
        return developer.makeJob()+"\n"+makeCodeReview();
    }
}
