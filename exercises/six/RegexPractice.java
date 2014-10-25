import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexPractice {
	
	public static void main(String[] args) {
		
	}
	
	public ArrayList extractNumbers(String equation) {
		ArrayList list = new ArrayList();
		list.add(equation.replaceFirst("(\\d+) [/*+-\\^]+ (\\d+) [/*+-\\^]+ (\\d+\\.\\d+) [/*+-\\^]+ (\\d+) [/*+-\\^]+ (\\d+\\.\\d+)", "[$1, $2, $3, $4, $5]" ));
		
		return list;
	}
	
	public ArrayList extractOperators(String equation) {
		ArrayList list = new ArrayList();
		list.add(equation.replaceFirst("\\d+ ([/*+-\\^]+) \\d+ ([/*+-\\^]+) \\d+\\.\\d+ ([/*+-\\^]+) \\d+ ([/*+-\\^]+) \\d+\\.\\d+", "$1, $2, $3, $4"));
		
		return list;
	}
	
	
	public ArrayList extractEmails(String emails) {
		ArrayList list = new ArrayList();
		
		Pattern pattern = Pattern.compile("(\\w+\\@\\w+\\.\\w+)");
		Matcher matcher = pattern.matcher(emails);
		while(matcher.find()) {
			list.add(matcher.group(1));
		}
		return list;
	}
	
	public ArrayList extractListBody(String tags) {
		ArrayList list = new ArrayList();
		
		Pattern pattern = Pattern.compile("<li>(.+?)</li>");
		Matcher matcher = pattern.matcher(tags);
		while(matcher.find()) {
			list.add(matcher.group(1));
		}
		list.toString();
		return list;
		
	}

}
