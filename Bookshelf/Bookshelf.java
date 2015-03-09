
public class Bookshelf {

    @Override
    public int hashCode (){
        final int prime = 31;
        int result = 1;
        result = prime * result + width;
        result = prime * result + height;
        return result;
    }
    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Bookshelf bookshelf = (Bookshelf) obj;
        if (width != bookshelf.width & height != bookshelf.height) {
            return false;
        }
        return true;
    }

    int width;
    int height;

    public Bookshelf(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Bookshelf() {

    }
    public static void main(String[] args) {




        Bookshelf test = new Bookshelf();
        Bookshelf test1 = test;

        Bookshelf test2 = new Bookshelf(10, 20);
        Bookshelf test3 = new Bookshelf(10, 20);


        if (test == test1) {
            System.out.println("The links are equals");
        }
        if (test.equals(test1)){
            System.out.println("The links are equals");
        }
        if (test2 == test3){
            System.out.println("The data in this objects are equals");
        }
        if (test2.equals(test3)){
            System.out.println("The data in this objects are equals");
        }

    }
}
