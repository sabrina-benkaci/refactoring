package main;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public void Quality_Decreases(int i) {
        items[i].quality = items[i].quality - 1;
    }

    public void Quality_Increases (int i) {
        items[i].quality = items[i].quality + 1;
    }

    public void SellIn_Decreases (int i) {
    	if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
    		items[i].sellIn = items[i].sellIn - 1;
    	}
    }

    public void All_product_except_sulfuras(int i) {
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        	Quality_Decreases(i);
        }
    }
    public void Quality_greater_0(int i) {
        if (items[i].quality > 0) {
        	All_product_except_sulfuras(i);
        }
    }
    
    
    public void Quality_lower_50(int i) {
	    if (items[i].quality < 50) {
	    	Quality_Increases(i);
	    }
    }
    public void sellin_lower_11(int i) {
    	if (items[i].sellIn < 11) {
    		Quality_lower_50(i);
    	}
    }
    public void sellin_lower_6(int i) {
    	 if (items[i].sellIn < 6) {
    		 Quality_lower_50(i);
    	 }
    }
    public void Backstage_product(int i) {
    	if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    		sellin_lower_11(i);
    		sellin_lower_6(i);
    		
    	}
    }
    public void Aged_Brie_or_Backstage_products(int i) {
    	
    		Quality_lower_50(i);
    		Backstage_product(i);	
    	
    }
    
    public void  All_product_except_Aged_Brie(int i) {
    	 if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    		 Quality_greater_0(i);
    	 }else {
    		
    		 items[i].quality = items[i].quality - items[i].quality;
    	 }
    }
    public void  Aged_Brie_product(int i) {
    		Quality_lower_50(i);
    }
    public void SellIn_lower_0_rule(int i){
    	 if (!items[i].name.equals("Aged Brie")) {
    		 All_product_except_Aged_Brie(i);
    	 }else {
    		 Aged_Brie_product(i);
    	 }
    }
    public void sellin_lower_0(int i){
    	if (items[i].sellIn < 0) {
    		SellIn_lower_0_rule(i);
    	}	
    }
    public void updateQuality() {
    	 for (int i = 0; i < items.length; i++) {
    		 if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    	    		Quality_greater_0(i) ;
    	     }else {
    	    	 Aged_Brie_or_Backstage_products(i);
    	     }
    		 SellIn_Decreases(i);
    		 sellin_lower_0(i);
    	 }
    }
    	
    	
    	
    }