/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Faculty implements EmailRecipient {

    private String emailAddress;
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
