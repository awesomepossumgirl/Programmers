import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(swapCase(a));
    }
    public static String swapCase(String str) {
		StringBuilder result = new StringBuilder();
		
		for(char c:str.toCharArray()) {
			if(Character.isUpperCase(c) ) {
				result.append(Character.toLowerCase(c));
			} else if(Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));
				
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}
}