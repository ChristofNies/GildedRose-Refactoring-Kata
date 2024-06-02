package com.gildedrose;

public class NormalItem implements ItemBehaviour {
    protected Item item;

    public NormalItem(Item item) {
        this.item = item;
    }

    public void updateItemQuality() {
        decreaseQuality();
    }

    public void updateSellIn() {
        item.sellIn--;
    }

    public void updateExpiredItem() {
        if (item.sellIn < 0) {
            decreaseQuality();
        }
    }

    private void decreaseQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
