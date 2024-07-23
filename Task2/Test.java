package Task2;

public class Test {
	public static void main(String[] args) {

		ThemeManager themeManager = ThemeManager.getInstance();

		System.out.println("Current Theme: " + themeManager.getTheme());

		themeManager.setTheme("dark");

		System.out.println("Current Theme: " + themeManager.getTheme());
	}
}
