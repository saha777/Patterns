package structural.flyweight;


import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));
        developers.add(factory.getDeveloperBySpeciality("c++"));

        for (Developer developer : developers){
            developer.writeCode();
        }
    }
}
