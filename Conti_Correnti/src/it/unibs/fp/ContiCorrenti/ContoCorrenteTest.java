package it.unibs.fp.ContiCorrenti;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContoCorrenteTest
{

	@Test
	public void prelievogiusto() throws Exception 
		{
			final ContoCorrente conto = new ContoCorrente("Kira gfatd", 1, 500.0,123);
			assertTrue(conto.prelievo(100).equalsIgnoreCase(Utility.PRELIEVO_GIUSTO));
		}
	@Test
	public void prelievosbagliato() throws Exception 
		{
			final ContoCorrente conto = new ContoCorrente("Kira gfatd", 1, 500.0,123);
			assertFalse(conto.prelievo(550).equalsIgnoreCase(Utility.PRELIEVO_GIUSTO));
		}

	@Test
	public void versamento() throws Exception 
		{
			final ContoCorrente conto = new ContoCorrente("Kira gfatd", 1, 500.0,123);
			conto.versamento(100);
			assertTrue(conto.getSaldo()==600.0);
		}
	@Test
	public void chiusura() throws Exception 
		{
			final ContoCorrente conto = new ContoCorrente("Kira gfatd", 1, 500.0,123);
			conto.chiusura();
			assertTrue(conto.getSaldo()==0.0);
		}
}
