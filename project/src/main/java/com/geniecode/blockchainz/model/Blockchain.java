package com.geniecode.blockchainz.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

/**
 * The blockchain class.
 */
@Getter
@Setter
@NoArgsConstructor
public class Blockchain {

    /**
     * The blockchain field.
     */
    private List<Block> blockchain = new LinkedList<>();
}
