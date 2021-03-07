package com.geniecode.blockchainz.util;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

/**
 * Security Utils class.
 */
public final class SecurityUtils {

    private SecurityUtils() {
        //left empty on purpose
    }

    /**
     * Applies the Sha256 to a given string input.
     *
     * @param input the string to be hashed.
     * @return the hashed string.
     */
    public static String applySha256(final String input) {
        return Hashing.sha256()
                .hashString(input, StandardCharsets.UTF_8)
                .toString();
    }
}

