package com.gildedrose;

public class AgedBrie extends NormalItem {
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateItemQuality() {
        increaseQuality();
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
