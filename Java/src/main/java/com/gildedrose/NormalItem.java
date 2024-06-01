package com.gildedrose;

public class NormalItem implements ItemBehaviour {
    private Item item;

    public NormalItem(Item item) {
        this.item = item;
    }

    public void updateItemQuality() {
        decreaseQuality(item);
    }

    public void updateSellIn() {
        item.sellIn--;
    }

    public void updateExpiredItem() {
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
