package com.gildedrose;

import static com.gildedrose.NormalItem.increaseQuality;

public class AgedBrie implements ItemBehaviour {
    private Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void updateItemQuality() {
        increaseQuality(item);
    }

    @Override
    public void updateSellIn() {
        item.sellIn--;
    }

    @Override
    public void updateExpiredItem() {
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }
}
