package cs1102;
import javax.swing.*;

public class TrueFalseQuestion extends Question {

	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}
	TrueFalseQuestion(String question, String correctAnswer){
		super(question);
		JPanel buttons = new JPanel();
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		correctAnswer =correctAnswer.toUpperCase();
		if (correctAnswer.equals("F")||correctAnswer.equals("FALSE")||correctAnswer.equals("NO")||correctAnswer.equals("N"))
			this.correctAnswer = "FALSE";
		else if (correctAnswer.equals("T")||correctAnswer.equals("TRUE")||correctAnswer.equals("Y")||correctAnswer.equals("YES"))
			this.correctAnswer = "TRUE";
	}

}
