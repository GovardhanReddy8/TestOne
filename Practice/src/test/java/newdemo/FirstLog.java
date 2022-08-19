package newdemo;

import org.apache.logging.log4j.*;


public class FirstLog {
	static Logger demo=LogManager.getLogger(FirstLog.class);
	public static void main(String[] args) {
		demo.info("this is what i need");
		demo.error("this is too much");
		demo.trace("wow fen");
		demo.debug("debuging the code");
	}

}
