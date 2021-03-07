package com.geniecode.blockchainz;

import com.geniecode.blockchainz.model.Block;
import org.junit.jupiter.api.Test;

public class BlockTest {

    @Test
    void createBlockTest() {
        final Block firstBlock = new Block("first block", "0");
        System.out.println("Block 1 hash : " + firstBlock.getHash());
    }

    @Test
    void createBlockChainTest() {

        final Block firstBlock = new Block("first block", "0");
        System.out.println("Block 1 hash : " + firstBlock.getHash());

        final Block secondBlock = new Block("second block", firstBlock.getHash());
        System.out.println("Block 2 hash : " + secondBlock.getHash());

        final Block thirdBlock = new Block("third block", secondBlock.getHash());
        System.out.println("Block 3 hash : " + thirdBlock.getHash());
    }
}
