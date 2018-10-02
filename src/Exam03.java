import java.text.ChoiceFormat;

public class Exam03 {

	public static void main(String[] args) {
		String pattern = "60#D|70#C|80<B|90#A";
		int[]scores= {91,80,7,45,18,98,23};
		ChoiceFormat form = new ChoiceFormat(pattern);
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]+":"+form.format(scores[i]));
		}
	}

}
