/*
 * Osiris Sielatshom
 * CS 3560
 * Student Class
 */
package ivotesimulator;

import java.util.Scanner;
import java.util.*;

/*
 *We want to take the studen'ts id and store them in an arraylist
 */

public class Student {

    private ArrayList<String> roster;

    //Student constructor
    public Student() {
        roster = new ArrayList<String>();
    }

    //student id getter method
    public ArrayList<String> getStudentId() {
        return roster;
    }

    public String getStudentId(int index) {
        return roster.get(index);
    }

    //set id for student
    public void setId(String name) {
        roster.add(name);

    }

    //set number of submissions
    public int getSize() {
        return roster.size();
    }

}
