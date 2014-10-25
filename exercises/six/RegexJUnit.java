import org.junit.Test;


public class RegexJUnit {

	@Test
	public void test() {
		RegexPractice rp = new RegexPractice();
		String tags = "What do I do? <li>Nothing people</li> alright";

		
		System.out.println(rp.extractListBody(tags));
	}
	
	@Test
	public void emails() {
		RegexPractice rp = new RegexPractice();
		String emails ="people be like kevin@gmail.com or garcia@yahoo.net";
		
		System.out.println(rp.extractEmails(emails));
	}
	
	@Test
	public void numbers() {
		RegexPractice rp = new RegexPractice();
		String equation = "3 + 2 / 4.0 * 1 ^ 17.34";
		
		System.out.println(rp.extractNumbers(equation));
		
	}
	
	@Test
	public void operators() {
		RegexPractice rp = new RegexPractice();
		String equation = "3 + 2 / 4.0 * 1 ^ 17.34";
		
		System.out.println(rp.extractOperators(equation));
		
	}
	

}
