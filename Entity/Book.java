package Entity;

public class Book {
	private String title;
	private String author;
	private String category;
	private boolean availability;

	// Constructor
	public Book(String title, String author, String category, boolean availability) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.availability = availability;
	}

	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isAvailable() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public boolean isEmpty() {
        // Check if the title, author, or category is empty or null
        return (this.title == null || this.title.isEmpty()) &&
               (this.author == null || this.author.isEmpty()) &&
               (this.category == null || this.category.isEmpty());
    }

}
