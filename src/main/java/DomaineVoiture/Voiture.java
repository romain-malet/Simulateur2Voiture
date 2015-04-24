package DomaineVoiture;

import AppliSimu.Direction;

import java.util.Observable;

public class Voiture extends Observable {

	private int x;
	private int y;
	private int vitesseMetreSeconde;
	private int directionEnDegres;
    private Direction dir;

	public Voiture(int x, int y, int vitesse) {
		this.x = x;
		this.y = y;
		this.vitesseMetreSeconde = vitesse;
		this.directionEnDegres = 0;
        this.dir = Direction.DROIT;
	}

	public void miseAJourPosition() {
		miseAJourPositionX();
		notificationObservateur();
	}

	private void miseAJourPositionX() {
		if (directionEnDegres == 0)
			x += vitesseMetreSeconde;
		else
			x -= vitesseMetreSeconde;

		if (x > 1000)
			x = 1000;
		else if (x < 0)
			x = 0;
	}

	private void notificationObservateur() {
		this.setChanged();
		this.notifyObservers();
	}

	public int getX() {
		return x;
	}

	public void accelerer() {
		if (vitesseMetreSeconde < 100)
			vitesseMetreSeconde += 10;	
	}

	public Object getVitesse() {
		return vitesseMetreSeconde;
	}

	public void setVitesse(int vitesse) {
		vitesseMetreSeconde = vitesse;
	}

	public void setDirection(int angleDirection) {
		this.directionEnDegres = angleDirection;
		
	}

	public void inverserDirection() {
		directionEnDegres +=180 ;
		directionEnDegres = directionEnDegres % 360;
		
	}

	public Object getDirection() {
	return directionEnDegres;
	}

    public void allerEnHaut() {
        switch(dir) {
            case BAS:
                directionEnDegres += 180 ;
                break;
            case DROIT:
                directionEnDegres += 90 ;
                break;
            case GAUCHE:
                directionEnDegres += 90 ;
                break;
        }
        dir = Direction.HAUT;
        directionEnDegres = directionEnDegres % 360;
    }

    public void allerEnBas(){
        switch(dir) {
            case HAUT:
                directionEnDegres -= 180 ;
                break;
            case DROIT:
                directionEnDegres += 90 ;
                break;
            case GAUCHE:
                directionEnDegres += 90 ;
                break;
        }
        dir = Direction.BAS;
        directionEnDegres = directionEnDegres % 360;
    }

    public void allerAdroite() {
        switch(dir) {
            case HAUT:
                directionEnDegres += 90 ;
                break;
            case BAS:
                directionEnDegres += 90 ;
                break;
            case GAUCHE:
                directionEnDegres += 180 ;
                break;
        }
        dir = Direction.DROIT;
        directionEnDegres = directionEnDegres % 360;
    }

    public void allerAGauche() {
        switch(dir) {
            case HAUT:
                directionEnDegres += 90 ;
                break;
            case BAS:
                directionEnDegres += 90 ;
                break;
            case DROIT:
                directionEnDegres += 180 ;
                break;
        }
        dir = Direction.GAUCHE;
        directionEnDegres = directionEnDegres % 360;
    }
	
}
