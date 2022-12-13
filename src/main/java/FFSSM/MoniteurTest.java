package FFSSM;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class MoniteurTest {
	Personne p = new Personne ("0212","Delb", "Lulu" , "Rue", "069", LocalDate.of(2002, 9, 24));
	Moniteur m = new Moniteur ("0212","Delb", "Lulu" , "Rue", "069", LocalDate.of(2002, 9, 24), 12);
	Club c = new Club(m, "DodoPalme", "0625895" );
	Club club = new Club(m, "DodoPalme", "0625895" );

	Site s = new Site("nom", "details");
	Plongee plongee = new Plongee(s, m, LocalDate.of(2022, 3, 26), 25, 50);
	
	
	@Test
		public void testEmployeurActuel() {
	        LocalDate date = LocalDate.of(2022, 12, 13);
	        assertFalse(m.employeurActuel().isPresent());
	        m.nouvelleEmbauche(c, date);
	        m.nouvelleEmbauche(club, date);
	        assertSame(c, m.employeurActuel().get());
	    }
	}


