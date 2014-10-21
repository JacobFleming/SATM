//**********************************************************
// Assignment: SATM
//
// Author: Jacob Fleming
//
//
//*********************************************************

package edu.cbu.egr320.satm.guiclasses;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;


public class Screen12 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Screen12() {
		setLayout(null);
		
		JLabel lblTemporarilyUnableTo = new JLabel("Temporarily unable to");
		lblTemporarilyUnableTo.setBounds(111, 45, 104, 14);
		lblTemporarilyUnableTo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(lblTemporarilyUnableTo);
		
		JLabel lblProcessDeposits = new JLabel("process deposits.");
		lblProcessDeposits.setBounds(121, 63, 84, 14);
		lblProcessDeposits.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(lblProcessDeposits);
		
		JLabel lblAnotherTransaction = new JLabel("Another transaction?");
		lblAnotherTransaction.setBounds(112, 81, 101, 14);
		lblAnotherTransaction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(lblAnotherTransaction);
		
		JLabel lblNewLabel = new JLabel("Yes");
		lblNewLabel.setBounds(296, 96, 17, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(lblNewLabel);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setBounds(296, 135, 13, 14);
		lblNo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(lblNo);

	}
	
}
