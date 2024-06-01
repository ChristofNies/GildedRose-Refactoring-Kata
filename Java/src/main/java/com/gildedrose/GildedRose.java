package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemBehaviour itemBehaviour;

            if (item.name.equals("Aged Brie")) {
                itemBehaviour = new AgedBrie(item);
            } else {
                itemBehaviour = new ItemWrapper(item);
            }

            itemBehaviour.updateItemQuality();
            itemBehaviour.updateSellIn();
            itemBehaviour.updateExpiredItem();
        }
    }
}
