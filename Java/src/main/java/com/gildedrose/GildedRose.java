package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemBehaviour itemBehaviour;

            if (item.name.equals(ItemType.AGED_BRIE.getName())) {
                itemBehaviour = new AgedBrie(item);
            } else if (item.name.equals(ItemType.BACKSTAGE_PASSES.getName())) {
                itemBehaviour = new BackstagePasses(item);
            } else if (item.name.equals(ItemType.SULFURAS.getName())) {
                itemBehaviour = new Sulfuras();
            } else {
                itemBehaviour = new NormalItem(item);
            }

            itemBehaviour.updateItemQuality();
            itemBehaviour.updateSellIn();
            itemBehaviour.updateExpiredItem();
        }
    }
}
