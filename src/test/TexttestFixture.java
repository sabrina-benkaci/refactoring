package test;

import main.GildedRose;
import main.Item;
public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("l'ensemble des tests!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Aged Brie", -8,49),
	 	new Item("Aged Brie", 16, 80),
	 	new Item("Aged Brie", -3, 5),
	 	new Item("Aged Brie", -3, 56),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Elixir of the Mongoose", -2, 8),
	 	new Item("Elixir of the Mongoose", -2, -8),
	 	new Item("Sulfuras, Hand of Ragnaros", 10, 45),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 6, 48),
		new Item("Backstage passes to a TAFKAL80ETC concert", 3, 47),
		new Item("Backstage passes to a TAFKAL80ETC concert", -6, 31),
		new Item("Backstage passes to a TAFKAL80ETC concert", -6, 50),
		new Item("Backstage passes to a TAFKAL80ETC concert", 13, 62),
		new Item("Conjured Mana Cake", 3, 6) };
        GildedRose app = new GildedRose(items);
        int days = 4;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        } 

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
