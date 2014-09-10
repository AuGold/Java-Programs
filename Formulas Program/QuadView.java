import javax.swing.*; //for JFram and JPanel
import java.awt.*; //for color and container
import java.awt.event.*; //for mouse events
import java.io.*;

public class QuadView extends JFrame
{

	private QuadModel model;
	
	private JButton back = new JButton("Back");
	private JButton solve = new JButton("Solve");
	private JLabel a = new JLabel("A");
	private JLabel b = new JLabel("B");
	private JLabel c = new JLabel("C");
	private JLabel xPos = new JLabel("+X");
	private JLabel xNeg = new JLabel("-X");
	private JLabel quadTitle = new JLabel("Quadratic Formula Solver");
	private JTextField aField = new JTextField("");
	private JTextField bField = new JTextField("");
	private JTextField cField = new JTextField("");
	private JTextField xPosField = new JTextField("0");
	private JTextField xNegField = new JTextField("0");
	
	public QuadView(QuadModel m)
	{
		
		model = m;
		
		//set attributes to fields
		xPosField.setEditable(false);
		xNegField.setEditable(false);
		xPosField.setBackground(Color.white);
		xNegField.setBackground(Color.white);
		aField.setBackground(Color.white);
		bField.setBackground(Color.white);
		cField.setBackground(Color.white);
		
		//set up panels to organize widgets
		JPanel northPanel = new JPanel();
		JPanel centerPanel = new JPanel(new GridLayout(3, 4, 10, 5));
		JPanel southPanel = new JPanel();
		Container container = getContentPane();
		container.add(northPanel, BorderLayout.NORTH);
		container.add(centerPanel, BorderLayout.CENTER);
		container.add(southPanel, BorderLayout.SOUTH);
		
		//add widgets to window
		//north
		northPanel.add(quadTitle);
		
		//row 1 - center
		centerPanel.add(a);
		centerPanel.add(aField);
		centerPanel.add(xPos);
		centerPanel.add(xPosField);
		
		//row 2 - center
		centerPanel.add(b);
		centerPanel.add(bField);
		centerPanel.add(xNeg);
		centerPanel.add(xNegField);
		
		//row 3 - center
		centerPanel.add(c);
		centerPanel.add(cField);
		
		//south
		southPanel.add(back);
		southPanel.add(solve);
		
		//action listeners
		back.addActionListener (new BackListener());
		solve.addActionListener (new SolverListener());
		
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
	
	private class SolverListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String aInput = aField.getText();
			String bInput = bField.getText();
			String cInput = cField.getText();
			double aNum = Double.parseDouble(aInput);
			double bNum = Double.parseDouble(bInput);
			double cNum = Double.parseDouble(cInput);
			double xPosNum = (-bNum + Math.sqrt((Math.pow(bNum, 2)) - (4 * aNum * cNum))) / (2 * aNum);
			double xNegNum = (-bNum - Math.sqrt((Math.pow(bNum, 2)) - (4 * aNum * cNum))) / (2 * aNum);
			xPosField.setText("" + xPosNum);
			xNegField.setText("" + xNegNum);
		}
	}
			
}