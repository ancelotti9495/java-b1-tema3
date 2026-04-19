public class Book extends Product {
    private String author;

    public Book(int id, String name, double price, String author) {
        super(id, name, price);
        // TODO: call setAuthor
        setAuthor(author);
    }

    public Book(int id, String name, double price) {
        // TODO: call other constructor using "Unknown"
        super(id, name, price);
        this.author="Unknown";
    }

    public void setAuthor(String author) {
        // TODO: if author is null or empty, print "Author name cannot be empty." and assign "Unknown"
        if(author == null||author.isEmpty()){
            System.out.println("Author name cannot be empty.");
            this.author="Unknown";
        }else {
            // else assign the value
            this.author= author;      
    }
    }
    public String getAuthor() {
        // TODO: return author
        return author;
      
    }

    @Override
    public String toString() {
        // TODO: return the string in the format:
        // <id> - <name>: <price>€ - Author: <author>
       return getId()+" - "+getName()+": "+getPrice()+"€ - "+"Author: "+getAuthor();
    }
}
