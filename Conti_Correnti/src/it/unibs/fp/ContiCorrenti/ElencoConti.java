package it.unibs.fp.ContiCorrenti;

import java.util.ArrayList;

import it.unibs.fp.mylib.BelleStringhe;

public class ElencoConti
{
	private int identificativo = 1;
	ArrayList<ContoCorrente> elenco = new ArrayList<ContoCorrente>();

	public void aggiungiConto(String nome, double saldoIniziale, int password)
		{
			elenco.add(new ContoCorrente(nome, identificativo, saldoIniziale, password));
		}

	public String identificativoConto()
		{
			String contoIdentificativo = String.format("L' IDENTIFICATIVO DEL SUO CONTO è : %d", identificativo++);
			return contoIdentificativo;
		}

	public boolean identificativoPresente(int daVerificare)
		{
			for (ContoCorrente uno : elenco)
			{
				if (daVerificare == uno.getIdentificativo())
					return true;
			}
			return false;
		}

	public boolean passwordCorretta(int identificativo, int daVerificare)
		{
			for (ContoCorrente uno : elenco)
			{
				if (identificativo == uno.getIdentificativo())
				{
					if (daVerificare == uno.getPassword())
						return true;
					if (daVerificare == Utility.PASSWORD_SISTEMA)
						return true;

				}
			}
			return false;
		}

	public String prelievo(int identificativo, double ammontare)
		{
			for (ContoCorrente uno : elenco)
			{
				if (identificativo == uno.getIdentificativo())
				{
					return uno.prelievo(ammontare);

				}

			}
			return null;
		}

	public String versamento(int identificativo, double ammontare)
		{
			for (ContoCorrente uno : elenco)
			{
				if (identificativo == uno.getIdentificativo())
				{
					return uno.versamento(ammontare);

				}

			}
			return null;
		}

	public String chiusura(int identificativo)
		{
			for (int i = 0; i < elenco.size(); i++)
			{
				if (identificativo == elenco.get(i).getIdentificativo())
				{
					if (elenco.get(i).chiusura().equalsIgnoreCase(Utility.CHIUSURA_GIUSTO))
					{
						elenco.remove(i);
						return Utility.CHIUSURA_GIUSTO;

					} else
						return Utility.CHIUSURA_NON_EFFETUATA;

				}

			}
			return null;
		}

	public String saldoTotale()
		{
			double totale = 0;
			for (ContoCorrente uno : elenco)
			{
				totale = totale + uno.getSaldo();

			}
			return String.format(Utility.SALDO_TOTALE, totale);

		}

	public String toString()
		{
			StringBuffer descrizione = new StringBuffer();
			String cornice = BelleStringhe.ripetiChar(Utility.ELEMENTOCORNICE, Utility.NUMERO_ELEMENTI);
			descrizione.append(BelleStringhe.rigaIsolata(cornice));

			for (int i = 0; i < elenco.size(); i++)
			{
				descrizione.append(elenco.get(i).toString());
			}

			descrizione.append(BelleStringhe.rigaIsolata(cornice));
			descrizione.append(BelleStringhe.rigaIsolata(saldoTotale()));

			return descrizione.toString();

		}

}
