
public class Announcement extends Publication {

    @Override
    public void publish() {

        title = "------ANNOUNCEMENT------";
        System.out.println(title + " " + data.getTime());
    }
}
