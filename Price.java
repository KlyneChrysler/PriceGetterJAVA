import java.util.Scanner;

public class Price {
	public static void main ( String[] args ) {
		Scanner scan = new Scanner ( System.in );

		String item1, item2, item3;
		int qty1, qty2, qty3;
		int price1, price2, price3;
		int total1, total2, total3, total;

		System.out.print("ENTER 1ST ITEM: ");
		item1 = scan.nextLine();
		System.out.print("ENTER 2ND ITEM: ");
		item2 = scan.nextLine();
		System.out.print("ENTER 3RD ITEM: ");
		item3 = scan.nextLine();

		System.out.print("ENTER 1ST ITEM QUANTITY: ");
		qty1 = scan.nextInt();
		System.out.print("ENTER 1ST ITEM PRICE: ");
		price1 = scan.nextInt();


		System.out.print("ENTER 2ND ITEM QUANTITY: ");
		qty2 = scan.nextInt();
		System.out.print("ENTER 2ND ITEM PRICE: ");
		price2 = scan.nextInt();


		System.out.print("ENTER 3RD ITEM QUANTITY: ");
		qty3 = scan.nextInt();
		System.out.print("ENTER 3RD ITEM PRICE: ");
		price3 = scan.nextInt();

		total1 = price1 * qty1;
		total2 = price2 * qty2;
		total3 = price3 * qty3;
		total = total1 + total2 + total3;

		System.out.println(item1 + "'S PRICE IS " + price1 +
		". THE QUANTITY IS " + qty1 + ". TOTAL PRICE IS " + total1 + ".");

		System.out.println(item2 + "'S PRICE IS " + price2 +
		". THE QUANTITY IS " + qty2 + ". TOTAL PRICE IS " + total2 + ".");

		System.out.println(item3 + "'S PRICE IS " + price3 +
		". THE QUANTITY IS " + qty3 + ". TOTAL PRICE IS " + total3 + ".");

		System.out.println("THE MASTER TOTAL IS: " + total);
	}
}