package com.github.alxbel.sia2.ch1.knight.model.impl;

import com.github.alxbel.sia2.ch1.knight.exception.QuestFailedException;
import com.github.alxbel.sia2.ch1.knight.model.Quest;

public class HolyGrailQuest implements Quest {

    public HolyGrailQuest() { }

    public Object embark() throws QuestFailedException  {
        return new HolyGrail();
    }
}
