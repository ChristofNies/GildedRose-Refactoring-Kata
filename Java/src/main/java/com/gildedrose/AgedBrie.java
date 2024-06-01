package com.gildedrose;

public class AgedBrie implements ItemBehaviour {
    private Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void updateItemQuality() {
        increaseQuality();
    }

    @Override
    public void updateSellIn() {
        item.sellIn--;
    }

    @Override
    public void updateExpiredItem() {
        if (item.sellIn < 0) {
            increaseQuality();
        }
    }

    private void increaseQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
