package com.github.alxbel.sia2.ch1.knight.model.impl;

import com.github.alxbel.sia2.ch1.knight.model.Knight;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;

public class Minstrel {
    private static final Logger SONG = Logger.getLogger(Minstrel.class);

    public Minstrel() {
    }

    public void singBefore(Knight knight) {
        SONG.debug("Fa la la; Sir " + knight.getName() +
                " is so brave!");
    }
    public void singAfter(Knight knight) {
        SONG.debug("Tee-hee-he; Sir " + knight.getName() +
                " did embark on a quest!");
    }
}
