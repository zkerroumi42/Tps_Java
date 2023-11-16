package interfaces_graphic.TP2_Swing;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AjouterEtudiant implements ActionListener {
    JLabel lbcne;
    JTextField txtcne;
    JLabel lblnom;
    JLabel lblprenom;
    JLabel lblnaissance;
    JLabel lblmail;
    JLabel lblpass;
    JLabel lblgenre;
    JLabel lblpays;
    JLabel lbldiplom;
    JLabel lblphoto;
    JTextField txtnom;
    JTextField txtprenom;
    JTextField txtnaissance;
    JTextField txtmail;
    JPasswordField txtpass;
    JButton btnfile;
    JLabel lblshowurl;
    JButton btneffacer;
    JButton btnenregistrer;
    String photourl;
    JRadioButton radioH;
    JRadioButton radioF;
    JCheckBox boxl;
    JCheckBox boxm;
    JCheckBox boxd;
    ButtonGroup bg;
    JComboBox cmb;
    JLabel img;
    JPanel contenu;
    int x=30,y=30,ll=150,hl=27;
    public JPanel getPanel(){
        contenu = new JPanel();

        contenu.setBounds(0,0,800,600);

        lbcne=new JLabel("CNE:");
        lbcne.setBounds(x,y,ll,hl);
        txtcne=new JTextField("...");
        txtcne.setBounds(x+ll,y,ll,hl);
        contenu.add(lbcne);
        contenu.add(txtcne);

        lblnom=new JLabel("Nom:");
        lblnom.setBounds(x,y+hl+4,ll,hl);
        txtnom=new JTextField("...");
        txtnom.setBounds(x+ll,y+hl+4,ll,hl);
        contenu.add(lblnom);
        contenu.add(txtnom);

        lblprenom=new JLabel("Prénom:");
        lblprenom.setBounds(x,y*2+hl,ll,hl);
        txtprenom=new JTextField("...");
        txtprenom.setBounds(x+ll,y*2+hl,ll,hl);
        contenu.add(lblprenom);
        contenu.add(txtprenom);

        lblnaissance=new JLabel("Date de Naissance:");
        lblnaissance.setBounds(x,y*3+hl,ll,hl);
        txtnaissance=new JTextField("...");
        txtnaissance.setBounds(x+ll,y*3+hl,ll,hl);
        contenu.add(lblnaissance);
        contenu.add(txtnaissance);

        lblmail=new JLabel("Email:");
        lblmail.setBounds(x,y*4+hl,ll,hl);
        txtmail=new JTextField("...");
        txtmail.setBounds(x+ll,y*4+hl,ll,hl);
        contenu.add(lblmail);
        contenu.add(txtmail);

        lblpass=new JLabel("Mot de passe:");
        lblpass.setBounds(x,y*5+hl,ll,hl);
        txtpass=new JPasswordField("...");
        txtpass.setBounds(x+ll,y*5+hl,ll,hl);
        contenu.add(lblpass);
        contenu.add(txtpass);

        lblgenre=new JLabel("Genre :");
        lblgenre.setBounds(x,y*6+hl,ll,hl);
        contenu.add(lblgenre);
        bg=new ButtonGroup();
        radioH=new JRadioButton("Homme",true);
        radioH.setBounds(x+ll,y*6+hl,ll-39,hl);
        radioF=new JRadioButton("Femme",false);
        radioF.setBounds(x+ll+107,y*6+hl,ll,hl);
        bg.add(radioH);
        bg.add(radioF);
        contenu.add(radioH);
        contenu.add(radioF);

        lblpays=new JLabel("Pays :");
        lblpays.setBounds(x,y*7+hl,ll,hl);
        String py[]={"Maroc","Itzlic","Tunisi","Egept"};
        cmb=new JComboBox(py);
        cmb.setBounds(x+ll,y*7+hl,ll,hl);
        contenu.add(lblpays);
        contenu.add(cmb);

        lbldiplom=new JLabel("Diplomes :");
        lblpays.setBounds(x,y*8+hl,ll,hl);
        boxl=new JCheckBox("Licence");
        boxl.setBounds(x+ll,y*8+hl,ll/2,hl);
        boxm=new JCheckBox("¨Master");
        boxm.setBounds(x+ll+80,y*8+hl,ll/2,hl);
        boxd=new JCheckBox("Doctorat");
        boxd.setBounds(x+ll+160,y*8+hl,ll/2,hl);
        contenu.add(lbldiplom);
        contenu.add(boxl);
        contenu.add(boxm);
        contenu.add(boxd);

        lblphoto=new JLabel("Photo");
        lblphoto.setBounds(x,y*9+hl,ll,hl);
        btnfile=new JButton("Choisir Photo");
        btnfile.setBounds(x+ll,y*9+hl,ll,hl);
        lblshowurl=new JLabel("...");
        lblshowurl.setBounds(x+ll*2+20,y*9+hl,ll*2,hl);
        contenu.add(lblphoto);
        contenu.add(btnfile);
        contenu.add(lblshowurl);
        btnfile.addActionListener(this);


        btneffacer=new JButton("Effacer");
        btneffacer.setBounds(x+ll/2,y*13+hl,ll,hl);
        contenu.add(btneffacer);
        btneffacer.addActionListener(this);

        btnenregistrer=new JButton("Enregistrer");
        btnenregistrer.setBounds(x+ll*2,y*13+hl,ll,hl);
        contenu.add(btnenregistrer);
        btnenregistrer.addActionListener(this);

        img=new JLabel(new ImageIcon("C:/Users/N-Speaker/Desktop/t.png"));
        img.setBounds(x+ll*3,y+hl+4,ll+50,hl*6);
        contenu.add(img);


        contenu.setLayout(null);
        contenu.setVisible(true);
        return  contenu;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src=e.getSource();
        if (src.equals(btnfile) ){
            JFileChooser fc=new JFileChooser();
            fc.setDialogTitle("choisir la photo");
            fc.addChoosableFileFilter(new FileNameExtensionFilter("Images JPEG","jpg","jpeg"));
            fc.setAcceptAllFileFilterUsed(true);
            fc.showOpenDialog(null);

            File path=fc.getSelectedFile();
            String photo=path.getAbsolutePath();
            lblshowurl.setText(photo);
        }
        if (src.equals(btneffacer) ){
            JOptionPane jpeffacer=new JOptionPane();

            int rep=jpeffacer.showConfirmDialog(contenu, "vraiment?", "Effacer", 2,3);
            if(rep==0){  b  
                txtcne.setText(null);
                txtnom.setText("");
                txtprenom.setText("");
                txtmail.setText("");
                txtnaissance.setText("");
                txtpass.setText("");
                bg.setSelected(radioH.getModel(),true);
                cmb.setSelectedIndex(0);
                boxl.setSelected(false);
                boxm.setSelected(false);
                boxd.setSelected(false);
                lblshowurl.setText("");
                img.setText("");
            }else{
                JFileChooser filechooser=new JFileChooser();
                filechooser.showDialog(contenu,"choisir une photo");
            }


        }
        if (src.equals(btnenregistrer) ){
            String cne=txtcne.getText()+"\n";
            String nom=txtnom.getText()+"\n";
            String prenom=txtprenom.getText()+"\n";
            String date=txtnaissance.getText()+"\n";
            String email=txtmail.getText()+"\n";
            String pass=txtpass.getText()+"\n";
            String genre="";
            if(radioF.isSelected()){
                genre="F";
            }
            if(radioH.isSelected()){
                genre="H";
            }

            String py=(String)cmb.getSelectedItem();
            try {
                FileOutputStream out = new FileOutputStream("kerroumi.txt");
                out.write(cne.getBytes());
                out.write(nom.getBytes());
                out.write(prenom.getBytes());
                out.write(date.getBytes());
                out.write(email.getBytes());
                out.write(pass.getBytes());
                out.write(genre.getBytes());
                out.close();

            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        }

        }
    }

