/*
 * Osiris Sielatshom
 * CS 3560
 * RightOrWrongQuestions Class implementing the Question class
 */
package ivotesimulator;

/**
 *
 * @author Mr.V
 */
public class RightOrWrongQuestions extends Question {

    public RightOrWrongQuestions() {
        super();
    }
    
    
    //This methods updates the user answer if they chanege it
    public void setChoice(int index) {
		if(getSubmission(0) == false && getSubmission(1) == false) {
			setSubmission(index, true);
		}else if(index == 0 && getSubmission(1) == true) {
			setSubmission(index, true);
			setSubmission(1, false);
		}else if(index == 1 && getSubmission(0) == true) {
			setSubmission(index, true);
			setSubmission(0, false);
		}
	}
}
