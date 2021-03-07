package com.geniecode.blockchainz.model;

import com.geniecode.blockchainz.util.SecurityUtils;
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
     * @param inputData         the block data.
     * @param inputPreviousHash the previous block hash.
     */
    public Block(final String inputData, final String inputPreviousHash) {
        this.data = inputData;
        this.previousHash = inputPreviousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    /**
     * Calculates the block hash.
     *
     * @return the block hash.
     */
    public String calculateHash() {
        return SecurityUtils.applySha256(this.previousHash
                + this.timeStamp
                + this.data);
    }
}
