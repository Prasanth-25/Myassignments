package week1.day2;

    class Library {

    public String addBook(String bookTitle){
        System.out.println("Book added successfully: " + bookTitle);
        return bookTitle;
    }
    public void issueBook(){
        System.out.println("Issue book successfully");
    }
        public static void main(String[] args) {
            Library lib = new Library();
           String book = lib.addBook("Java Programming");
           System.out.println("Added book:" + book);
           lib.issueBook();
        }
}
