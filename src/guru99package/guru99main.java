package guru99package;

public class guru99main {

	public static void main(String[] args) {
		gurupPackageclass gg = new gurupPackageclass();
		gg.invokeBrowser();
		gg.inputData("mngr575227","EjazEde");
		gg.addUser();
		String cusId = gg.getCustomerId();
		System.out.print(cusId);
		gg.closeTheBrowser();

	}

}
