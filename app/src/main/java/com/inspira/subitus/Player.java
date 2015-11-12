package com.inspira.subitus;

import java.util.UUID;

/**
 * Created by kurifu on 11/11/2015.
 */
public class Player implements IPlayer {
    private UUID mId;
    private boolean mIsActivePlayer;
    private Role mRole;

    public Player(UUID id) {
        this.mId = id;
    }


    @Override
    public UUID getId() {
        return mId;
    }

    @Override
    public boolean isActivePlayer() {
        return mIsActivePlayer;
    }

    @Override
    public void setActivePlayer(boolean isActive) {
        this.mIsActivePlayer = isActive;
    }

    public Role getRole() {
        return mRole;
    }

    public void setRole(Role role) {
        this.mRole = role;
    }



    @Override
    public void takeTurn() {

    }

    @Override
    public void proposeTeam() {

    }

    @Override
    public void voteForProposal() {

    }

    @Override
    public void voteOnQuest() {

    }

    @Override
    public void sendMessage() {

    }
}
