package FFSSM;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class PlongeeTest {

	
		Personne p = new Personne ("0212","Delb", "Lulu" , "Rue", "069", LocalDate.of(2002, 9, 24));
		Moniteur m = new Moniteur ("0212","Delb", "Lulu" , "Rue", "069", LocalDate.of(2002, 9, 24), 12);
		Club c = new Club(m, "DodoPalme", "0625895" );
		Site s = new Site("nom", "details");
		Plongee plongee = new Plongee(s, m, LocalDate.of(2022, 3, 26), 25, 50);
		
		@Test
		public void testPlongeeValide() {
	        assertTrue(plongee.estConforme());
	}

}
