package week6.day1;

public class Automation extends MultipleLanguage implements Language, Testingtool {

	@Override
	public void Selenium() {
		System.out.println("Selenium");
	}

	@Override
	public void Java() {
		System.out.println("Java");

	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

	public static void main(String[] args) {

		Automation obj = new Automation();
		obj.Selenium();
		obj.Java();
		obj.ruby();
		obj.python();

	}

}
