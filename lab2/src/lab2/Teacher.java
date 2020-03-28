/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Student
 */
public class Teacher extends Person {

    private String courseName;

    public Teacher(String firstName, String lastName, String groupId, String coursename) {
        super(firstName, lastName, groupId);
        this.courseName = courseName;
    }

    public String getCoursename() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
