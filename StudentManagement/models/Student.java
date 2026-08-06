package models;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implement the methods below
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "Student [ID: " + id + ", Name: " + name + "]";
	}		
		
}