package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void goldenMasterRefactoringTest() throws IOException {
        Path file = Path.of("src/test/resources/GoldenMaster.txt");
        String content = Files.readString(file);

        ByteArrayOutputStream refactoredOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(refactoredOutput));
        TexttestFixture.main(new String[]{});

        assertEquals(refactoredOutput.toString(), content);
    }

    @Test
    void updateQuality_decreases_quality_of_conjured_items_twice_as_fast_before_its_sell_in_date() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", 3, 6) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(4, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }

    @Test
    void updateQuality_decreases_quality_of_conjured_items_twice_as_fast_after_its_sell_in_date() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", -1, 6) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(2, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void updateQuality_conjured_items_quality_can_not_be_negative() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", 2, 1) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
    }
}
