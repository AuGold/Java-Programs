import javax.swing.*; //for JFram and JPanel
import java.awt.*; //for color and container
import java.awt.event.*; //for mouse events
import java.io.*;

public class APythagView extends JFrame
{

    private APythagModel model; //declares the model
    
    //declares the window objects 
    private JLabel A = new JLabel("A");
	private JLabel B = new JLabel("B");
	private JLabel C = new JLabel("C");
	private JLabel PythagTitle = new JLabel("Pythagorean Formula Solver");
	private JTextField aField = new JTextField("");
	private JTextField bField = new JTextField("");
	private JTextField cField = new JTextField("");
    private JButton solve = new JButton("Solve");
    private JButton back = new JButton("Back");
    
    // Constructor
    
    public APythagView(APythagModel m)
	{
		model = m;
		
		//set attributes to fields
		aField.setEditable(false);
		aField.setBackground(Color.white);
		bField.setBackground(Color.white);
		cField.setBackground(Color.white);
		
        //Set up panels to organize widgets and add them to the window
        JPanel northPanel = new JPanel();
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        JPanel southPanel = new JPanel();
        Container container = getContentPane();
        container.add(northPanel, BorderLayout.NORTH);
        container.add(centerPanel, BorderLayout.CENTER);
        container.add(southPanel, BorderLayout.SOUTH);
		
		//top row
		northPanel.add(PythagTitle);
		
        //middle row
		centerPanel.add(B);
		centerPanel.add(bField);
		centerPanel.add(C);
		centerPanel.add(cField);
		centerPanel.add(A);
		centerPanel.add(aField);
		
        //bottom row
		southPanel.add(back);
		southPanel.add(solve);
		
		
        setTitle("Equation Solver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
		
		//action listeners
		back.addActionListener (new BackListener());
		solve.addActionListener (new SolverListener());
        
        }
		
	// the controller
	private class BackListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			PythagModel model = new PythagModel();
			new PythagView(model);
			dispose();
		}
	}
	
	private class SolverListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String bInput = bField.getText();
			String cInput = cField.getText();
			double bNum = Double.parseDouble(bInput);
			double cNum = Double.parseDouble(cInput);
			double aNum = Math.sqrt(Math.pow(cNum, 2) - Math.pow(bNum, 2));
			aField.setText("" + aNum);
		}
	}
}