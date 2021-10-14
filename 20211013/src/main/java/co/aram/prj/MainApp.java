package co.aram.prj;

import co.aram.prj.comm.GB;
import co.aram.prj.menu.Menu;

public class MainApp {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.run();
		GB.sc.close();
		

	}

}
