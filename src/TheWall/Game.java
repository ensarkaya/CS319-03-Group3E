package TheWall;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
Creator: Erdem Ege Marasli
 */
public class Game {

    private GameBoard board;
    private Walls walls;
    private Render render;
    private Timer renderListener;
    private Levels levels;
    private Map map;
    private Map playerMap;
    public Game(int level){

        walls = new Walls();

        levels = new Levels();
        map = levels.getLevels()[level];
        playerMap = map;/*
        for(int i = 0; i < playerMap.getHorizontalRectangleLocations().length; i++){
            if(playerMap.getHorizontalRectangleLocations()[i] != 2)
                playerMap.getHorizontalRectangleLocations()[i] = 0;
        }
        for(int i = 0; i < playerMap.getVerticalRectangleLocations().length; i++){
            if(playerMap.getVerticalRectangleLocations()[i] != 2)
                playerMap.getVerticalRectangleLocations()[i] = 0;
        }
        for(int i = 0; i < playerMap.getEdgeLocations().length; i++){
            playerMap.getEdgeLocations()[i] = 0;
        }*/
        board = new GameBoard(map);

        render = new Render();
        renderListener = new Timer(25,new RenderListener());
        renderListener.start();
        for(int i = 0; i < board.getHorizontalRectangles().length; i++){
            System.out.println(board.getHorizontalRectangles()[i].getInfo());
        }
        System.out.println("--------------");
        for(int i = 0; i < map.getHorizontalRectangleLocations().length; i++){
            System.out.println(map.getHorizontalRectangleLocations()[i]);
        }
    }
    public GameBoard getGameBoard(){
        return board;
    }
    public Wall[] getWalls()
    {
        return walls.getWalls();
    }

    public Map getPlayerMap() {
        return playerMap;
    }

    public Render getRender() {
        return render;
    }
    public boolean checkWinCondition(){
        return getGameBoard().isGameFinished();
    }

    private class RenderListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            render.update();
            if(checkWinCondition() == true){
                JOptionPane.showMessageDialog(null, "You Passed The Level " , "You Passed The Level", JOptionPane.INFORMATION_MESSAGE);
                renderListener.stop();
            }
        }
    }

}
