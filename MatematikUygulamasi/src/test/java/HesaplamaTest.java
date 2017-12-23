import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplaHepsi() {
		
		for (int sayi1=-10000; sayi1<10001; sayi1++) {
			for (int sayi2=-10000;sayi2<10001; sayi2++) {
				int gercekSonuc = Hesaplama.topla(sayi1, sayi2);
				assertEquals(sayi1+sayi2, gercekSonuc);
			}
		}
		
	}
	
	
	@Test
	public void testClass() {
		boolean hataOlustu = false;
		try {
			Hesaplama hesaplama = new Hesaplama();
		} catch (Exception e) {
			hataOlustu = true;
		}
		
		assertFalse(hataOlustu);
		
	}
	
	
	@Test
	public void testTopla25ve14() {
		int gercekSonuc = Hesaplama.topla(25, 14);
		assertEquals(39, gercekSonuc);
	}
	
	@Test
	public void testToplaNegatif() {
		int gercekSonuc = Hesaplama.topla(-25, -14);
		assertEquals(-39, gercekSonuc);
	}
	
	@Test
	public void testCarp() {
		int gercekSonuc = Hesaplama.carpma(10,10);
		assertEquals(100, gercekSonuc);
	}
	
	@Test
	public void testCikar() {
		int gercekSonuc = Hesaplama.cikarma(20,10);
		assertEquals(10, gercekSonuc);
	}
	
	@Test
	public void testBolme() {
		int gercekSonuc = Hesaplama.bolme(20, 10);
		assertEquals(2, gercekSonuc);
	}
	
	

}
