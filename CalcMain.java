import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CalcMain implements ActionListener
{
	JFrame frame; 
	static final int WIDTH = 250, HEIGHT=400; 
	JTextField text; 
	JPanel panel; 
	JButton[] numberButtons = new JButton[10]; 
	JButton[] funcButtons = new JButton[12]; 
	JButton mult, div, sub, add; 
	JButton dec, equ, del, clr, neg, pi, pow, sqrt;
	char operator ; 
	double num1 = 0 , num2 = 0, result=0; 
	Font font = new Font("Monospaced", Font.BOLD, 20); 
	String temp; 
	
	
	CalcMain()
	{
		frame = new JFrame("CALCULATOR"); 
		frame.setLocationRelativeTo(null);
		frame.setSize(420, 550); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		text = new JTextField(); 
		text.setBounds(30, 25, 350, 50);
		text.setFont(font);
		text.setEditable(false);
		
	
		
		JButton add = new JButton("+"); 
		JButton sub = new JButton("-"); 
		JButton mult = new JButton("*"); 
		JButton div = new JButton("/"); 
		JButton neg = new JButton("(-)"); 
		JButton dec = new JButton("."); 
		JButton equ = new JButton("="); 
		JButton del = new JButton("DEL"); 
		JButton clr = new JButton("CLR"); 
		JButton pi = new JButton("\u03C0"); 
		JButton sqrt = new JButton("x\u221A");
		JButton pow = new JButton("^");
		
		
		funcButtons[0] = add; 
		funcButtons[1] = sub; 
		funcButtons[2] = mult; 
		funcButtons[3] = div; 
		funcButtons[4] = neg; 
		funcButtons[5] = dec; 
		funcButtons[6] = equ; 
		funcButtons[7] = del; 
		funcButtons[8] = clr; 
		funcButtons[9] = pi; 
		funcButtons[10] = sqrt;
		//funcButtons[11] = neg;
		funcButtons[11] = pow;
		
		
		
		
		
		
		
		
		for(int y = 0;  y<funcButtons.length; y++)
		{

			funcButtons[y].addActionListener(this);
			funcButtons[y].setFocusable(false);
			funcButtons[y].setFont(font);
		}
		
		
		del.setBounds(50,430,155,50); 
		clr.setBounds(215,430,155,50);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 320, 300);
		panel.setLayout(new GridLayout(5,4,10,10));
		panel.setBackground(Color.GRAY);
		
		for(int i =0 ; i<numberButtons.length; i++)
		{
			numberButtons[i] = new JButton(String.valueOf(i)); 
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(font);
			numberButtons[i].setFocusable(false);
		
			
		}
		
		
		
		
		// Making The buttons appear on screen
		
		panel.add(numberButtons[1]); 
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(add);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(sub);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mult);
		panel.add(numberButtons[0]);
		panel.add(dec);
		panel.add(equ);
		panel.add(div);
		panel.add(pow);
		panel.add(pi); 
		panel.add(sqrt);
		panel.add(neg);
		
		
		frame.add(panel);
		frame.add(clr); 
		frame.add(del); 
		frame.add(text); 
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		CalcMain calc = new CalcMain() ;
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		for(int i = 0; i<10 ; i++)
		{
			if(e.getSource() == numberButtons[i])
			{
				text.setText(text.getText().concat(String.valueOf(i))); 
			}
		}
		
		// for the operands and equal signs use the different nums and operand char
		
       // also the clear and the delete buttons
		
		//5th Row 
		if(e.getSource() == funcButtons[9])
		{
			text.setText(text.getText().concat("\u03C0"));
			
		}
		// root
		if(e.getSource() == funcButtons[10])
		{
			if(text.getText().equals("\u03C0"))
			{
				num1 = Math.PI; 
			}else 
			{
				num1 = Double.parseDouble(text.getText());
			}
			operator = 'R'; 
			text.setText(text.getText().concat("\u221A")); 
			
		}
		if(e.getSource() == funcButtons[4])
		{
			text.setText(text.getText().concat("-"));
			
		}
		// pow
		if(e.getSource() == funcButtons[11])
		{
			if(text.getText().equals("\u03C0"))
			{
				num1 = Math.PI; 
			}else 
			{
				num1 = Double.parseDouble(text.getText());
			}
			operator = '^'; 
			text.setText(text.getText().concat("^")); 
			
		}
		//5th Row end
		
		
		if(e.getSource() == funcButtons[5])
		{
			text.setText(text.getText().concat(".")); 
		}
		if(e.getSource() == funcButtons[0])
		{
			if(text.getText().equals("\u03C0"))
			{
				num1 = Math.PI; 
			}else 
			{
				num1 = Double.parseDouble(text.getText());
			}
			operator = '+'; 
			text.setText(text.getText().concat("+")); 
			
		}
		if(e.getSource() == funcButtons[1])
		{
			if(text.getText().equals("\u03C0"))
			{
				num1 = Math.PI; 
			}else 
			{
				num1 = Double.parseDouble(text.getText());
			}
			operator = '-'; 
			text.setText(text.getText().concat("-")); 
			
		}
		if(e.getSource() == funcButtons[2])
		{
			if(text.getText().equals("\u03C0"))
			{
				num1 = Math.PI; 
			}else 
			{
				num1 = Double.parseDouble(text.getText());
			}
			operator = '*'; 
			text.setText(text.getText().concat("*")); 
			
		}
		if(e.getSource() == funcButtons[3])
		{
			if(text.getText().equals("\u03C0"))
			{
				num1 = Math.PI; 
			}else 
			{
				num1 = Double.parseDouble(text.getText());
			}
			operator = '/'; 
			text.setText(text.getText().concat("/")); 
			
		
		}
		if(e.getSource() == funcButtons[7])
		{
			if(text.getText()!="")
			{
				
				StringBuffer sb = new StringBuffer(text.getText());
				sb.deleteCharAt(sb.length()-1);
				text.setText(String.valueOf(sb)); 
				
			}
			
		
		}
		if(e.getSource() == funcButtons[8])
		{
		
			text.setText(""); 
			
		}
		if(e.getSource() == funcButtons[6])
		{
			switch(operator)
			{
			case '/':
				if(text.getText().substring(text.getText().lastIndexOf("/")+1).equals("\u03C0"))
				{
					num2 = Math.PI; 
				}else
				{
					num2 = Double.parseDouble(text.getText().substring(text.getText().lastIndexOf("/")+1));
				}
				
				break; 
			case '*':
				if(text.getText().substring(text.getText().lastIndexOf("*")+1).equals("\u03C0"))
				{
					num2 = Math.PI; 
				}else
				{
					num2 = Double.parseDouble(text.getText().substring(text.getText().lastIndexOf("*")+1));
				}
				
				break; 
			case '-':
				if(text.getText().substring(text.getText().lastIndexOf("-")+1).equals("\u03C0"))
				{
					num2 = Math.PI; 
				}else
				{
					num2 = Double.parseDouble(text.getText().substring(text.getText().lastIndexOf("-")+1));
				}
				
				break; 
			case '+':
				if(text.getText().substring(text.getText().lastIndexOf("+")+1).equals("\u03C0"))
				{
					num2 = Math.PI; 
				}else
				{
					num2 = Double.parseDouble(text.getText().substring(text.getText().lastIndexOf("+")+1));
				}
				
				break; 
			case '^':
				if(text.getText().substring(text.getText().lastIndexOf("^")+1).equals("\u03C0"))
				{
					num2 = Math.PI; 
				}else
				{
					num2 = Double.parseDouble(text.getText().substring(text.getText().lastIndexOf("^")+1));
				}
				
				break; 
			case 'R':
				if(text.getText().substring(text.getText().lastIndexOf("+")+1).equals("\u03C0"))
				{
					num2 = Math.PI; 
				}else
				{
					num2 = Double.parseDouble(text.getText().substring(text.getText().lastIndexOf("\u221A")+1));
				}
				
				break; 
				
			}
			
			
			result = CalcBrain.math(num1, num2, operator); 
			
			text.setText(String.valueOf(result)); 
			
			
		}
	
	}
}
