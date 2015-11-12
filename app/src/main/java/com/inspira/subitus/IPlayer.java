package com.inspira.subitus;

import java.util.UUID;

/**
 * Created by kurifu on 11/11/2015.
 */
public interface IPlayer {
    UUID getId();
    boolean isActivePlayer();
    void setActivePlayer(boolean isActive);

    void takeTurn();
    void proposeTeam();
    void voteForProposal();
    void voteOnQuest();

    void sendMessage();
}
