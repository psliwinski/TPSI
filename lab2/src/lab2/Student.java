/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Student extends Person {

    private String groupId;
    private List<Double> grades = new ArrayList<>();

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getGradesAverage() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum+grades.get(i);
        }
        return sum / grades.size();
    }

    public Student(String firstName, String lastName, String emailAddress, String groupId) {
        super(firstName, lastName, emailAddress);
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

}
