package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTempFolder() throws IOException{
        File created = tempFolder.newFile("file.txt");

        assertTrue(created.isFile());
        assertEquals(tempFolder.getRoot(), created.getParentFile());
    }

}
