import javax.swing.*; //for JFram and JPanel
import java.awt.*; //for color and container
import java.awt.event.*; //for mouse events
import java.io.*;

public class AlgebraView extends JFrame
{

	private AlgebraModel model;
	
	private JButton back = new JButton("Back");
	private JButton quadratic = new JButton("Quadratic Formula");
	private JButton pythag = new JButton("Pythagorean Theorem");
	private JButton arith = new JButton("Arithmetic");
	private JButton geom = new JButton("Geometric");
	private JLabel credits = new JLabel("Created by Golden JAR Productions");

	//constructor
	
	public AlgebraView(AlgebraModel m)
	{
		model = m;
        JPanel northPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        JPanel centerPanel = new JPanel();
        JPanel southPanel = new JPanel();
        Container container = getContentPane();
        container.add(northPanel, BorderLayout.NORTH);
        container.add(centerPanel, BorderLayout.CENTER);
        container.add(southPanel, BorderLayout.SOUTH);
        //Data access buttons
		
		//top row
		northPanel.add(quadratic);
		northPanel.add(pythag);
		northPanel.add(arith);
		northPanel.add(geom);
		
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
		quadratic.addActionListener (new QuadListener());
		pythag.addActionListener (new PythagListener());
		arith.addActionListener (new ArithListener());
        
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

	private class QuadListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			QuadModel model = new QuadModel();
			new QuadView(model);
			dispose();
		}
	}
	
	private class PythagListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			PythagModel model = new PythagModel();
			new PythagView(model);
			dispose();
		}
	}
	
	private class ArithListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ArithModel model = new ArithModel();
			new ArithView(model);
			dispose();
		}
	}
}