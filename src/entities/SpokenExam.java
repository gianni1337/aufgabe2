/**
 * 
 */
package entities;

import java.util.Date;

/**
 * The SpokenExam class extends Assessment and inherits all its methods. The
 * subtype was created for better expandability.
 * 
 * @author Gruppe222
 * 
 */
public class SpokenExam extends Assessment {

	/**
	 * Default constructor
	 * 
	 * @param title
	 * @param maxStudentNumber
	 * @param dateOfAssessment
	 * @param firstRegDate
	 * @param lastRegDate
	 * @param lastDeRegDate
	 */
	public SpokenExam(String title, int maxStudentNumber,
			Date dateOfAssessment, Date firstRegDate, Date lastRegDate,
			Date lastDeRegDate) {
		super(title, maxStudentNumber, dateOfAssessment, firstRegDate, lastRegDate,
				lastDeRegDate);
	}

}
