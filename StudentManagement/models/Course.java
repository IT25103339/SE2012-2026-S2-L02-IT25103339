package models;

public class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    // Implement the methods below
	
	public String getCode(){
		return code;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String toString(){
		return "Course [Code: " + code + ", Title: " + title + "]";
	}		
}