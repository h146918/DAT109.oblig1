import no.hvl.dat109.brett.Brett;
import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.spill.Spill;
import no.hvl.dat109.spiller.Spiller;
import no.hvl.dat109.terning.Terning;

public class Main {

	public static void main(String[] args) {

		Spill spill = new Spill();
		spill.antallSpillere();
		
		spill.getBrett().skrivUtSpillere();
		spill.antallSpillere();
		//spill.getBrett().skrivUtSpillere();

	}

}
