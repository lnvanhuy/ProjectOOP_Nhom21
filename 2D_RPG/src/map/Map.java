package map;

import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;
import graphic.MapGraphic;
import main.EventRect;
import main.GamePanel;

public class Map {

    public GamePanel gp;

    public MapGraphic mapGraphic;
    public MapLoader mapLoader;

    public Tile tile[];
    public EventRect eventRect[][];
    public Entity obj[];
    public Entity npc[];
    public Entity monster[];

    public int data[][];

    // CONSTRUCTOR
    public Map(GamePanel gp) {

        this.gp = gp;

        tile = new Tile[8];
        obj = new Entity[10];
        npc = new Entity[10];
        monster = new Entity[10];
        data = new int[gp.maxWorldCol][gp.maxWorldRow];

        // tile
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/grass.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/wall.png"));
            tile[1].collision = true;

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water.png"));
            tile[2].collision = true;

            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/earth.png"));

            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/tree.png"));
            tile[4].collision = true;

            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/sand.png"));

            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/portal.png"));

            tile[7] = new Tile();
            tile[7].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/end_game_portal.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }

        // event rectangle
        eventRect = new EventRect[gp.maxWorldCol][gp.maxWorldRow];

        for (int col = 0; col < gp.maxWorldCol; col++) {

            for (int row = 0; row < gp.maxWorldRow; row++) {

                eventRect[col][row] = new EventRect();
                eventRect[col][row].x = 20;
                eventRect[col][row].y = 20;
                eventRect[col][row].width = 8;
                eventRect[col][row].height = 8;
                eventRect[col][row].eventRectDefaultX = eventRect[col][row].x;
                eventRect[col][row].eventRectDefaultY = eventRect[col][row].y;
            }
        }
    }

    public void setMapGraphic(MapGraphic mapGraphic) {
        this.mapGraphic = mapGraphic;
    }

    public void setMapLoader(MapLoader mapLoader) {
        this.mapLoader = mapLoader;
    }
}
