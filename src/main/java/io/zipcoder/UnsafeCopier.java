package io.zipcoder;

import java.util.Random;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        String nextWord = "";
        while (this.stringIterator.hasNext()) {
            nextWord = this.stringIterator.next() + " ";
            try {
                Thread.sleep(new Random().nextInt(20));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.copied += nextWord;
        }
    }
}
