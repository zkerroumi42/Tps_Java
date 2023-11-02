package interfaces_graphic;
import java.awt.*;


public class Gestion  {
    Frame fen;
    Label lblnom;
    Label lblprenom;
    Label lblnaissance;
    Label lblmail;
    Label lblpass;
    Label lblgenre;
    Label lblpays;
    Label lbldiplom;
    Label lblcomments;
    Label lblphoto;
    TextField txtnom;
    TextField txtprenom;
    TextField txtnaissance;
    TextField txtmail;
    TextField txtpass;
    CheckboxGroup boxgroup;
    Checkbox boxH;
    Checkbox boxF;
    Choice choice;
    Checkbox l;
    Checkbox m;
    Checkbox d;
    TextArea area;
    Button file;
    Label showurl;
    Button effacer;
    Button enregistrer;





    int x=30,y=30,ll=200,hl=30;
    public Gestion(){
        this.demarrer();
    }
    public void demarrer(){

        fen =new Frame("Gestion FST");
        fen.setSize(600,500);

        lblnom=new Label("Nom:");
        lblnom.setBounds(x,y,ll,hl);
        fen.add(lblnom);
        txtnom=new TextField("votre nom");
        txtnom.setBounds(x+ll+5,y,ll,hl);
        fen.add(txtnom);

        lblprenom=new Label("Prénom:");
        lblprenom.setBounds(x,y+hl+5,ll,hl);
        fen.add(lblprenom);
        txtprenom=new TextField("votre prenom");
        txtprenom.setBounds(x+ll+5,y+hl+5,ll,hl);
        fen.add(txtprenom);

        lblnaissance=new Label("Date de Naissance:");
        lblnaissance.setBounds(x,y*2+hl+5,ll,hl);
        fen.add(lblnaissance);
        txtnaissance=new TextField("mm/dd/yyyy");
        txtnaissance.setBounds(x+ll+5,y*2+hl+5,ll,hl);
        fen.add(txtnaissance);

        lblmail=new Label("Mail:");
        lblmail.setBounds(x,y*3+hl+5,ll,hl);
        fen.add(lblmail);
        txtmail=new TextField("votre mail");
        txtmail.setBounds(x+ll+5,y*3+hl+5,ll,hl);
        fen.add(txtmail);

        lblpass=new Label("Mot de passe:");
        lblpass.setBounds(x,y*3+hl+5,ll,hl);
        fen.add(lblpass);
        txtpass=new TextField("votre password");
        txtpass.setBounds(x+ll+5,y*3+hl+5,ll,hl);
        fen.add(txtpass);

        lblgenre=new Label("Genre:");
        lblgenre.setBounds(x,y*4+hl+5,ll,hl);
        fen.add(lblgenre);
        boxgroup=new CheckboxGroup();
        boxH=new Checkbox("Home",boxgroup,true);
        boxH.setBounds(x+ll+5,y*4+hl+7,50,10);
        boxF=new Checkbox("Femme",boxgroup,false);
        boxF.setBounds(x+ll+5,y*4+hl+13,ll,hl);
        fen.add(boxH);
        fen.add(boxF);

        lblpays=new Label("Pays:");
        lblpays.setBounds(x,y*5+hl+15,ll,hl);
        fen.add(lblpays);
        choice=new Choice();
        choice.add("Votre pays");
        choice.add("Errachidia");
        choice.add("Rabat");
        choice.add("Casa");
        choice.setBounds(x+ll+5,y*5+hl+15,ll,hl);
        fen.add(choice);



        lbldiplom=new Label("Diplomes:");
        lbldiplom.setBounds(x,y*6+hl+5,ll,hl);
        fen.add(lbldiplom);
        l=new Checkbox("Licence");
        l.setBounds(x+ll+5,y*6+hl+15,ll/3,hl);
        fen.add(l);
        m=new Checkbox("Master");
        m.setBounds(x+ll+80,y*6+hl+15,ll/3,hl);
        fen.add(m);
        d=new Checkbox("Doctorat");
        d.setBounds(x+ll+160,y*6+hl+15,ll/3,hl);
        fen.add(d);

        lblcomments=new Label("Comments:");
        lblcomments.setBounds(x,y*7+hl+5,ll,hl);
        fen.add(lblcomments);
        area=new TextArea("inserer ici vos commentaires");
        area.setBounds(x+ll+5,y*7+hl+20,ll,hl*3);
        fen.add(area);

        lblphoto=new Label("Photo:");
        lblphoto.setBounds(x,y*8+hl+hl*3,ll,hl);
        fen.add(lblphoto);
        file=new Button("Choose File");
        file.setBounds(x+ll+5,y*8+hl+hl*3,ll/2,hl);
        fen.add(file);
        showurl=new Label(" ");
        showurl.setBounds(x+ll+ll/2,y*8+hl+hl*3,ll/2,hl);


        effacer=new Button("Effacr");
        effacer.setBounds(x,y*10+hl+hl*3,ll/2,hl);
        fen.add(effacer);
        enregistrer=new Button("Enregistrer");
        enregistrer.setBounds(x+ll+5,y*10+hl+hl*3,ll/2,hl);
        fen.add(enregistrer);






        fen.setLayout(null);
        fen.setVisible(true);

    }

    public static void main(String[] args) {
        new Gestion();
    }


}

