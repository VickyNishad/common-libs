package com.common.constants;

/**
 * Contains application-wide constants that are used across the project.
 */
public class Constants {

	// Success constants related to data insertion
	public static final class Success {
		public static final String DATA_INSERTED_SUCCESSFULLY = "data inserted successfully.";
		public static final String SUCCESS = "success";
	}

	public static final class RegexPattern {
		// Email Regex Pattern (basic, suitable for most cases)
		public static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

		// Mobile Regex Pattern (Indian 10-digit format, starting with 6-9)
		public static final String MOBILE_PATTERN = "^[6-9]\\d{9}$";

	}

	public static final class WhiteSpaceCharacter {
		// Define constants for different types of whitespace characters
		public static final String TAB = "\t"; // Tab
		public static final String SPACE = " "; // Space
		public static final String NEWLINE = "\n"; // Newline
		public static final String FORM_FEED = "\f"; // Form feed
		public static final String WHITE_SPACE = "\\s"; // White Space Character
		public static final String VERTICAL_TAB = "\u000B"; // Vertical tab
		public static final String EMPTY_STRING = ""; // Empty string constant
		public static final String CARRIAGE_RETURN = "\r"; // Carriage return

	}
}
