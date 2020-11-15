package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.GildedRose;
import main.Item;

class GildedRoseTest {
    @Test
    public void test_set() {
		Item[] items = new Item[] {
		new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Aged Brie",-8,49),
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
		app.updateQuality();
//sellIn test         
		assertEquals(9, items[0].sellIn);
		assertEquals(1, items[1].sellIn);
		assertEquals(-9, items[2].sellIn);
		assertEquals(15, items[3].sellIn);
		assertEquals(-4, items[4].sellIn);
		assertEquals(-4, items[5].sellIn);
		assertEquals(4, items[6].sellIn);
		assertEquals(-3, items[7].sellIn);
		assertEquals(-3, items[8].sellIn);
		assertEquals(10, items[9].sellIn);		
		assertEquals(0, items[10].sellIn); 
		assertEquals(-1, items[11].sellIn);
		assertEquals(14, items[12].sellIn);
		assertEquals(9, items[13].sellIn);
		assertEquals(4, items[14].sellIn);
		assertEquals(5, items[15].sellIn);
		assertEquals(2, items[16].sellIn);
		assertEquals(-7, items[17].sellIn);
		assertEquals(-7, items[18].sellIn);
		assertEquals(12, items[19].sellIn);  
		assertEquals(2, items[20].sellIn);  	
//quality test
		assertEquals(19,app.items[0].quality);
		assertEquals(1,app.items[1].quality);
		assertEquals(50, app.items[2].quality);
		assertEquals(80, app.items[3].quality);
		assertEquals(7, app.items[4].quality);
		assertEquals(56, app.items[5].quality);
		assertEquals(6, app.items[6].quality);
		assertEquals(6, app.items[7].quality);  
		assertEquals(-8, app.items[8].quality);
		assertEquals(45, app.items[9].quality);
		assertEquals(80, app.items[10].quality); 
		assertEquals(80, app.items[11].quality);
		assertEquals(21, app.items[12].quality);	
		assertEquals(50, app.items[13].quality);
		assertEquals(50, app.items[14].quality);   
		assertEquals(50, app.items[15].quality);
		assertEquals(50, app.items[16].quality);
		assertEquals(0, app.items[17].quality);
		assertEquals(0, app.items[18].quality);
		assertEquals(62, app.items[19].quality);
		assertEquals(5, app.items[20].quality);
//string test
		String machaine=null;
		machaine=items[10].name+", "+items[10].sellIn+", "+items[10].quality;
		assertEquals(machaine, items[10].toString());
		 
    }

}
