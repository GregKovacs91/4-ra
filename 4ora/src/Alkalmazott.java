public class Alkalmazott {
private String nev;
private int fizetes;
public Alkalmazott(String Nev, int Fizetes) {
nev = Nev;
fizetes = Fizetes;
}
public boolean HelyesFizetes(int AlsoHatar, int FelsoHatar){
boolean vissza = false;
if (fizetes >= AlsoHatar && fizetes <= FelsoHatar) vissza = true;
return vissza;
}
public double SzJA(){
return fizetes*0.16;
}
public boolean TobbetKeresMint(Alkalmazott Masik){
return fizetes > Masik.fizetes;
}
}