/*
 * Osiris Sielatshom
 * CS 3560
 * Ivote Simulator class
 * This class calls all the methods and functions from all other classes and has a random number generator that produces random
 * random results
 */
package ivotesimulator;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class IVoteSimulator {

    public static void main(String[] args) {
        
        Question q;
        int numStudents = (int)(Math.random() * 25 + 1);
        Student roster2 = new Student();
		String[] choices2 = {"1", "2", "3", "4"};
		Random rand2 = new Random();
		int pick2; //the answer choice the computer will choose
		int howMany = (int)(Math.random() * 4 + 1); //the amount of answers the computer will choose
		Hashtable<String, boolean[]> submissions2 = new Hashtable<String, boolean[]>();
                for(int i = 0; i < numStudents; i++) {
			q = new MultipleQuestions(4);
			roster2.setId(Integer.toString(i));
			for(int j = 0; j < howMany; j++){
				pick2 = rand2.nextInt(4);
				if(choices2[pick2].equals("1")) {
					q.setSubmission(0, true);
				}else if(choices2[pick2].equals("2")){
					q.setSubmission(1, true);
				}else if(choices2[pick2].equals("3")){
					q.setSubmission(2, true);
				}else {
					q.setSubmission(3, true);
				}
			}
			submissions2.put(Integer.toString(i), q.getAnswers());
		}
		
		q = new MultipleQuestions(4);
		VotingService iv = new VotingService(q, roster2.getStudentId(), submissions2);
		iv.output();
		
        
    }
}
