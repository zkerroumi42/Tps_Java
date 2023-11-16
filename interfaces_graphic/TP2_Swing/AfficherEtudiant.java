package interfaces_graphic.TP2_Swing;
import javax.swing.*;
import java.awt.*;

public class AfficherEtudiant {
    ButtonGroup bg;
    JRadioButton btncne;
    JRadioButton btnnom;
    JRadioButton btnnaissance;
    public JPanel getPanel(){
        JPanel contenu=new JPanel();
        contenu.setBounds(0,0,800,600);

        JPanel panel_tri=new JPanel();
        panel_tri.setBounds(0,0,300,600);
        panel_tri.setBackground(Color.red);

        JPanel info=new JPanel();
        info.setBounds(300,0,500,600);
        info.setBackground(Color.BLUE);

        JLabel lb_trie =new JLabel("Trie_par :");
        lb_trie.setBounds(0,600,200,100);
        panel_tri.add(lb_trie);
        bg=new ButtonGroup();
        btncne=new JRadioButton("CNE");
        btncne.setBounds(0,800,200,100);
        btnnom=new JRadioButton("Nom");
        btnnom.setBounds(0,1000,200,100);
        btnnaissance=new JRadioButton("DateNaiss");
        btnnaissance.setBounds(0,1100,200,100);
        bg.add(btncne);
        bg.add(btnnom);
        bg.add(btnnaissance);
        panel_tri.add(btncne);
        panel_tri.add(btnnom);
        panel_tri.add(btnnaissance);

        // jSplitpane
        JSplitPane jsplt=new JSplitPane();
        jsplt.setLeftComponent(panel_tri);
        jsplt.setRightComponent(info);
        jsplt.setBounds(0,0,800,600);


        contenu.add(jsplt);

        contenu.setLayout(null);
        contenu.setVisible(true);
        return contenu;
    }
}
