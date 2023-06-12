protected class PieceFactory 
{
    private GamePeice piece = null;
    private static boolean first = true;
    public GamePiece makeGamePiece(String game,String piece)
    {
        if(!first)
         first = false;
        else
         throw new InstantiationError("can not make More than one instance");
        currentLayout = gameLayout;

    }
}
