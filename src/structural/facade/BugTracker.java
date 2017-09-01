package structural.facade;

public class BugTracker {
    private boolean sprint;

    public boolean getSprint(){
        return sprint;
    }

    public void startSprint(){
        System.out.println("Sprint is running ...");
        sprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is finishing ...");
        sprint = false;
    }
}
