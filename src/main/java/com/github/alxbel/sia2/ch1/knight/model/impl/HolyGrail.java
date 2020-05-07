package com.github.alxbel.sia2.ch1.knight.model.impl;

import org.apache.log4j.Logger;

public class HolyGrail {

    private static final Logger log = Logger.getLogger(HolyGrail.class);

    public HolyGrail() {
        log.debug("ctor");
    }

    public boolean isHoly() {
        return false;
    }
}
