package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemBehaviour itemBehaviour = ItemFactory.createItem(item);

            itemBehaviour.updateItemQuality();
            itemBehaviour.updateSellIn();
            itemBehaviour.updateExpiredItem();
        }
    }
}
