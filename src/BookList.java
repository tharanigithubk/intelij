import java.util.ArrayList;
import java.util.List;
class Book {
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int getId(){
       return id;
    }
    public void setId(int newId){
        this.id=newId;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String newAuthor){
        this.author=newAuthor;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String newPublisher){
        this.publisher=newPublisher;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int newQuantity){
        this.quantity=newQuantity;
    }
}
public class BookList {
        public static void main(String[] args) {
            List<Book>list = new ArrayList<Book>();
            Book b1 = new Book(101, "Quantitative aptitude", "R.s.agarwal", "nandhini", 6);
            Book b2 = new Book(102, "data communication and networking", "forouzan", "m c graw hill", 5);
            Book b3 = new Book(103, "operating system", "galvin", "wiley", 7);
            list.add(b1);
            list.add(b2);
            list.add(b3);
            for (Book b:list) {
                System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
            }
        }
    }





