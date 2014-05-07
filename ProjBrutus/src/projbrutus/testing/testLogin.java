package projbrutus.testing;

import java.util.ArrayList;

import projbrutus.course.examination.task.CourseTask;

public class testLogin {

	/*
	 * 
	 * if ((chosenTask <= tasks.size()) && (chosenTask > -1 )) {
	 * 
	 * System.out.println(tasks.get(chosenTask).toString());
	 * manageTask(tasks.get(chosenTask)); }
	 */
	public class Test_UppgifterLarare {
		public void test(String kurskod, String selected, String ValdUppgift) {
			if (kurskod.equals("725G51")) {
				if (selected.equals("Projekt")) {
					if (ValdUppgift.equals("Projekt1")) {
						System.out.println("Korrekt uppgiftsinformation");
					} else {
						System.out.println("Felaktigt projekt");
					}
				} else if (selected.equals("PM")) {
					if (ValdUppgift.equals("PM1")) {
						System.out.println("Korrekt uppgiftsinformation");
					} else {
						System.out.println("Felaktigt PM");
					}
				} else if (selected.equals("Labbar")) {
					if (ValdUppgift.equals("Labbar1")) {
						System.out.println("Korrekt uppgiftsinformation");
					} else {
						System.out.println("Felaktig labb");
					}
				} else if (selected.equals("Tentamen")) {
					System.out
							.println("Ogiltig tentamen, detta borde inte ske");
				} else {
					System.out.println("Moment är fel");
				}
			} else if (kurskod.equals("725G49")) {
				if (selected.equals("Projekt")) {
					if (ValdUppgift.equals("Projekt1")) {
						System.out.println("Korrekt uppgiftsinformation");
					} else {
						System.out.println("Felaktigt projekt");
					}
				} else if (selected.equals("PM")) {
					System.out.println("Ogiltigt PM, detta borde inte ske");
				} else if (selected.equals("Labbar")) {
					if (ValdUppgift.equals("Labbar1")) {
						System.out.println("Korrekt uppgiftsinformation");
					} else if (ValdUppgift.equals("Labbar2")) {
						System.out.println("Korrekt uppgiftsinformation");
					} else if (ValdUppgift.equals("Labbar3")) {
						System.out.println("Korrekt uppgiftsinformation");
					} else {
						System.out.println("Felaktig labb");
					}
				} else if (selected.equals("Tentamen")) {
					if (ValdUppgift.equals("Tentamen1")) {
						System.out.println("Korrekt uppgiftsinformation");
					} else {
						System.out.println("Felaktig tentamen");
					}
				} else {
					System.out.println("Moment är fel");
				}
			} else {
				System.out.println("Kurskod är fel");
			}
		}
	}
}
