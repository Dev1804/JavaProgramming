import Polymorphism.*;

interface Instrument1 {
	// Compile-time constant:
	int VALUE = 5; // static & final
	// Cannot have method definitions:

	void play(Note n); // Automatically public

	void adjust();
}

class Wind1 implements Instrument1 {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Percussion1 implements Instrument1 {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Stringed1 implements Instrument1 {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Brass1 extends Wind1 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind1 extends Wind1 {
	public String toString() {
		return "Woodwind";
	}
}

public class Interface {

	static void tune(Instrument1 i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument1[] e) {
		for (Instrument1 i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument1[] orchestra = {
				 new Wind1(),
				 new Percussion1(),
				 new Stringed1(), 
				 new Brass1(),
				 new Woodwind1()
				 };
		tuneAll(orchestra);
	}
}

/*
Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*/