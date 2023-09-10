package votingsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class votepagee extends JFrame implements ActionListener {
	
	JButton b1,b2,b3,b4,b5;
	int a,b,c,d;
	
	votepagee(){
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("shivsena.jpg")); 
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds (50,05,400,300);
		add(l1);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("AamAadmi.jpg")); 
		Image i5 = i4.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel l2=new JLabel(i6);
		l2.setBounds (800,05,400,300);
		add(l2);
		
		ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("bjp.jpg")); 
		Image i8 = i7.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		JLabel l3=new JLabel(i9);
		l3.setBounds (700,300,600,350);
		add(l3);
		
		ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("congressImg.png")); 
		Image i11 = i10.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		JLabel l4=new JLabel(i10);
		l4.setBounds (60,270,350,450);
		add(l4);
		
		
		b1 = new JButton("Vote");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.PLAIN,15));
		b1.setBounds(190, 280, 100,50);
		add(b1);
		
		b2 = new JButton("Vote");
		b2.addActionListener(this);
		b2.setFont(new Font("Tahoma", Font.PLAIN,15));
		b2.setBounds(940, 270, 100,50);
		add(b2);
		
		b3 = new JButton("Vote");
		b3.addActionListener(this);
		b3.setFont(new Font("Tahoma", Font.PLAIN,15));
		b3.setBounds(180, 630, 100,50);
		add(b3);
		
		b4 = new JButton("Vote");
		b4.addActionListener(this);
		b4.setFont(new Font("Tahoma", Font.PLAIN,15));
		b4.setBounds(950, 620, 100,50);
		add(b4);
		
		b5 = new JButton("Result");
		b5.addActionListener(this);
		b5.setFont(new Font("Tahoma", Font.PLAIN,15));
		b5.setBounds(600, 350, 100,50);
		add(b5);
		
		setBounds(0, 0, 1600, 800);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new votepagee();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			a = a + 1;
			JOptionPane.showMessageDialog(null,"Your vote is added to Shivsena");
		}else if(e.getSource() == b2) {
			b = b + 1;
			JOptionPane.showMessageDialog(null,"Your vote is added to Aam Aadmi Party");
		}else if(e.getSource() == b3) {
			d = d + 1;
			JOptionPane.showMessageDialog(null,"Your vote is added to Congress");
		}else if(e.getSource() == b4) {
			c = c + 1;
			JOptionPane.showMessageDialog(null,"Your vote is added to BJP");
		}else if(e.getSource() == b5) {
			JOptionPane.showMessageDialog(null,"Shivsena= " + a + "\n\n\nAam Aadmi Party= " + b + "\n\n\nBJP= " + c + "\n\n\nCongress= " + d);
		}
		
	}

}
