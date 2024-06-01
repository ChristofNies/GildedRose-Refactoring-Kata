package com.gildedrose;

import static com.gildedrose.ItemWrapper.increaseQuality;

public class BackstagePasses implements ItemBehaviour {
    private Item item;

    public BackstagePasses(Item item) {
        this.item = item;
    }

    @Override
    public void updateItemQuality() {
        increaseQuality(item);

        if (item.sellIn < 11) {
            increaseQuality(item);
        }

        if (item.sellIn < 6) {
            increaseQuality(item);
        }
    }

    @Override
    public void updateSellIn() {
        item.sellIn = item.sellIn - 1;
    }

    @Override
    public void updateExpiredItem() {
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
