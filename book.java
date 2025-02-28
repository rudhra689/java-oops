public class book {
    public String tittle;
    public String author;
    public int year_of_publication;
    
     public void tittle() {
         System.out.println("tittle_of_book");
}
     public void author() {
         System.out.println("author_of_book");
}
   
     public void year_of_publication() {
         System.out.println("year_of_publication");
}
     public book(String title, String author, int year_of_publication) {

        this.tittle = tittle;

        this.author = author;

        this.year_of_publication = year_of_publication;

}
     public static void main(String[] args) {
     // Creating an object of book class
           book book1 =new book("The Great Gatsby", "F. Scott Fitzgerald", 978-0743273565); 
       
          book1.tittle = "life_of_pie";
          book1author = "Jaya";
          book1.year_of_publication = 2005;
          book book2 = new book();
          book2.tittle = "dark";
          book2.author = "Jaya";
          book2.year_of_publication = 2006;


    }
}
