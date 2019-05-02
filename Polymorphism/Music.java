package Polymorphism;

class Instrument{
	public void play(Note n){
		System.out.println("Instrument.play()");
	}
}

 class Wind extends Instrument{
	 //Redefine interface method
	public void play(Note n){
		System.out.println("Wind.play() "+n);
	}
}
 
 //Inheritance and upcasting
public class Music {

	public static void tune(Instrument i){
		i.play(Note.C_SHARP);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wind flute=new Wind();
		tune(flute); // Upcasting
	}

}
/*
Output: 
Wind.play() C_SHARP
*/