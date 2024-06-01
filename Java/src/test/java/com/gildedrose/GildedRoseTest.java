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
}
