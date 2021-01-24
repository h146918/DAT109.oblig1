import no.hvl.dat109.brett.Brett;
import no.hvl.dat109.brikke.Brikke;
import no.hvl.dat109.spiller.Spiller;
import no.hvl.dat109.terning.Terning;

public class Main {

	public static void main(String[] args) {
		
		Terning terning = new Terning();
		
		
		
		Brikke brikke1 = new Brikke();
		Brikke brikke2 = new Brikke();
		
		Spiller spiller1 = new Spiller("Ole", brikke1);
		Spiller spiller2 = new Spiller("Lisa", brikke2);
		
		Brett brett = new Brett();
		
		brett.leggTilSpiller(spiller1);
		brett.leggTilSpiller(spiller2);
		
		
		

	

	}

}
