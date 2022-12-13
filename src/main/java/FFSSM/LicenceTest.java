package FFSSM;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;


public class LicenceTest {
	Personne p = new Personne ("0212","Delb", "Lulu" , "Rue", "069", LocalDate.of(2002, 9, 24));
	Moniteur m = new Moniteur ("0212","Delb", "Lulu" , "Rue", "069", LocalDate.of(2002, 9, 24), 12);
	Club c = new Club(m, "DodoPalme", "0625895" );
	
	@Test
	public void testEstValide() {
		Licence licence = new Licence(p, "25698", LocalDate.of(2002, 9, 24), c);
		assertEquals(true, licence.estValide(LocalDate.of(2002, 9, 24)));

		
	}

}
