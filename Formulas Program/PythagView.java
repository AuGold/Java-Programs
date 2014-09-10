import javax.swing.*; //for JFram and JPanel
import java.awt.*; //for color and container
import java.awt.event.*; //for mouse events
import java.io.*;

public class PythagView extends JFrame
{

	private PythagModel model;
	
	private JButton back = new JButton("Back");
	private JButton aButton = new JButton("A");
	private JButton bButton = new JButton("B");
	private JButton cButton = new JButton("C");
	private JLabel pythagTitle = new JLabel("What do you want to solve for?");
	private JLabel credits = new JLabel("Created by Golden JAR Productions");
	
	public PythagView(PythagModel m)
	{
		
		model = m;
		
		//set up panels to organize widgets
		JPanel northPanel = new JPanel();
		JPanel centerPanel = new JPanel(new GridLayout(0, 3, 10, 5));
		JPanel southPanel = new JPanel();
		Container container = getContentPane();
		container.add(northPanel, BorderLayout.NORTH);
		container.add(centerPanel, BorderLayout.CENTER);
		container.add(southPanel, BorderLayout.SOUTH);
		
		//add widgets to window
		//north
		northPanel.add(pythagTitle);
		
		//center
		centerPanel.add(aButton);
		centerPanel.add(bButton);
		centerPanel.add(cButton);
		centerPanel.add(new JLabel(""));
		centerPanel.add(back);
		
		//south
		southPanel.add(credits);
		
		//action listeners
		back.addActionListener (new BackListener());
		aButton.addActionListener (new AButtonListener());
		bButton.addActionListener (new BButtonListener());
		cButton.addActionListener (new CButtonListener());
		
		setTitle("Equation Solver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	
	private class BackListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			AlgebraModel model = new AlgebraModel();
			new AlgebraView(model);
			dispose();
		}
	}
	
	private class AButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			APythagModel model = new APythagModel();
			new APythagView(model);
			dispose();
		}
	}
	
	private class BButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			BPythagModel model = new BPythagModel();
			new BPythagView(model);
			dispose();
		}
	}
	
	private class CButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			CPythagModel model = new CPythagModel();
			new CPythagView(model);
			dispose();
		}
	}
}