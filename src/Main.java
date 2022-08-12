public class Main {
    public static void main(String[] args) {
        Author john = new Author("John","John");
        Book bluesky = new Book("bluesky", john, 1999);
        Author sasha = new Author("Sasha","Sasha");
        Book blacksky = new Book("blacksky",sasha,2000);
        blacksky.setPublication_year(2001);
        Book[] arr = new Book[] {blacksky,bluesky,null,null,null};
        Book brownsky = new Book("brownsky",john,2005);
        addBook(brownsky,arr);
        System.out.println(john.equals(john));
    }

    public static void addBook(Book book, Book arr[]){
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == null){
                arr[i] = book;
                break;
            }
            i++;
        }
    }

    public static void printBooks(Book arr[]){
        int i = 0;
        while (i < arr.length){
            if (arr[i] != null){
                System.out.println(arr[i].getName() + ":" + arr[i].getTitle() + ":" + arr[i].getPublication_year());
            }
            i++;
        }
    }
}