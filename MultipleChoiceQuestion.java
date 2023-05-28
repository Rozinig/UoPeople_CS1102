package cs1102;
import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer){
		super(query);
		correctAnswer = answer.toUpperCase();
	} // End MultipleChoiceQuestion constructor
	
	void addChoice(String name, String label) {
		JPanel choice = new JPanel(new BorderLayout());
		JButton button = new JButton(name);
		button.addActionListener(question);
		choice.add(button.BorderLayout.WEST);
		choice.add(new JLabel(label+"     ",Jabel.LEFT).BorderLayout.Center);
		
	}
}
