package com.github.alxbel.sia2.ch1.knight.model;

import com.github.alxbel.sia2.ch1.knight.exception.QuestFailedException;

public interface Knight {
    Object embarkOnQuest() throws QuestFailedException;
}
