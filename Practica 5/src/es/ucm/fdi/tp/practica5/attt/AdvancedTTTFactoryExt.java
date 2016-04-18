package es.ucm.fdi.tp.practica5.attt;

import javax.swing.SwingUtilities;

import es.ucm.fdi.tp.basecode.attt.AdvancedTTTFactory;
import es.ucm.fdi.tp.basecode.bgame.control.Controller;
import es.ucm.fdi.tp.basecode.bgame.control.Player;
import es.ucm.fdi.tp.basecode.bgame.model.GameObserver;
import es.ucm.fdi.tp.basecode.bgame.model.Observable;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;
import es.ucm.fdi.tp.practica5.ataxx.AtaxxSwingView;

public class AdvancedTTTFactoryExt extends AdvancedTTTFactory {
	
	public AdvancedTTTFactoryExt() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void createSwingView(final Observable<GameObserver> g, final Controller c, final Piece viewPiece,
			Player random, Player ai) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AdvancedTTTSwingView(g,c,viewPiece, random, ai);
				//Da problemas porque llama 2 veces a todos los metodos de los observadores
//				g.addObserver(o);
			}
		});
	}
}
