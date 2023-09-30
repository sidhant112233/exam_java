/*Create a java class Book with data member book_id, title and author. Initialize all member
variable value using default and parameterized constructor.*/

public class exam1{
    public static void main(String[] args){
        book b = new Book();
        b.book_id;
        b.title;
        b.author;
    }
}
class book{
    public void book_id(){
        System.out.println("book id = 52");
    }
    public void title(){
        System.out.println("title = bharat");
    }
    public void author(){
        System.out.println("author = xyz");
    }
}