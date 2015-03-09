
public class Main {

    public static void main(String[] args) {

        Publication [] publications = {new News(), new Article(), new Announcement()};

        for (int i = 0; i < publications.length ; i++) {
            publications[i].publish();
        }

    }
}
