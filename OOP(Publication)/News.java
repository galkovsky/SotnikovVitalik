
public class News extends Publication {

    @Override
    public void publish() {

        title = "------NEWS-----";
        System.out.println(title + " " + data.getTime());
    }
}
