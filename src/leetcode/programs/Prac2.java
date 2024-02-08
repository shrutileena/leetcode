package leetcode.programs;

import java.util.Arrays;

public class Prac2 {
	public static void main(String[] args) {
		String[][] queries = { {"ADD", "1"},
			    {"ADD", "2"},
			    {"ADD", "5"},
			    {"ADD", "2"},
			    {"EXISTS", "2"},
			    {"EXISTS", "5"},
			    {"EXISTS", "1"},
			    {"EXISTS", "4"},
			    {"EXISTS", "3"},
			    {"EXISTS", "0"} };
		String[] res = solution(queries);
		System.out.println(Arrays.toString(res));
	}

	static String[] solution(String[][] queries) {
		String[] res = new String[queries.length];
		String[] container = new String[queries.length];
		for (int i = 0; i < queries.length; i++) {
			if (queries[i][0] == "ADD") {
				container[i] = queries[i][1];
				res[i] = "\"\"";
			} else {
				for (int j = 0; j < container.length; j++) {
					if (container[j] == queries[i][1]) {
						res[i] = "\"true\"";
					} else {
						res[i] = "\"false\"";
					}
				}
			}
		}
		return res;
	}

}