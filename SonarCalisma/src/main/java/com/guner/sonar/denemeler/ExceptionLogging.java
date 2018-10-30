package com.guner.sonar.denemeler;

import org.apache.log4j.Logger;

/**
 * 
 * @author tcrguner
 * 
 *
 */
public class ExceptionLogging {

	private static Logger log;
	public static final Integer INT1 = new Integer(1);

	public static void main(String[] args) {

		ExceptionLogging exceptionLogging = new ExceptionLogging();
		initLogging();
		exceptionLogging.execute2();
		exceptionLogging.execute4();

	}

	private static void initLogging() {
		log = Logger.getLogger(ExceptionLogging.class);

	}

	private void execute1() {
		throw new NumberFormatException("Numara formatlandirma hatası");
	}

	private void execute3() throws Exception {
		throw new Exception("Exception hatası");
	}

	private void execute2() {
		try {
			execute1();
		} catch (NumberFormatException e) {
			log.info("Method cagriminda hata Olustu");
			log.info(e.getMessage());
		}
	}

	private void execute4() {
		try {
			execute3();
		} catch (Exception e) {
			log.info("Method cagriminda hata Olustu");
			// log.info(e.getMessage()); // Bu issue için yetmiyor... Exception handlers should preserve the original exception : Either log or rethrow this
			// exception.
			log.info(e);
			// log.info(e.toString());

		}
	}

}
