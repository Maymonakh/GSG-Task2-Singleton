package Task2;

public class ThemeManager {
// The ThemeManager class needs to be a singleton because:
// Consistency: Ensures that the theme is consistent throughout the application.
// All parts of the application can access and modify the theme through a single instance.
// Having a single instance means there's one source of truth for the theme setting,
// reducing the risk of inconsistencies or conflicts.

	private static ThemeManager instance;
	private String theme;

	// Private constructor to prevent instantiation
	private ThemeManager() {
		theme = "light";
	}

	// Public method to provide access to the single instance
	public static ThemeManager getInstance() {
		if (instance == null) {
			instance = new ThemeManager();
		}
		return instance;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String newTheme) {
		theme = newTheme;
		System.out.println("Theme changed to: " + newTheme);
	}
}
