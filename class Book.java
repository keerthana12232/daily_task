class Book {
    String title; 
    String author; 
    int age;     
    
  
    public Book() {
        this.title = "book1";
        this.author = "Keerthana";  
    }

  
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

  
    public void introduce() {
        System.out.println("Title: " + title);  
        System.out.println("Author: " + author); 
    }

    public static void main(String[] args) {
       
        Book person1 = new Book("Life is full of miracles", "Keerthana");
        person1.introduce();  
    }
}
