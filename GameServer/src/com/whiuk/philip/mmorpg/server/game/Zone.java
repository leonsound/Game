package com.whiuk.philip.mmorpg.server.game;

import java.util.List;

/**
 * Zone.
 * @author Philip
 *
 */
public class Zone {
    /**
     * 
     */
    private List<NPC> npcs;

    /**
     * Zone.
     * @param p1
     * @param p2
     */
    public final void spawnCharacterByParent(final NPC p1, final NPC p2) {
        // TODO Auto-generated method stub
        NPC p3 = new NPC();
        npcs.add((NPC) p3);
    }

}