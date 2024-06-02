package com.gildedrose;
public class ConjuredItem extends NormalItem {
    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void updateItemQuality() {
        decreaseQuality();
    }

    @Override
    public void updateExpiredItem() {
        if (item.sellIn < 0) {
            decreaseQuality();
        }
    }

    private void decreaseQuality() {
        item.quality = Math.max(item.quality - 2, 0);
    }
}
