import java.util.ArrayList;

public class Corso {
	private ArrayList<Esame> elencoEsami = new ArrayList<Esame>();

	public Corso(ArrayList<Esame> elencoEsami) {
		super();
		this.elencoEsami = elencoEsami;
	}

	public int votoMinimo() {
		int min = 31;
		for (int i = 0; i < elencoEsami.size(); i++) {
			if (elencoEsami.get(i).getVoto() < min) {
				min = elencoEsami.get(i).getVoto();
			}
		}
		return min;
	}

	ArrayList<String> StudentiPeggiori() {
		ArrayList<String> res = new ArrayList<>();

		int f = votoMinimo();
		for (int i = 0; i < elencoEsami.size(); i++) {
			if (elencoEsami.get(i).getVoto() == f) {
				String g = elencoEsami.get(i).getCognome(); 
				res.add(g); // aggiungi arraylist res g
			}
		}
		return res;
	}

	public static void main(String[] args) {
		ArrayList<Esame> el = new ArrayList<Esame>();
		Esame e = new Esame(1, "Allegri", 25); // creato una variabile di tipo esame
		Esame e1 = new Esame(2, "Pioli", 24);
		Esame e2 = new Esame(3, "Conte", 22);
		Esame e3 = new Esame(4, "Seedorf", 19);

		el.add(e);
		el.add(e1);
		el.add(e2);
		el.add(e3);

		Corso c = new Corso(el);

		int h = c.votoMinimo();
		System.out.println(" il voto minimo è: " + h);
		
		// richiamiamo metodo studentipeggiori
		c.StudentiPeggiori();
		ArrayList<String> a = c.StudentiPeggiori();
		System.out.println(a);
	}
}
