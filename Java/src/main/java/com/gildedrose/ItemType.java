package com.gildedrose;

public enum ItemType {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASSES("Backstage passes to a TAFKAL80ETC concert"),
    SULFURAS("Sulfuras, Hand of Ragnaros"),
    CONJURED_ITEM("Conjured Mana Cake");

    private String name;

    ItemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
