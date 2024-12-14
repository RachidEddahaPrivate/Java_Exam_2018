package it.unibs.fp.ContiCorrenti;

public class ContoCorrente
{
	private String intestatario;
	private int identificativo;
	private double saldo;
	private int password;

	public String getIntestatario()
		{
			return intestatario;
		}

	public void setIntestatario(String intestatario)
		{
			this.intestatario = intestatario;
		}

	public int getIdentificativo()
		{
			return identificativo;
		}

	public void setIdentificativo(int identificativo)
		{
			this.identificativo = identificativo;
		}

	public double getSaldo()
		{
			return saldo;
		}

	public void setSaldo(double saldo)
		{
			this.saldo = saldo;
		}

	public int getPassword()
		{
			return password;
		}

	public void setPassword(int password)
		{
			this.password = password;
		}

	public ContoCorrente(String intestatario, int identificativo, double saldo, int password)
		{
			this.intestatario = intestatario;
			this.identificativo = identificativo;
			this.saldo = saldo;
			this.password = password;
		}

	public String prelievo(double ammontare)
		{
			String erogazione;
			if (ammontare  > saldo)
			{
				if (saldo > Utility.SOGLIA_MASSIMA)
				{
					if(saldo-ammontare>Utility.SOGLIA_MASSIMA)
					{
						erogazione = Utility.POSSIBILE_PRELEVARE;
						saldo = saldo-ammontare;
						return erogazione;
					}else
					{
						erogazione = String.format(Utility.PRELIEVO_ALTO, saldo);
						saldo = Utility.SOGLIA_MASSIMA;
						return erogazione;
						
					}
					
				} else
					return Utility.PRELIEVO_NON_POSSIBILE;

			}
			saldo = saldo - ammontare;
			return Utility.PRELIEVO_GIUSTO;
		}

	public String versamento(double ammontare)
		{
			saldo = saldo + ammontare;
			return Utility.VERSAMENTO_GIUSTO;
		}

	public String chiusura()
		{
			if (Utility.CHIUSURA > saldo)
			{

				return Utility.CHIUSURA_NON_EFFETUATA;
			}
			saldo = saldo - Utility.CHIUSURA;
			saldo = 0;
			return Utility.CHIUSURA_GIUSTO;
		}

	public String toString()
		{
			String descrizione = String.format(Utility.DESCRIZIONE_CONTO, identificativo,
			        intestatario.trim().subSequence(Utility.INIZIO, Utility.FINE), saldo);
			return descrizione;
		}

}
