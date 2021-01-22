import no.hvl.dat109.spiller.Spiller;
import no.hvl.dat109.terning.Terning;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Spiller s1 = new Spiller("Fredrik");
		
		s1.trill();
		s1.flytt();
		
		System.out.println(s1.getBrikke());
	

	}

}
