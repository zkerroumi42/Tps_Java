
package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame implements ActionListener{
    private static final long serialVersionUID = -8762552332257764873L;
	JLabel lblUsername, lblPassword, lblTitle;
	JTextField txtUsername;
	JPasswordField txtPassword;
	JButton btnValider, btnAnnuler;
	JPanel pNorth, pSouth, pCenter;
	
	Login() {
		lblTitle = new JLabel("Authentification");
		lblUsername = new JLabel("Nom d'utilisateur");
		lblPassword = new JLabel("Mot de passe");
		txtUsername = new JTextField(30);
		txtUsername.setFont(new Font("Arial", Font.BOLD, 20));
		txtPassword = new JPasswordField(30);
		txtPassword.setFont(new Font("Arial", Font.BOLD, 20));
		btnValider = new JButton("Valider");
		btnAnnuler = new JButton("Annuler");
		pNorth = new JPanel();
		pCenter = new JPanel();
		pSouth = new JPanel();
		
		pNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
		pNorth.add(lblTitle);
		
		pCenter.setLayout(new GridLayout(2, 2, 20, 20));
		pCenter.add(lblUsername); pCenter.add(txtUsername);
		pCenter.add(lblPassword); pCenter.add(txtPassword);
		
		pSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pSouth.add(btnAnnuler);
		pSouth.add(btnValider);
		
		this.setLayout(new BorderLayout());
		this.add(pNorth, BorderLayout.NORTH);
		this.add(pSouth, BorderLayout.SOUTH);
		this.add(pCenter, BorderLayout.CENTER);
		this.setTitle("Application");
		this.setSize(500, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		btnValider.addActionListener(this);
		btnAnnuler.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(btnValider)) {
			String username = txtUsername.getText();
			String password = txtPassword.getText();
			if(!username.equals("") && !password.equals("")) {
				BD database = new BD("zakaria");
				if (database.valider(username, password) != null)
					JOptionPane.showMessageDialog(null, "Bienvenue " + username, "Authentification réussite", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "Données incorrectes!", "Erreur d'authentification", JOptionPane.ERROR_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null, "Champs vides!", "Alerte", JOptionPane.WARNING_MESSAGE);
		}
		
		if(e.getSource().equals(btnAnnuler)) {
			txtUsername.setText("");
			txtPassword.setText("");
		}
		
	}

}                         

    
    

