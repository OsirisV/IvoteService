/*
 * Osiris Sielatshom
 * CS 3560
 * Question Class
 */
package ivotesimulator;

import java.util.*;

/**
 *Question class with methods, construcors  that will be submitted to Voting Service
 * @author Mr.V
 */
public class Question {
    
    private boolean[] answers;
	
	public Question() {
		answers = new boolean[2];
	}
	
	public Question(int size) {
		answers = new boolean[size];
	}
	
	public boolean getSubmission(int index) {
		return answers[index];
	}
	
	public boolean[] getAnswers() {
		return answers;
	}
	
	public void setSubmission(int index, boolean tf) {
		answers[index] = tf;
	}
	
	public int getSize() {
		return answers.length;
        }
   
}
