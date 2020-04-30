package test.timeduration;
import java.util.Scanner;

public class TimeDuration {

	public int duration = 0;
	int heure = 0;
	int minute = 0;
	int seconde = 0;

	public TimeDuration(int duration) {
		this.duration = duration;
	}

	public static void main(String[] args) throws BadBadValueException {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez un entier :");
		int duration = clavier.nextInt();
		if (duration < 0) {
			throw new BadBadValueException();
		}

		new TimeDuration(duration).toString();

	}

	public String toString() {
		if (duration >= 0 && duration <= 59) {
			System.out.print(duration + "s");
		} else if (duration >= 60 && duration <= 3599) {

			claculMinute();
			claculSeconde();

			System.out.print(minute + "m " + seconde + "s");
		}

		else if (duration > 3599) {

			claculHeure();
			claculMinute();
			claculSeconde();

			System.out.print(heure + "h " + minute + "m " + seconde + "s");
		}

		return "";
	}

	public int claculHeure() {

		heure = duration / 3600;
		duration = duration % 3600;

		return heure;

	}

	public int claculMinute() {

		minute = duration / 60;

		return minute;

	}

	public int claculSeconde() {

		seconde = duration - (minute * 60);

		return seconde;

	}

}
