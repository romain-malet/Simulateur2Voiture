package AppliSimu;

import DomaineRoute.Route;

import javax.swing.*;
import java.awt.*;


/**
 * Created by mahamat on 10/04/15.
 */
public class IHMRoute {
    private Route route;

    public IHMRoute(Route route) {
        this.route = route;
    }

    public Point[] coordonneesRoute(double echelle) {
        Point[] coordonnees = new Point[4];
        coordonnees[0] = new Point((int)(route.getX() * echelle), (int)(route.getY() * echelle));

        double x = (route.getX() + route.getLongueur()) * echelle;
        double y = route.getY() * echelle;
        coordonnees[1] = new Point((int) x, (int) y);

        x = route.getX() * echelle;
        y = (route.getX() + route.getLargeur()) * echelle;
        coordonnees[2] = new Point((int) x, (int) y);

        x = (route.getX() + route.getLongueur()) * echelle;
        y = (route.getX() + route.getLargeur()) * echelle;
        coordonnees[3] = new Point((int) x, (int) y);
        return coordonnees;
    }

}
