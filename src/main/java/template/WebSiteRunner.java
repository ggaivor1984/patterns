package template;

public class WebSiteRunner {
    public static void main(String[] args) {

        WelcomePage welcome = new WelcomePage();
        NewsPage news = new NewsPage();
        welcome.showPage();
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++==\n");
        news.showPage();
    }
}
