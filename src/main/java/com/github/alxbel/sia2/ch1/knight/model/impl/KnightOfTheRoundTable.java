package com.github.alxbel.sia2.ch1.knight.model.impl;

import com.github.alxbel.sia2.ch1.knight.exception.QuestFailedException;
import com.github.alxbel.sia2.ch1.knight.model.Knight;
import com.github.alxbel.sia2.ch1.knight.model.Quest;
import org.apache.log4j.Logger;

public class KnightOfTheRoundTable implements Knight {

    private static final Logger log = Logger.getLogger(KnightOfTheRoundTable.class);

    private String name;
    private Quest quest;

    public KnightOfTheRoundTable(String name) {
        log.debug("ctor");
        this.name = name;
    }
    public Object embarkOnQuest() throws QuestFailedException {
        return quest.embark();
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}