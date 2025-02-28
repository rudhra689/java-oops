public class book {
    public String tittle;
    public String author;
    public int year_of_publication;
    
     public void open() {
         System.out.println("tittle_of_book"+tittle);
         System.out.println("author_of_book"+author);
         System.out.println("year_of_publication"+year_of_publication);
}
    public void close() {
         System.out.println("tittle_of_book :"+tittle);
         System.out.println("author_of_book : "+author);
         System.out.println("year_of_publication :"+year_of_publication);
}
    
     public static void main(String[] args) {
     // Creating an object of book class
           book book1 =new book(); 
          book1.tittle = "life_of_pie";
          book1.author = "Jaya";
          book1.year_of_publication = 2005;
         book1.open();
          book book2 = new book();
          book2.tittle = "dark";
          book2.author = "Jaya";
          book2.year_of_publication = 2006;
         book2.close();
    }
}
