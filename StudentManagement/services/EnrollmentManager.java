package services;

import models.Student;
import models.Course;

public class EnrollmentManager {
	
	public void enroll(Student student, Course course){
		
		System.out.println(" Student " + student.getName() + " has been enrolled in " + course.getTitle() + " course ");
	}
}

	