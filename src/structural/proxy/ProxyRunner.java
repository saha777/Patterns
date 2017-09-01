package structural.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.kvadromir.com/kuznec/difur_14.21.html");
        project.run();
    }
}
