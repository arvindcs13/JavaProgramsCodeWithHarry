package javaCodeWHarry;

class Library{
	String []books;
	String book_name;
	int no_of_books;
	String []isseued_books;
	int no_issue_books;
	
	public Library() {
		this.books= new String[10];
		this.no_of_books=0;
		this.isseued_books= new String[5];
	}
	
	
	public void addBook(String book_name){
		   
           books[no_of_books]=book_name;
           no_of_books++;
                  
	}

	
	public void showAvailableBooks() {
		System.out.println("No of books available are :");
		for(String element :this.books) {
			if(element==null) {
				continue;
			}
			System.out.println(element);
		}
	}
	
	
	
	public void noOfAvailbooks() {
		System.out.println("Count of books available aree :"+no_of_books);
	}
	
	
	
	public void issueBook(String book_name ) {
		for(int i=0; i<this.books.length;i++) {
			if(this.books[i].equals(book_name)) {
				System.out.println(book_name +" Book has been issued");
				books[i]=null;
				return;
				}
			
		}
		
		System.out.println(this.book_name+ "does not exist !");
		
	}
	
	public void returnBook(String book) {
		addBook(book);
		System.out.println("Book has been returned");
	}
	
}

public class Cwh51_Excercise4 {
	

	public static void main(String[] args) {
		// You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
		Library l = new Library();
		l.addBook("Do");
		l.addBook("Die");
		l.addBook("Doing");
		l.addBook("Live");
		
//		l.showAvailableBooks();
        l.issueBook("Live");
//        l.showAvailableBooks();
        l.returnBook("Live");
        l.showAvailableBooks();
		
        
	}

}
