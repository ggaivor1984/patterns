package proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://github.com/some_project");
        project.run();
    }
}
