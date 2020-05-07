package com.github.alxbel.sia2.ch1.knight.model.impl;

import com.github.alxbel.sia2.ch1.knight.exception.QuestFailedException;
import com.github.alxbel.sia2.ch1.knight.model.Quest;
import org.apache.log4j.Logger;

public class HolyGrailQuest implements Quest {

    private static final Logger log = Logger.getLogger(HolyGrailQuest.class);

    public HolyGrailQuest() {
        log.debug("ctor");
    }

    public Object embark() throws QuestFailedException  {
        return new HolyGrail();
    }
}
