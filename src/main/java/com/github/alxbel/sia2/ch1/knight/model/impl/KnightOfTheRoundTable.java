package com.github.alxbel.sia2.ch1.knight.model.impl;

import com.github.alxbel.sia2.ch1.knight.exception.QuestFailedException;
import com.github.alxbel.sia2.ch1.knight.model.Knight;
import com.github.alxbel.sia2.ch1.knight.model.Quest;

public class KnightOfTheRoundTable implements Knight {

    private String name;
    private Quest quest;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
    }
    public Object embarkOnQuest() throws QuestFailedException {
        return quest.embark();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}