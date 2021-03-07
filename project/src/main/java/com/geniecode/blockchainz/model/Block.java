package com.geniecode.blockchainz.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Basic model class for Block.
 */
@Getter
@Setter
public class Block {

    /**
     * The block hash.
     */
    private String hash;

    /**
     * The previous block hash.
     */
    private String previousHash;

    /**
     * The block data.
     */
    private String data;

    /**
     * The block creation data in milliseconds.
     */
    private long timeStamp;

    /**
     * The class constructor.
     *
     * @param data         the block data.
     * @param previousHash the previous block hash.
     */
    public Block(final String data, final String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
    }
}
