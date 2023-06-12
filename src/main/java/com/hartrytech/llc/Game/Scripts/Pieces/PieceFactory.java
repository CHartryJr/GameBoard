package com.hartrytech.llc.Game.Scripts.Pieces;

class PieceFactory 
{
    private GamePiece piece = null;
    private static boolean first = true;
    
     GamePiece makeGamePiece(String game,String gamePiece)
    {
        if(!first)
         first = false;
        else
         throw new InstantiationError("can not make More than one instance");
        
         switch (game.toLowerCase()) 
         {
            case "chess":
                break;
            case "checkers":
                break;
            case "battlship":
                break;
         }
        return piece;
    }
}
