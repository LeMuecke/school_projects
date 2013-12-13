public class makeMyStammbaum {

	public unknownPerson end = new unknownPerson();
	public Guy elfriedeMueller = new Guy("Elfriede Mueller", end,end );
	public Guy hermannMueller = new Guy("Hermann Mueller", end,end);
	public Guy ursulaKlimaschka = new Guy("Ursula Klimaschka", end,end);
	public Guy joachimKlimaschka = new Guy("Joachim Klimaschka", end,end);
	public Guy birgitKlimaschka = new Guy("Birgit Klimaschka", elfriedeMueller, hermannMueller);
	public Guy christianKlimaschka = new Guy("Christian Klimaschka", ursulaKlimaschka, joachimKlimaschka);
	public Guy me = new Guy("Simon Klimaschka", birgitKlimaschka, christianKlimaschka);
	
	public makeMyStammbaum() {
		
		Stammbaum stammbaum = new Stammbaum();
		stammbaum.first = me;
		stammbaum.startPreOrder();
		
	}
	
	public static void main(String[] args) {
	
		makeMyStammbaum mmakeMyStammbaum = new makeMyStammbaum();
		
	}
}
