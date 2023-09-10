package votingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VotingSystem extends JFrame implements ActionListener {
	
	VotingSystem(){
		setBounds(0,0,1600,800);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel l1 = new JLabel ("Welcome to");
		l1.setFont(new Font("Tahoma", Font.BOLD,50));
		l1.setBounds (150,230,300,100);
		add(l1);
		
		JLabel l2 = new JLabel ("online voting system");
		l2.setFont(new Font("Tahoma", Font.BOLD,50));
		l2.setBounds (50,300,700,100);
		add(l2);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("voteImg.png")); 
		JLabel l3=new JLabel(i1);
		Image i2 = i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l3.setBounds(700, 100, 600, 400);
		add(l3);
		
		JButton b1 = new JButton("Next");
		b1.setFont(new Font("Tahoma", Font.PLAIN,20));
		b1.addActionListener(this);
		b1.setBounds(500, 500, 300, 80);
		add(b1);
		
		setLayout(null);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new VotingSystem();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new votepagee().setVisible(true);
		
	}

}
