public class AlkHasznalo {
public static void main(String[] args) {
Alkalmazott a, b;
a = new Alkalmazott("Kov�cs J�nos", 150000);
b = new Alkalmazott("Mel�s Pityu", 120000);
boolean FizOK = a.HelyesFizetes(100000, 200000);
if (FizOK) System.out.println(a.Adatok()+" fizet�se megfelel�");
else System.out.println(a.Adatok()+" fizet�se nem megfelel�");
System.out.println(a.Adatok()+" ad�ja: "+a.SzJA());
boolean tkm = a.TobbetKeresMint(b);
if (tkm) System.out.println(a.Adatok()+" t�bbet keres, mint "+b.Adatok());
else System.out.println(a.Adatok()+" kevesebbet keres, mint "+b.Adatok());
}
}