package com.demoblaze.utilities;

public class StringFormatter {

	public static String formatString(String text, String characterReplaced, String newCharacter) {
		String formattedText = text.replaceAll(characterReplaced, newCharacter);
		return formattedText;
	}
}
