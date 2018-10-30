package com.guner.sonar.denemeler;

/**
 * 
 * @author tcrguner
 * 
 *         RuntimException ve Error Unchecked Exceptiondur, try catch ile yakalama zorunluluğu yoktur metodlar da throws TypeUncheckedException demek zorunda
 *         değildir
 * 
 *         Diğer exceptionlar checked exceptiondur.
 *
 */
public class ExceptionUsage {

	public static void main(String[] args) {

		ExceptionUsage exceptionUsage = new ExceptionUsage();
		// try {
		// exceptionUsage.execute1();
		// exceptionUsage.execute2();
		// } catch (Exception e) {
		// System.out.println("exception oluştu.");
		// e.printStackTrace();
		// }

		// try {
		// exceptionUsage.execute3();
		// } catch (Exception e) {
		// System.out.println("exception oluştu..");
		// e.printStackTrace();
		// }

		// try {
		// exceptionUsage.execute4();
		// } catch (RuntimeException e)
		// {
		// System.out.println("exception oluştu...");
		// e.printStackTrace();
		// }

		// exceptionUsage.execute4();

		// try {
		// exceptionUsage.execute5();
		// } catch (Exception e) {
		// System.out.println("exception oluştu....");
		// e.printStackTrace();
		// }
		//
		//
		//
		// try {
		// exceptionUsage.execute5();
		// } catch (RuntimeException e) {
		// System.out.println("runtime exception oluştu.....");
		// e.printStackTrace();
		// } catch (Exception e) {
		// System.out.println("exception oluştu.....");
		// e.printStackTrace();
		// }

		// exceptionUsage.execute5();

		// exceptionUsage.execute6();

		// try {
		// exceptionUsage.execute7();
		// } catch (Error e) {
		// System.out.println("hataa...");
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		try {
			exceptionUsage.execute4();
		} catch (Exception e) {
			System.out.println("buyuk hata");
			e.printStackTrace();
		}

	}

	private void execute1() throws Exception {

		if (true)
			throw new Exception();
	}

	private void execute2() throws TypeCheckedException {

		if (true)
			throw new TypeCheckedException();
	}

	private void execute3() throws TypeCheckedException {

		// java.lang.ArithmeticException: / by zero
		int i = 1 / 0;
	}

	private void execute4() {

		int i = 1 / 0;
	}

	private void execute5() throws TypeUncheckedException {

		if (true)
			throw new TypeUncheckedException();
	}

	private void execute6() {
		if (true)
			throw new TypeUncheckedException();
	}

	private void execute7() {
		if (true)
			throw new Error();
	}

	private void execute8() {
		if (true)
			throw new NullPointerException("null durumu oldu");
	}

}
