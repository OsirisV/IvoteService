/*
 * Osiris Sielatshom
 * CS 3560
 * Voting Service Class
 */
package ivotesimulator;
import java.util.*;

/**
 *This class stores etails of a vote/submission of a student
 * @author Osiris Sielatshom
 */
public class VotingService {
    int id;
    Question prompt;
    Question answer;
    Student submission;
    Hashtable<String, boolean[]> submissions; //stores students' ID with their answer
    Question q;
    private int[] results;
    private ArrayList<String> names;
    
    //Vote/Submission constructor
    public VotingService(int id, Question question, Question answer, Student submission){
        this.id = id;
        this.submission = submission;
        this.prompt = prompt;
        this.answer = answer;
    }
    public VotingService(Question type, ArrayList<String> roster, Hashtable<String, boolean[]> data) {
		q = type;
		submissions = data;
		results = new int[type.getSize()];
		names = roster;
	}
    
    //this takes into account the number of submissions
    private void resultTally() {
		boolean[] choices;
		for(int i = 0; i < names.size(); i++) {
			choices = submissions.get(names.get(i));
			for(int j = 0; j < q.getSize(); j++) {
				if(choices[j] == true) {
					results[j]++;
				}
			}
		}
	}
    
    public void output() {
		resultTally();
		char letter = 'A';
		for(int i = 0; i < results.length; i++) {
			letter += i;
			System.out.println(letter + ": " + results[i]);
		}
		System.out.println("Number of submissions: " + names.size());
	}
}
