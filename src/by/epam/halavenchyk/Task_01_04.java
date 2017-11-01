package by.epam.halavenchyk;

import java.util.Scanner;

public class Task_01_04 {
	  public static void main(String[] args) {
		    double cat1;
		    double cat2;
		    double gip, sqr;

		    Scanner sc = new Scanner(System.in);
		    System.out.println("Введите первый катет: ");
		    while (!sc.hasNextDouble()) {
		      sc.next();
		    }
		    cat1 = sc.nextDouble();

		    System.out.println("Введите второй катет: ");
		    while (!sc.hasNextDouble()) {
		      sc.next();
		    }
		    cat2 = sc.nextDouble();

		    gip = Math.sqrt(cat1 * cat1 + cat2 * cat2);
		    System.out.println("Гипотенуза треугольника = " + gip);

		    sqr = cat1 * cat2 / 2;
		    System.out.println("Площадь треугольника = " + sqr);
		  }
		}
