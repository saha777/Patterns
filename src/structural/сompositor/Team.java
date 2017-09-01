package structural.сompositor;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Developer> developers;

    public Team() {
        developers = new ArrayList<>();
    }

    public void addDeveloper(Developer dev){
        developers.add(dev);
    }

    public void createProgram(){
        System.out.println("Developers create program!\n");
        for (Developer dev: developers) {
            dev.writeCode();
        }
    }
}
