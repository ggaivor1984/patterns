package proxy;

public class RealProject implements Project{
    private String Url;

    public RealProject(String url) {
        Url = url;
        load();
    }

    private void load() {
        System.out.println("Project is loading from " + Url);
    }

    @Override
    public void run() {
        System.out.println("Running Project..." + Url + "...");
    }
}
