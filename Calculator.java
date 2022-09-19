package mypackage;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Calculator {

	private JFrame frame;
	private final JTextField res = new JTextField();
	
	double firstnum ;
	double secondnum ;
	double result ;
	String operation ;
	String answer ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rajuj\\Desktop\\calc.png"));
		frame.setBounds(100, 100, 593, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		res.setEditable(false);
		res.setBounds(31, 13, 447, 60);
		res.setFont(new Font("Tahoma", Font.BOLD, 20));
		res.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(res);
		res.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(UIManager.getColor("InternalFrame.inactiveBorderColor"));
		btn7.setBounds(48, 175, 60, 60);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternum = res.getText() + btn7.getText() ;
				res.setText(enternum) ;
			}
		});
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(125, 177, 60, 60);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn8.getText() ;
				res.setText(enternum) ;
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(202, 177, 60, 60);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn9.getText() ;
				res.setText(enternum) ;
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.setBounds(279, 312, 60, 60);
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(res.getText()) ;
				res.setText("") ;
				operation = "+" ;
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnplus);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(48, 242, 60, 60);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn4.getText() ;
				res.setText(enternum) ;
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(125, 244, 60, 60);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn5.getText() ;
				res.setText(enternum) ;
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(202, 244, 60, 60);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn6.getText() ;
				res.setText(enternum) ;
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn6);
		
		JButton btnmin = new JButton("-");
		btnmin.setBounds(279, 244, 60, 60);
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(res.getText()) ;
				res.setText("") ;
				operation = "-" ;
			}
		});
		btnmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnmin);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(48, 312, 60, 60);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn1.getText() ;
				res.setText(enternum) ;
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(125, 312, 60, 60);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn2.getText() ;
				res.setText(enternum) ;
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(202, 312, 60, 60);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn3.getText() ;
				res.setText(enternum) ;
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);
		
		JButton btnmul = new JButton("*");
		btnmul.setBounds(279, 177, 60, 60);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(res.getText()) ;
				res.setText("") ;
				operation = "*" ;
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnmul);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(48, 385, 60, 60);
		btn0.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		btn0.setForeground(Color.BLACK);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enternum = res.getText() + btn0.getText() ;
				res.setText(enternum) ;
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.setBounds(125, 385, 60, 60);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					if(!res.getText().contains(".")) {
					String point = res.getText() + "." ;
					res.setText(point);
				}
				}
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btndot);
		
		JButton btnpon = new JButton("+/-");
		btnpon.setBounds(202, 385, 60, 60);
		btnpon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(res.getText())) ;
				ops = ops*(-1) ;
				res.setText(String.valueOf(ops)) ;
			}
		});
		btnpon.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btnpon);
		
		JButton btndiv = new JButton("/");
		btndiv.setBounds(279, 104, 60, 60);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(res.getText()) ;
				res.setText("") ;
				operation = "/" ;
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btndiv);
		
		JButton btncalc = new JButton("=");
		btncalc.setBounds(279, 385, 60, 60);
		btncalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer ;
				secondnum = Double.parseDouble(res.getText()) ;
				if(operation == "+")
				{
					result = firstnum + secondnum ;
					answer = String.format("%.3f", result) ;
					res.setText(answer);
				}
				else if(operation == "-")
				{
					result = firstnum - secondnum ;
					answer = String.format("%.3f", result) ;
					res.setText(answer);
				}
				else if(operation == "*")
				{
					result = firstnum * secondnum ;
					answer = String.format("%.3f", result) ;
					res.setText(answer);
				}
				else if(operation == "/")
				{
					result = firstnum / secondnum ;
					answer = String.format("%.3f", result) ;
					res.setText(answer);
				}
				else if(operation == "%")
				{
					result = firstnum % secondnum ;
					answer = String.format("%.3f", result) ;
					res.setText(answer);
				}
				
			}
		});
		btncalc.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btncalc);
		
		JButton btnback = new JButton("<--");
		btnback.setBounds(48, 102, 60, 60);
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bspace = null ;
				if(res.getText().length()>0)
				{
					StringBuilder strB = new StringBuilder(res.getText()) ;
					strB.deleteCharAt(res.getText().length() -1) ;
					bspace = strB.toString() ;
					res.setText(bspace) ; 
				}
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(btnback);
		
		JButton btnclr = new JButton("C");
		btnclr.setBounds(125, 104, 60, 60);
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res.setText(null);
			}
		});
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnclr);
		
		JButton btnquo = new JButton("%");
		btnquo.setBounds(202, 104, 60, 60);
		btnquo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(res.getText()) ;
				res.setText("") ;
				operation = "%" ;
			}
		});
		btnquo.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnquo);
		
		JButton sin = new JButton("SIN");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(res.getText()) ;
				double b = (Math.sin(Math.toRadians(a)));
				res.setText(""+b);
			}
		});
		sin.setFont(new Font("Tahoma", Font.BOLD, 18));
		sin.setBounds(379, 118, 88, 60);
		frame.getContentPane().add(sin);
		
		JButton cos = new JButton("COS");
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(res.getText()) ;
				double b = (Math.cos(Math.toRadians(a)));
				res.setText(""+b);
			}
		});
		cos.setFont(new Font("Tahoma", Font.BOLD, 18));
		cos.setBounds(379, 206, 88, 60);
		frame.getContentPane().add(cos);
		
		JButton tan = new JButton("TAN");
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(res.getText()) ;
				double b = (Math.tan(Math.toRadians(a)));
				res.setText(""+b);
			}
		});
		tan.setFont(new Font("Tahoma", Font.BOLD, 18));
		tan.setBounds(48, 472, 115, 60);
		frame.getContentPane().add(tan);
		
		JButton sec = new JButton("SEC");
		sec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(res.getText()) ;
				double b = (Math.sin(Math.toRadians(a)));
				double c = 1/b ;
				res.setText(""+c);
			}
		});
		sec.setFont(new Font("Tahoma", Font.BOLD, 18));
		sec.setBounds(379, 290, 88, 60);
		frame.getContentPane().add(sec);
		
		JButton cosec = new JButton("COSEC");
		cosec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(res.getText()) ;
				double b = (Math.cos(Math.toRadians(a)));
				double c = 1/b ;
				res.setText(""+c);
			}
		});
		cosec.setFont(new Font("Tahoma", Font.BOLD, 18));
		cosec.setBounds(371, 381, 107, 60);
		frame.getContentPane().add(cosec);
		
		JButton cot = new JButton("COT");
		cot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(res.getText()) ;
				double b = (Math.tan(Math.toRadians(a)));
				double c = 1/b ;
				res.setText(""+c);
			}
		});
		cot.setFont(new Font("Tahoma", Font.BOLD, 18));
		cot.setBounds(202, 472, 102, 60);
		frame.getContentPane().add(cot);
		
		JButton sqr = new JButton("SQUARE");
		sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(res.getText()) ;
				double b = a*a ;
				res.setText(""+b);
			}
		});
		sqr.setFont(new Font("Tahoma", Font.BOLD, 18));
		sqr.setBounds(338, 472, 140, 55);
		frame.getContentPane().add(sqr);
			
	}
}
