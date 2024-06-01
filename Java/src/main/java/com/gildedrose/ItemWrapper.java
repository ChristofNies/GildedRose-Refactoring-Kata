package com.gildedrose;

public class ItemWrapper implements ItemBehaviour {

    private Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    public void updateItemQuality() {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

                if (item.sellIn < 11) {
                    increaseQuality(item);
                }

                if (item.sellIn < 6) {
                    increaseQuality(item);
                }
            }
        } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            decreaseQuality(item);
        }
    }

    public void updateSellIn() {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }

    public void updateExpiredItem() {
        if (item.sellIn < 0) {
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.quality = 0;
            } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                decreaseQuality(item);
            }
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;

        }
    }

    public static void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
