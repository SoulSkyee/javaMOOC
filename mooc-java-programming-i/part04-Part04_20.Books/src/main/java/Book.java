public class Book {
    private String title;
    private int page;
    private int publicYear;

    public Book(String title, int page, int publicYear){
        this.title = title;
        this.page = page;
        this.publicYear = publicYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPage() {
        return this.page;
    }

    public int getpublicYear(){
        return this.publicYear;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getPage() + " pages, " + getpublicYear();
    }
}
