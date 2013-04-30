package com.example.foundationsofsuccessfulprogramminginjava;

public class QuestionList {

	Question q1 = new Question(0, "What is the hot-key combination for copying text?", "CTRL-Z", "CTRL-X", "CTRL-C", "CTRL-Y", 2);
	Question q2 = new Question(1, "What is the hot-key combination for cutting text?", "CTRL-Y", "CTRL-C", "CTRL-Z", "CTRL-X", 3);
	Question q3 = new Question(2, "What is the hot-key combination for undoing the most recent command?", "CTRL-Z", "CTRL-Y", "CTRL-C", "CTRL-A", 0);
	Question q4 = new Question(3, "What is the hot-key combination for redoing the most recently done command?", "CTRL-Z", "CTRL-Y", "CTRL-C", "CTRL-X", 0);
	Question q5 = new Question(4, "What is the hot-key combination for organizing libraries (importing needed ones and deleting the unused ones?", 
			"CRTL-SHIFT-I", "CRTL-SHIFT-N", "CRTL-SHIFT-Z", "CRTL-SHIFT-O", 3);
	Question q6 = new Question(5, "What is the hot-key combination for creating something new (classes, project, interfaces, etc)", 
			"SHIFT-ALT-N", "CRTL-SHIFT-N", "SHIFT-ALT-I", "SHIFT-ALT-O", 0);
	Question q7 = new Question(6, "What is the hot-key combination for pasting text?", "CTRL-Z", "CTRL-X", "CTRL-C", "CTRL-V", 3);
	Question q8 = new Question(7, "What is the hot-key combination for saving changes to ALL classes?", "CTRL-S", "SHIFT-ALT-S", "CTRL-SHIFT-C", "SHIFT-C", 1);
	Question q9 = new Question(8, "Which of these is a hot-key combination for commenting out text?", "CTRL-/", "CTRL-<", "CTRL-*", "CTRL-%", 0);
	Question q10 = new Question(9, "Which of these is a hot-key combination for deleting an entire line?", "CTRL-C", "CTRL-T", "CTRL-A", "CTRL-D", 3);
	Question q11 = new Question(10, "Which of these is a fast way to select all of the text on a line?", "End->SHIFT-Home", "End->SHIFT-End", 
			"Home->SHIFT-End", "Home->SHIFT-Page Down", 0);
	Question q12 = new Question(11, "What is the hot-key combination to move up and down a class by the methods in it?", "CTRL-(Up or Down)", 
			"CTRL-SHIFT-(Up or Down)", "CTRL-ALT-(Up or Down)", "ALT-(Up or Down)", 0);
	Question q13 = new Question(12, "What are the hot-key combinations to select all of the text in a class?", "CTRL-D", "CTRL-L", "CTRL-A", "CTRL-I", 2);
	Question q14 = new Question(13, "What are the hot-key combinations to select all of the text in a class and then indent it properly?", 
			"CTRL-I -> CTRL-A", "CTRL-A -> CTRL-I", "CTRL-I -> CTRL-O", "CTRL-O -> CTRL-I", 1);
	Question q15 = new Question(14, "What is the hot-key combination for selecting whole words in a line of code?", "CTRL-(Left or Right)", "SHIFT-(Left or Right)", 
			"CTRL-SHIFT-(Left or Right)", "ALT-(Left or Right)", 2);
	Question q16 = new Question(15, "What is the hot-key combination for selecting finding specifics words?", "CTRL-F", "CTRL-R", "CTRL-U", "CTRL-A", 0);
	Question q17 = new Question(16, "When a method is static, what does that mean?", "You need an instance of an object to call it.", "You do not need" +
			"an instance of an object to call it.", "It returns a value.", "It does not return anything.", 0);
	Question q18 = new Question(17, "What is the proper way to instantiate a Tiger object?", "Tiger = new Tiger();", "Tiger t = Tiger();", 
			"t = new Tiger();", "Tiger t = new Tiger();", 3);
	Question q19 = new Question(18, "Which of these is a proper int array declaration (of size 4)?", "int[] intArray = new array[4];", 
			"int[4] intArray  = new int[];", "int intArray = new int[4];", "int[] intArray = new int[4];", 3);
	Question q20 = new Question(19, "Which of for loops will traverse all of the elements of an array without throwing an exception?", 
			"for(int i = 0; i < array.length; i++){}", "for(int i = 0; i <= array.length; i++){}", "for(int i = 1; i < array.length; i++){}", 
			"for(int i = 0; i < array.length; i--){}", 0);
	Question q21 = new Question(20, "What is the index of the last element in an array of size 10?", "10", "9", "11", "1", 1);
	Question q22 = new Question(21, "What is the index of the first element in an array of size 10?", "0", "1", "9", "10", 0);
	Question q23 = new Question(22, "If a String variable called \'word\'holds the value \"sharp\", what will word.charAt(1), return?", 
			"'s'", "'h'", "It will throw an error.", "Nothing.", 1);
	Question q24 = new Question(23, "If a String variable called \'word\'holds the value \"sharp\", what will word.charAt(5), return?", 
			"\'r\'", "\'p\'", "It will throw an error.", "Nothing.", 1);
	Question q25 = new Question(24, "What is the proper way to declare a scanner to take in information from the keyboard?", 
			"Scanner scan = new Scanner();", "Scanner scan = new Scanner(new File(filename));", "Scanner scan = new Scanner(System.out);", 
			"Scanner scan = new Scanner(System.in);", 3);
	Question q26 = new Question(25, "What is the proper way to declare a scanner to take in information from a file?", 
			"Scanner scan = new Scanner();", "Scanner scan = new Scanner(new File(filename));", "Scanner scan = new Scanner(System.out);", 
			"Scanner scan = new Scanner(System.in);", 1);
//	Question q27 = new Question("", "", "", "", "", );
//	Question q28 = new Question("", "", "", "", "", );
//	Question q29= new Question("", "", "", "", "", );
//	Question q30 = new Question("", "", "", "", "", );


}
