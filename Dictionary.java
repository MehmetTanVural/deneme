package odev;

public class Dictionary extends Book {
	
	private int definitions;
	//private Publisher publisher;
	
	
	public Dictionary (Publisher publisher) {
		
		this.publisher=publisher; 
	}
	
    public Dictionary (Publisher publisher, int pages) {
		
		this.publisher=publisher; 
		this.pages=pages;
	}
    
    public Dictionary (Publisher publisher, int pages, int definitions) {
		
		this.publisher=publisher; 
		this.pages=pages;
		this.definitions=definitions;
	}
    

}
