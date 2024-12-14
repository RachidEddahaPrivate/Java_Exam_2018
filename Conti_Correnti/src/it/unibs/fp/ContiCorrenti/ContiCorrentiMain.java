package it.unibs.fp.ContiCorrenti;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class ContiCorrentiMain
{

	public static void main(String[] args)
		{
			int scelta = 0;
			MyMenu menu = new MyMenu(Utility.SALUTO, Utility.SCELTE);
			ElencoConti elenco = new ElencoConti();
			do
			{
				scelta = menu.scegli();
				switch (scelta)
				{
					case 1:
					{
						aperturaNuovoConto(elenco);
						break;
					}
					case 2:
					{
						prelievoConto(elenco);
						break;
					}
					case 3:
					{
						versamentoConto(elenco);
						break;
					}

					case 4:
					{
						chiusuraConto(elenco);
						break;
					}
					case 5:
					{
						System.out.println(elenco.toString());
						break;
					}
					case 6:
					{
						elenco = Utility.inizializza();
						System.out.println(Utility.INIZIALIZZAZIONE);
						break;
					}
					default:
					{
						if (scelta != 0)
							System.out.println(Utility.SCELTA_INESISTENTE);
					}
				}
			} while (scelta != 0);
			System.out.println(Utility.RINGRAZIAMENTI);

		}

	public static void aperturaNuovoConto(ElencoConti elenco)
		{
			int password, passwordSistema;
			double saldo = Utility.MINIMO;
			String nomeIntestatario;
			boolean reinserirePass = false;
			do
			{
				passwordSistema = InputDati.leggiInteroNonNegativo(Utility.INSERIRE_PASSWORD_SISTEMA);
				if (passwordSistema == Utility.PASSWORD_SISTEMA)
				{
					nomeIntestatario = InputDati.leggiStringaNonVuota(Utility.INSERIMENTO_NOME);
					if (InputDati.yesOrNo(Utility.INSERIMENTO_SALDO))
						saldo = InputDati.leggiDoubleConMinimo(Utility.INSERIRE_SALDO, Utility.MINIMO);
					password = InputDati.leggiInteroNonNegativo(Utility.INSERIRE_PASSWORD);
					elenco.aggiungiConto(nomeIntestatario, saldo, password);
					System.out.println(elenco.identificativoConto());
					reinserirePass = false;

				} else
					reinserirePass = InputDati.yesOrNo(Utility.PASSWORD_ERRATA);

			} while (reinserirePass);

		}

	public static void prelievoConto(ElencoConti elenco)
		{
			int password, identificativo;
			double prelievo;
			boolean reinserirePass = false;
			identificativo = InputDati.leggiInteroConMinimo(Utility.INSERIRE_IDENTIFICATIVO_PRELIEVO, Utility.MINIMO);
			if (elenco.identificativoPresente(identificativo))
			{
				do
				{
					password = InputDati.leggiInteroNonNegativo(Utility.INSERIRE_PASSWORD_PRELIEVO);
					if (elenco.passwordCorretta(identificativo, password))
					{
						prelievo = InputDati.leggiDoubleConMinimo(Utility.AMMONTARE_PRELIEVO, Utility.MINIMO);
						System.out.println(elenco.prelievo(identificativo, prelievo));
						reinserirePass = false;
					} else
						reinserirePass = InputDati.yesOrNo(Utility.PASSWORD_ERRATA);

				} while (reinserirePass);

			} else
				System.out.println(Utility.IDENTIFICATIVO_NON_ESISTE);

		}

	public static void versamentoConto(ElencoConti elenco)
		{
			int password, identificativo;
			double versamento;
			boolean reinserirePass = false;

			identificativo = InputDati.leggiInteroConMinimo(Utility.INSERIRE_IDENTIFICATIVO_VERSAMENTO, Utility.MINIMO);
			if (elenco.identificativoPresente(identificativo))
			{
				do
				{
					password = InputDati.leggiInteroNonNegativo(Utility.INSERIRE_PASSWORD_VERSAMENTO);
					if (elenco.passwordCorretta(identificativo, password))
					{
						versamento = InputDati.leggiDoubleConMinimo(Utility.AMMONTARE_VERSAMENTO, Utility.MINIMO);
						System.out.println(elenco.versamento(identificativo, versamento));
						reinserirePass = false;
					} else
						reinserirePass = InputDati.yesOrNo(Utility.PASSWORD_ERRATA);

				} while (reinserirePass);

			} else
				System.out.println(Utility.IDENTIFICATIVO_NON_ESISTE);
		}

	public static void chiusuraConto(ElencoConti elenco)
		{
			int password, identificativo;
			boolean reinserirePass = false;
			identificativo = InputDati.leggiInteroConMinimo(Utility.INSERIRE_IDENTIFICATIVO_CHIUSURA, Utility.MINIMO);
			if (elenco.identificativoPresente(identificativo))
			{
				do
				{
					password = InputDati.leggiInteroNonNegativo(Utility.INSERIRE_PASSWORD_CHIUSURA);
					if (elenco.passwordCorretta(identificativo, password))
					{

						System.out.println(elenco.chiusura(identificativo));
						reinserirePass = false;
					} else
						reinserirePass = InputDati.yesOrNo(Utility.PASSWORD_ERRATA);

				} while (reinserirePass);

			} else
				System.out.println(Utility.IDENTIFICATIVO_NON_ESISTE);

		}

}
