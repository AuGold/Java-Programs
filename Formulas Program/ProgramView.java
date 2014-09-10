//page 372 in Java book

import javax.swing.*; //for JFram and JPanel
import java.awt.*; //for color and container
import java.awt.event.*; //for mouse events
public class FormulasView extends JFrame{

    private FormulasModel model;//declares the model
    
    //declares the window objects 
    private JButton algebra1 = new JButton("Algebra 1");
    private JButton geometry = new JButton("Geometry");
    private JButton algebra2 = new JButton("Algebra 2");
    private JButton physics = new JButton("Physics");
    private JButton calculus = new JButton("Calculus");
    private JButton stats = new JButton("Statistics");
    private JButton chemistry = new JButton("Chemistry");
    private JButton exit = new JButton("Exit");
    private JLabel aVariable = new JLabel("A");
    private JLabel bVariable = new JLabel("B");
    private JLabel cVariable = new JLabel("C");
    private JLabel dVariable = new JLabel("D");
    private JLabel eVariable = new JLabel("E");
    private JLabel fVariable = new JLabel("F");
    private JLabel gVariable = new JLabel("G");
    private JLabel hVariable = new JLabel("H");
    private JLabel iVariable = new JLabel("I");
    private JLabel jVariable = new JLabel("J");
    private JLabel kVariable = new JLabel("K");
    private JLabel lVariable = new JLabel("L");
    private JLabel mVariable = new JLabel("M");
    private JLabel nVariable = new JLabel("N");
    private JLabel oVariable = new JLabel("O");
    private JLabel pVariable = new JLabel("P");
    private JLabel qVariable = new JLabel("Q");
    private JLabel rVariable = new JLabel("R");
    private JLabel sVariable = new JLabel("S");
    private JLabel tVariable = new JLabel("T");
    private JLabel uVariable = new JLabel("U");
    private JLabel vVariable = new JLabel("V");
    private JLabel wVariable = new JLabel("W");
    private JLabel xVariable = new JLabel("X");
    private JLabel yVariable = new JLabel("Y");
    private JLabel zVariable = new JLabel("Z");
    private JTextField answerField = new JTextField("0");
    
    // Constructor
    
    public FormulasView(FormulasModel m){
		model = m;
        //set attributes to fields
        answerField.setEditable(false);
        answerField.setBackground(Color.white);
        //Set up panels to organize widgets and add them to the window
        JPanel northPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel southPanel = new JPanel();
        Container container = getContentPane();
        container.add(northPanel, BorderLayout.NORTH);
        container.add(centerPanel, BorderLayout.CENTER);
        container.add(southPanel, BorderLayout.SOUTH);
        //Data access buttons
        northPanel.add(algebra1);
        northPanel.add(algebra2);
        northPanel.add(geometry);
        northPanel.add(stats);
        //row 1
        centerPanel.add(physics);
        centerPanel.add(chemistry);
        centerPanel.add(calculus);
        //row 2
        southPanel.add(exit);
        setTitle("Equation Solver");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        }
    }  
        
        
        
        
        
        
        
        
        