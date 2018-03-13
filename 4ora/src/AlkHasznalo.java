public class AlkHasznalo {
public static void main(String[] args) {
Alkalmazott a, b;
a = new Alkalmazott("Kovács János", 150000);
b = new Alkalmazott("Melós Pityu", 120000);
boolean FizOK = a.HelyesFizetes(100000, 200000);
if (FizOK) System.out.println(a.Adatok()+" fizetése megfelelõ");
else System.out.println(a.Adatok()+" fizetése nem megfelelõ");
System.out.println(a.Adatok()+" adója: "+a.SzJA());
boolean tkm = a.TobbetKeresMint(b);
if (tkm) System.out.println(a.Adatok()+" többet keres, mint "+b.Adatok());
else System.out.println(a.Adatok()+" kevesebbet keres, mint "+b.Adatok());
}
}