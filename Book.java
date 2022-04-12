package odev;

public class Book implements IBook {
	
	protected int pages;
	private Publisher publisher;
	
	public Book (Publisher publisher) {
		
		this.publisher= publisher;
		
	}
	
	public Book (Publisher publisher, int pages) {
		
		this.publisher=publisher;
		this.pages=pages;
	}
	
	/*public int getPages () {
		
		return pages;
	}
	
	public void setPages(int numPages) {
		
		this.pages= numPages; 
	}*/
	
	public Publisher getPublisher () {
		
		return publisher;
	}
	
	public void setPublisher (Publisher publisher) {
		
		this.publisher= publisher;
	}

	@Override
	public int getPages() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public void setPages(int pages) {
		
		
	}

}
