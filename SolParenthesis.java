import java.util.*;
// Anilabha Baral

/*
Question: Given a string of opening and closing parentheses, check whether it’s balanced.
*/

public class SolParenthesis {
	public static void main(String[] args) {
		Stack<Character> st = new Stack<Character>();
		Scanner s = new Scanner(System.in);
		String p = "[()()()()({}{}{}{}{})]";//enter your parentheses expression here
		boolean isbalance = true;

		for (int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
				continue;
			}
			if (st.isEmpty()) {
				isbalance = false;
				break;

			}
			if (c == ')') {
				if (st.peek() == '(') {
					st.pop();
				} else {
					isbalance = false;
					break;
				}
			}
			if (c == '}') {
				if (st.peek() == '{') {
					st.pop();
				} else {
					isbalance = false;
					break;
				}
			}
			if (c == ']') {
				if (st.peek() == '[') {
					st.pop();
				} else {
					isbalance = false;
					break;
				}
			}

		}
		if (!st.isEmpty()) {
			isbalance = false;

		}
		if (isbalance == true) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}

	}

}
