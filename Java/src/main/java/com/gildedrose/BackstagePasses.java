package com.gildedrose;

public class BackstagePasses extends NormalItem {
    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    public void updateItemQuality() {
        if (item.sellIn > 10) {
            increaseQuality(1);
        } else if (item.sellIn > 5) {
            increaseQuality(2);
        } else {
            increaseQuality(3);
        }
    }

    @Override
    public void updateExpiredItem() {
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void increaseQuality(int increase) {
        item.quality = Math.min(item.quality + increase, 50);
    }
}
