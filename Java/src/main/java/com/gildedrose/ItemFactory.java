package com.gildedrose;

public class ItemFactory {
    private ItemFactory() {
    }

    public static ItemBehaviour createItem(Item item) {
        if (item.name.equals(ItemType.SULFURAS.getName())) {
            return new Sulfuras();
        }

        if (item.name.equals(ItemType.BACKSTAGE_PASSES.getName())) {
            return new BackstagePasses(item);
        }

        if (item.name.equals(ItemType.AGED_BRIE.getName())) {
            return new AgedBrie(item);
        }

        if (item.name.equals(ItemType.CONJURED_ITEM.getName())) {
            return new ConjuredItem(item);
        }

        return new NormalItem(item);
    }
}
