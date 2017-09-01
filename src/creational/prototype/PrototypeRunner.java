package creational.prototype;


public class PrototypeRunner {
    public static void main(String[] args) {
        Project project = new Project(1, "Super Project", "SourceProject sp = new SourceProject();");
        ProjectFactory factory = new ProjectFactory(project);
        System.out.println(project);
        System.out.println(factory.copyProject());
    }
}
