
public class Article extends Publication {

    @Override
    public void publish() {

        title = "------ARTICLE------";
        System.out.println(title + " " + data.getTime());
    }
}
