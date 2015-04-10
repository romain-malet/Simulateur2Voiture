package AppliSimu;

import DomaineRoute.Route;

import javax.swing.*;
import java.awt.*;


/**
 * Created by mahamat on 10/04/15.
 */
public class IHMRoute extends JPanel {
    private Route route;

    public IHMRoute(Route route) {
        this.route = route;

    }

    @Override
    public void paintComponent(Graphics g) {

    }

    public Point[] coordonneesRoute(Route route, double echelle) {
        Point[] coordonnees = new Point[4];
        coordonnees[0] = new Point((int)(route.getX()*echelle), (int)(route.getY()*echelle));
        coordonnees[1] = new Point((int)(route.getX()*echelle) + route.getLargeur(), (int)(route.getY()*echelle));
        coordonnees[2] = new Point((int)(route.getX()*echelle), (int)(route.getY()*echelle) + route.getLongueur());
        coordonnees[3] = new Point((int)(route.getX()*echelle) + route.getLargeur(), (int)(route.getY()*echelle) + route.getLongueur());
        return coordonnees;
    }

}
