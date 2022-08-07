public class Book {

    private String title;
    private Author name;
    private int publication_year;

    public Book(String title,Author name,int publication_year){
        this.title = title;
        this.name = name;
        this.publication_year = publication_year;
    }

    public String getTitle(){
        return this.title;
    }

    public Author getName(){
        return this.name;
    }

    public int getPublication_year(){
        return this.publication_year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setName(Author name){
        this.name = name;
    }

    public void setPublication_year(int publication_year){
        this.publication_year = publication_year;
    }

}
