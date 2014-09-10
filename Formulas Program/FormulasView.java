
//page 372 in Java book

import javax.swing.*; //for JFram and JPanel
import java.awt.*; //for color and container
import java.awt.event.*; //for mouse events
import java.io.*;
public class FormulasView extends JFrame
{

    private FormulasModel model; //declares the model
    
    //declares the window objects 
    private JButton algebra1 = new JButton("Algebra 1");
    private JButton geometry = new JButton("Geometry");
    private JButton algebra2 = new JButton("Algebra 2");
    private JButton physics = new JButton("Physics");
    private JButton calculus = new JButton("Calculus");
    private JButton stats = new JButton("Statistics");
    private JButton chemistry = new JButton("Chemistry");
    private JButton exit = new JButton("Exit");
	private JLabel credits = new JLabel("Created by Golden JAR Productions");
    
    // Constructor
    
    public FormulasView(FormulasModel m)
	{
		model = m;
		
        //Set up panels to organize widgets and add them to the window
        JPanel northPanel = new JPanel();
        JPanel centerPanel = new JPanel(new GridLayout(0, 3, 5, 5));
        JPanel southPanel = new JPanel();
        Container container = getContentPane();
        container.add(northPanel, BorderLayout.NORTH);
        container.add(centerPanel, BorderLayout.CENTER);
        container.add(southPanel, BorderLayout.SOUTH);
		
		//top row
        northPanel.add(algebra1);
        northPanel.add(algebra2);
        northPanel.add(geometry);
        northPanel.add(stats);
		
        //middle row
        centerPanel.add(physics);
        centerPanel.add(chemistry);
        centerPanel.add(calculus);
		centerPanel.add(new JLabel(""));
		centerPanel.add(exit);
		
        //bottom row
		southPanel.add(credits);
		
		
        setTitle("Equation Solver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
		
		//action listeners
		exit.addActionListener (new ExitListener());
		/*stats.addActionListener (new StatsListener());
		geometry.addActionListener (new GeometryListener());
		algebra2.addActionListener (new AdvancedAlgebraListener());*/
		algebra1.addActionListener (new AlgebraListener());
		/*physics.addActionListener (new PhysicsListener());
		chemistry.addActionListener (new ChemistryListener());
		calculus.addActionListener (new CalculusListener());*/
        
        }
		
	// the controller
	private class ExitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	private class AlgebraListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			AlgebraModel model = new AlgebraModel();
			new AlgebraView(model);
			dispose();
		}
	}
}