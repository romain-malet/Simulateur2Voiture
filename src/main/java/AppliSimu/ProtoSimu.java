package AppliSimu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import DomaineRoute.Route;
import DomaineVoiture.Voiture;

public class ProtoSimu {

	public static final int dureeUneSecondeEnMilliSecondes = 1000;

	public static void main(String[] args) {

		final Voiture maVoiture = new Voiture (100, 0, 10);
        Route route = new Route(300, 600, 10, 500);
        IHMRoute ihmRoute = new IHMRoute(route);
		IHMVoiture monTriangle = new IHMVoiture(maVoiture, ihmRoute);
		
		Timer timerAvancer = new Timer(dureeUneSecondeEnMilliSecondes, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				maVoiture.miseAJourPosition();
			}
		});
		
		timerAvancer.start();
		
		while(true){
		}

	}

}
