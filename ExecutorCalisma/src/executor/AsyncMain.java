package executor;

import java.util.ArrayList;
import java.util.List;

public class AsyncMain {

	public static void main(String[] args) {
		AsyncMain a = new AsyncMain();
		//a.execute1();
		//a.execute2();
		//a.execute3();
		a.execute4();
	}

	public void execute1() {

		AsyncUtils.createThreadPoolExecutor();

		List<String> msisdnList = new ArrayList<>();
		msisdnList.add("5322100234");
		msisdnList.add("5322100235");
		msisdnList.add("5322100236");
		msisdnList.add("5322100237");
		msisdnList.add("5322100238");
		msisdnList.add("5322100239");
		msisdnList.add("5322100230");

		List<ProductAmount> productAmountList = new ArrayList<>();
		try {
			Double totalAmount = AsyncUtils.getUnbilledAmountOfProductsAsync(msisdnList, productAmountList);
			System.out.println(totalAmount);
			System.out.println(productAmountList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AsyncUtils.shutdownAndAwaitTermination();
	}

	public void execute2() {

		AsyncUtils.createThreadPoolExecutor();

		List<String> msisdnList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			msisdnList.add("5322100234");
			msisdnList.add("5322100235");
			msisdnList.add("5322100236");
			msisdnList.add("5322100237");
			msisdnList.add("5322100238");
			msisdnList.add("5322100239");
			msisdnList.add("5322100230");
		}
		try {
			Double totalAmount = AsyncUtils.getUnbilledAmountOfProductsAsync2(msisdnList);
			System.out.println(totalAmount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AsyncUtils.shutdownAndAwaitTermination();
	}

	public void execute3() {

		AsyncUtils.createThreadPoolExecutor();

		List<String> msisdnList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			msisdnList.add("5322100234");
			msisdnList.add("5322100235");
			msisdnList.add("5322100236");
			msisdnList.add("5322100237");
			msisdnList.add("5322100238");
			msisdnList.add("5322100239");
			msisdnList.add("5322100230");
		}
		try {
			Double totalAmount = AsyncUtils.getUnbilledAmountOfProductsAsync3(msisdnList);
			System.out.println(totalAmount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AsyncUtils.shutdownAndAwaitTermination();
	}

	public void execute4() {

		AsyncUtils.createThreadPoolExecutor();

		List<String> msisdnList = new ArrayList<>();
		msisdnList.add("5322100234");
		msisdnList.add("5322100235");
		msisdnList.add("5322100236");
		msisdnList.add("5322100237");
		msisdnList.add("5322100238");
		msisdnList.add("5322100239");
		msisdnList.add("5322100230");

		List<ProductAmount> productAmountList = new ArrayList<>();
		try {
			Double totalAmount = AsyncUtils.getUnbilledAmountOfProductsAsync(msisdnList, productAmountList);
			System.out.println(totalAmount);
			System.out.println(productAmountList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AsyncUtils.shutdownAndAwaitTermination();
	}
}
