import javax.swing.*; //for JFram and JPanel
import java.awt.*; //for color and container
import java.awt.event.*; //for mouse events
import java.io.*;

public class ArithView extends JFrame
{

	private ArithModel model;
	
	private JButton back = new JButton("Back");
	private JButton expli = new JButton("Explicit");
	private JButton sum = new JButton("Sum");
	private JButton recur = new JButton("Recursive");
	private JLabel credits = new JLabel("Created by Golden JAR Productions");

	//constructor
	
	public ArithView(ArithModel m)
	{
		model = m;
        JPanel northPanel = new JPanel(new GridLayout(0, 3, 5, 5));
        JPanel centerPanel = new JPanel();
        JPanel southPanel = new JPanel();
        Container container = getContentPane();
        container.add(northPanel, BorderLayout.NORTH);
        container.add(centerPanel, BorderLayout.CENTER);
        container.add(southPanel, BorderLayout.SOUTH);
        //Data access buttons
		
		//top row
		northPanel.add(expli);
		northPanel.add(sum);
		northPanel.add(recur);
		
        //middle row
		centerPanel.add(back);
		
		
		//bottom row
		southPanel.add(credits);
		
        setTitle("Equation Solver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
		
		//action listeners
		back.addActionListener (new BackListener());
        
        }
		
	// the controller
	private class BackListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			FormulasModel model = new FormulasModel();
			new FormulasView(model);
			dispose();
		}
	}
}