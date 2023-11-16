package interfaces_graphic.TP2_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principale implements ActionListener {
    JFrame jf;
    JMenuBar mB;
    JMenu mF,mAF,mAP;
    JMenuItem ienregistrer,iquitter,iajouter,iafficher,page_3,iappropos;
    JOptionPane jp;

    public Principale(){
        this.Demmarer();
    }
    public void Demmarer(){
        jf=new JFrame("Gestion FST");
        jf.setSize(800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/N-Speaker/Desktop/t.png"));

        //  initialisation de  menubar
        mB=new JMenuBar();

        // les initialisations des  menus
        mF=new JMenu("Fichier");
        mAF=new JMenu("Afficher");
        mAP=new JMenu("Aide");

        //racoursies au clavier par alt + 'caracterer definie'
        mF.setMnemonic('F');
        mAF.setMnemonic('A');
        mAP.setMnemonic('I');

        // les initialisations des  items
        ienregistrer=new JMenuItem("Enregistrer");
        iquitter=new JMenuItem("Quitter");
        iquitter.addActionListener(this);
        iajouter=new JMenuItem("Ajouter_Etu");
        iajouter.addActionListener(this);
        iafficher=new JMenuItem("Afficher_Etu");
        iafficher.addActionListener(this);
        page_3=new JMenuItem("Page_3");
        iappropos=new JMenuItem("A propos");

        //add les menus en menubar
        mB.add(mF);
        mB.add(mAF);
        mB.add(mAP);

        //add les items en menus

            // à menu Fichier
        mF.add(ienregistrer);
        mF.add(iquitter);

            // à menu Afficher
        mAF.add(iajouter);
        mAF.add(iafficher);
        mAF.add(page_3);

            // à menu Apropos
        mAP.add(iappropos);





        jf.setJMenuBar(mB);
        jf.setLayout(null);
        jf.setVisible(true);
    };

    public static void main(String[] args) {
        new Principale();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src=e.getSource();
        if (src.equals(iquitter) ){
            System.exit(0);
        }
        if (src.equals(iajouter) ){

            AjouterEtudiant Aj=new AjouterEtudiant();
            jf.setContentPane(Aj.getPanel());

        }
        if (src.equals(iafficher) ){

            AfficherEtudiant Aff=new AfficherEtudiant();
            jf.setContentPane(Aff.getPanel());

        }
        if (src.equals(iappropos) ){
            jp=new JOptionPane();
            jp.showMessageDialog(null,"Zakaria KERROUMI","A propos",2);


        }
    }
}
