package main;

import graphic.EntityGraphic;
import graphic.MapGraphic;
import map.Map;
import map.MapLoader;
import monster.Dragon;
import monster.GreenSlime;
import npc.OldMan;
import player.Player;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setMap() {
        // INSTANTIATES
        // map 1
        gp.map1 = new Map(gp);

        gp.map1.setMapGraphic(new MapGraphic(gp.map1));
        gp.map1.setMapLoader(new MapLoader(gp.map1));
        gp.map1.mapLoader.loadMap("/res/maps/world02.txt");
        // object
        // npc
        gp.map1.npc[0] = new OldMan(gp);
        gp.map1.npc[0].setEntityGraphic(new EntityGraphic(gp.map1.npc[0]));
        gp.map1.npc[0].worldX = gp.tileSize * 12;
        gp.map1.npc[0].worldY = gp.tileSize * 18;

        // monster
        gp.map1.monster[0] = new GreenSlime(gp);
        gp.map1.monster[0].setEntityGraphic(new EntityGraphic(gp.map1.monster[0]));
        gp.map1.monster[0].worldX = gp.tileSize * 5;
        gp.map1.monster[0].worldY = gp.tileSize * 36;

        gp.map1.monster[1] = new GreenSlime(gp);
        gp.map1.monster[1].setEntityGraphic(new EntityGraphic(gp.map1.monster[1]));
        gp.map1.monster[1].worldX = gp.tileSize * 11;
        gp.map1.monster[1].worldY = gp.tileSize * 38;

        gp.map1.monster[2] = new GreenSlime(gp);
        gp.map1.monster[2].setEntityGraphic(new EntityGraphic(gp.map1.monster[2]));
        gp.map1.monster[2].worldX = gp.tileSize * 46;
        gp.map1.monster[2].worldY = gp.tileSize * 21;

        gp.map1.monster[3] = new GreenSlime(gp);
        gp.map1.monster[3].setEntityGraphic(new EntityGraphic(gp.map1.monster[3]));
        gp.map1.monster[3].worldX = gp.tileSize * 36;
        gp.map1.monster[3].worldY = gp.tileSize * 43;

        gp.map1.monster[4] = new GreenSlime(gp);
        gp.map1.monster[4].setEntityGraphic(new EntityGraphic(gp.map1.monster[4]));
        gp.map1.monster[4].worldX = gp.tileSize * 17;
        gp.map1.monster[4].worldY = gp.tileSize * 28;

        gp.map1.monster[5] = new Dragon(gp);
        gp.map1.monster[5].setEntityGraphic(new EntityGraphic(gp.map1.monster[5]));
        gp.map1.monster[5].worldX = gp.tileSize * 16;
        gp.map1.monster[5].worldY = gp.tileSize * 45;

        gp.map1.monster[6] = new Dragon(gp);
        gp.map1.monster[6].setEntityGraphic(new EntityGraphic(gp.map1.monster[6]));
        gp.map1.monster[6].worldX = gp.tileSize * 25;
        gp.map1.monster[6].worldY = gp.tileSize * 24;

        gp.map1.monster[7] = new Dragon(gp);
        gp.map1.monster[7].setEntityGraphic(new EntityGraphic(gp.map1.monster[7]));
        gp.map1.monster[7].worldX = gp.tileSize * 42;
        gp.map1.monster[7].worldY = gp.tileSize * 19;

        gp.map1.monster[8] = new Dragon(gp);
        gp.map1.monster[8].setEntityGraphic(new EntityGraphic(gp.map1.monster[8]));
        gp.map1.monster[8].worldX = gp.tileSize * 35;
        gp.map1.monster[8].worldY = gp.tileSize * 48;

        gp.map1.monster[9] = new Dragon(gp);
        gp.map1.monster[9].setEntityGraphic(new EntityGraphic(gp.map1.monster[9]));
        gp.map1.monster[9].worldX = gp.tileSize * 28;
        gp.map1.monster[9].worldY = gp.tileSize * 42;

        // map 2
        gp.map2 = new Map(gp);

        gp.map2.setMapGraphic(new MapGraphic(gp.map2));
        gp.map2.setMapLoader(new MapLoader(gp.map2));
        gp.map2.mapLoader.loadMap("/res/maps/world03.txt");
        // object
        // npc
        // monster
        gp.map2.monster[0] = new GreenSlime(gp);
        gp.map2.monster[0].setEntityGraphic(new EntityGraphic(gp.map2.monster[0]));
        gp.map2.monster[0].worldX = gp.tileSize * 6;
        gp.map2.monster[0].worldY = gp.tileSize * 12;

        gp.map2.monster[1] = new GreenSlime(gp);
        gp.map2.monster[1].setEntityGraphic(new EntityGraphic(gp.map2.monster[1]));
        gp.map2.monster[1].worldX = gp.tileSize * 2;
        gp.map2.monster[1].worldY = gp.tileSize * 32;

        gp.map2.monster[2] = new GreenSlime(gp);
        gp.map2.monster[2].setEntityGraphic(new EntityGraphic(gp.map2.monster[2]));
        gp.map2.monster[2].worldX = gp.tileSize * 5;
        gp.map2.monster[2].worldY = gp.tileSize * 39;

        gp.map2.monster[3] = new GreenSlime(gp);
        gp.map2.monster[3].setEntityGraphic(new EntityGraphic(gp.map2.monster[3]));
        gp.map2.monster[3].worldX = gp.tileSize * 2;
        gp.map2.monster[3].worldY = gp.tileSize * 47;

        gp.map2.monster[4] = new GreenSlime(gp);
        gp.map2.monster[4].setEntityGraphic(new EntityGraphic(gp.map2.monster[4]));
        gp.map2.monster[4].worldX = gp.tileSize * 41;
        gp.map2.monster[4].worldY = gp.tileSize * 22;

        gp.map2.monster[5] = new Dragon(gp);
        gp.map2.monster[5].setEntityGraphic(new EntityGraphic(gp.map2.monster[5]));
        gp.map2.monster[5].worldX = gp.tileSize * 18;
        gp.map2.monster[5].worldY = gp.tileSize * 12;

        gp.map2.monster[6] = new Dragon(gp);
        gp.map2.monster[6].setEntityGraphic(new EntityGraphic(gp.map2.monster[6]));
        gp.map2.monster[6].worldX = gp.tileSize * 18;
        gp.map2.monster[6].worldY = gp.tileSize * 22;

        gp.map2.monster[7] = new Dragon(gp);
        gp.map2.monster[7].setEntityGraphic(new EntityGraphic(gp.map2.monster[7]));
        gp.map2.monster[7].worldX = gp.tileSize * 8;
        gp.map2.monster[7].worldY = gp.tileSize * 48;

        gp.map2.monster[8] = new Dragon(gp);
        gp.map2.monster[8].setEntityGraphic(new EntityGraphic(gp.map2.monster[8]));
        gp.map2.monster[8].worldX = gp.tileSize * 41;
        gp.map2.monster[8].worldY = gp.tileSize * 5;

        gp.map2.monster[9] = new Dragon(gp);
        gp.map2.monster[9].setEntityGraphic(new EntityGraphic(gp.map2.monster[9]));
        gp.map2.monster[9].worldX = gp.tileSize * 42;
        gp.map2.monster[9].worldY = gp.tileSize * 31;

        // map 3
        gp.map3 = new Map(gp);

        gp.map3.setMapGraphic(new MapGraphic(gp.map3));
        gp.map3.setMapLoader(new MapLoader(gp.map3));
        gp.map3.mapLoader.loadMap("/res/maps/world04.txt");
        // object
        // npc
        // monster
        gp.map3.monster[0] = new GreenSlime(gp);
        gp.map3.monster[0].setEntityGraphic(new EntityGraphic(gp.map3.monster[0]));
        gp.map3.monster[0].worldX = gp.tileSize * 23;
        gp.map3.monster[0].worldY = gp.tileSize * 12;

        gp.map3.monster[1] = new GreenSlime(gp);
        gp.map3.monster[1].setEntityGraphic(new EntityGraphic(gp.map3.monster[1]));
        gp.map3.monster[1].worldX = gp.tileSize * 15;
        gp.map3.monster[1].worldY = gp.tileSize * 30;

        gp.map3.monster[2] = new GreenSlime(gp);
        gp.map3.monster[2].setEntityGraphic(new EntityGraphic(gp.map3.monster[2]));
        gp.map3.monster[2].worldX = gp.tileSize * 9;
        gp.map3.monster[2].worldY = gp.tileSize * 27;

        gp.map3.monster[3] = new GreenSlime(gp);
        gp.map3.monster[3].setEntityGraphic(new EntityGraphic(gp.map3.monster[3]));
        gp.map3.monster[3].worldX = gp.tileSize * 25;
        gp.map3.monster[3].worldY = gp.tileSize * 47;

        gp.map3.monster[4] = new GreenSlime(gp);
        gp.map3.monster[4].setEntityGraphic(new EntityGraphic(gp.map3.monster[4]));
        gp.map3.monster[4].worldX = gp.tileSize * 35;
        gp.map3.monster[4].worldY = gp.tileSize * 41;

        gp.map3.monster[5] = new Dragon(gp);
        gp.map3.monster[5].setEntityGraphic(new EntityGraphic(gp.map3.monster[5]));
        gp.map3.monster[5].worldX = gp.tileSize * 29;
        gp.map3.monster[5].worldY = gp.tileSize * 12;

        gp.map3.monster[6] = new Dragon(gp);
        gp.map3.monster[6].setEntityGraphic(new EntityGraphic(gp.map3.monster[6]));
        gp.map3.monster[6].worldX = gp.tileSize * 6;
        gp.map3.monster[6].worldY = gp.tileSize * 31;

        gp.map3.monster[7] = new Dragon(gp);
        gp.map3.monster[7].setEntityGraphic(new EntityGraphic(gp.map3.monster[7]));
        gp.map3.monster[7].worldX = gp.tileSize * 28;
        gp.map3.monster[7].worldY = gp.tileSize * 42;

        gp.map3.monster[8] = new Dragon(gp);
        gp.map3.monster[8].setEntityGraphic(new EntityGraphic(gp.map3.monster[8]));
        gp.map3.monster[8].worldX = gp.tileSize * 32;
        gp.map3.monster[8].worldY = gp.tileSize * 47;

        gp.map3.monster[9] = new Dragon(gp);
        gp.map3.monster[9].setEntityGraphic(new EntityGraphic(gp.map3.monster[9]));
        gp.map3.monster[9].worldX = gp.tileSize * 40;
        gp.map3.monster[9].worldY = gp.tileSize * 13;

        // DEFAULT POSITION
        // map 1
        gp.map1.npc[0].setDefaultPosition();

        gp.map1.monster[0].setDefaultPosition();
        gp.map1.monster[1].setDefaultPosition();
        gp.map1.monster[2].setDefaultPosition();
        gp.map1.monster[3].setDefaultPosition();
        gp.map1.monster[4].setDefaultPosition();
        gp.map1.monster[5].setDefaultPosition();
        gp.map1.monster[6].setDefaultPosition();
        gp.map1.monster[7].setDefaultPosition();
        gp.map1.monster[8].setDefaultPosition();
        gp.map1.monster[9].setDefaultPosition();
        // map 2
        gp.map2.monster[0].setDefaultPosition();
        gp.map2.monster[1].setDefaultPosition();
        gp.map2.monster[2].setDefaultPosition();
        gp.map2.monster[3].setDefaultPosition();
        gp.map2.monster[4].setDefaultPosition();
        gp.map2.monster[5].setDefaultPosition();
        gp.map2.monster[6].setDefaultPosition();
        gp.map2.monster[7].setDefaultPosition();
        gp.map2.monster[8].setDefaultPosition();
        gp.map2.monster[9].setDefaultPosition();
        // map 3
        gp.map3.monster[0].setDefaultPosition();
        gp.map3.monster[1].setDefaultPosition();
        gp.map3.monster[2].setDefaultPosition();
        gp.map3.monster[3].setDefaultPosition();
        gp.map3.monster[4].setDefaultPosition();
        gp.map3.monster[5].setDefaultPosition();
        gp.map3.monster[6].setDefaultPosition();
        gp.map3.monster[7].setDefaultPosition();
        gp.map3.monster[8].setDefaultPosition();
        gp.map3.monster[9].setDefaultPosition();

        // STARTING MAP
        gp.currentMap = gp.map1;
    }

    public void setPlayer() {
        gp.player = new Player(gp);
        gp.player.setEntityGraphic(new EntityGraphic(gp.player));

        // position when game starts
        gp.player.worldX = gp.tileSize * 2;
        gp.player.worldY = gp.tileSize * 1;
    }

    public void setObject() {

        // map 1
        if (gp.currentMap == gp.map1) {
            gp.obj = gp.map1.obj;
        }

        // map 2
        else if (gp.currentMap == gp.map2) {
            gp.obj = gp.map2.obj;
        }

        // map 3
        else if (gp.currentMap == gp.map3) {
            gp.obj = gp.map3.obj;
        }
    }

    public void setNPC() {

        // map 1
        if (gp.currentMap == gp.map1) {
            gp.npc = gp.map1.npc;
        }

        // map 2
        else if (gp.currentMap == gp.map2) {
            gp.npc = gp.map2.npc;
        }

        // map 3
        else if (gp.currentMap == gp.map3) {
            gp.npc = gp.map3.npc;
        }
    }

    public void setMonster() {

        // map 1
        if (gp.currentMap == gp.map1) {
            gp.monster = gp.map1.monster;
        }

        // map 2
        else if (gp.currentMap == gp.map2) {
            gp.monster = gp.map2.monster;
        }

        // map 3
        else if (gp.currentMap == gp.map3) {
            gp.monster = gp.map3.monster;
        }
    }
}
