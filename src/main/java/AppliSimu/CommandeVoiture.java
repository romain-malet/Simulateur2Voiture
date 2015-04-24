package AppliSimu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DomaineVoiture.Voiture;

public class CommandeVoiture extends JPanel implements ActionListener{
	
	private JButton boutonAccelerer;
	private JButton boutonGauche;
    private JButton boutonDroite;
    private JButton boutonHaut;
    private JButton boutonBas;
	private Voiture maVoiture;
	
	
	public CommandeVoiture (JFrame fenetre, Voiture maVoiture) {
		
		super();
		this.setLayout(new FlowLayout());
 
		boutonAccelerer = new JButton("Accelerer");
		boutonAccelerer.addActionListener(this);
		this.add(boutonAccelerer);

        boutonGauche = new JButton("Inverser");
        boutonGauche.addActionListener(this);
		this.add(boutonGauche);
/*
        boutonDroite = new JButton("Droite");
        boutonDroite.addActionListener(this);
        this.add(boutonDroite);

        boutonHaut = new JButton("haut");
        boutonHaut.addActionListener(this);
        this.add(boutonHaut);


        boutonBas = new JButton("bas");
        boutonBas.addActionListener(this);
        this.add(boutonBas);*/

		fenetre.add(this);
		this.maVoiture = maVoiture;
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		Object bouton = event.getSource();
		if (bouton == boutonAccelerer)
			maVoiture.accelerer();
		else if(bouton == boutonDroite) {
            maVoiture.allerAdroite();
        }else if(bouton == boutonGauche) {
            maVoiture.inverserDirection();
        }  else if(bouton == boutonHaut){
            maVoiture.allerEnHaut();
        } else if(bouton == boutonBas){
          maVoiture.allerEnBas();
        }

	}
	

}
