package com.chess.engine.Function.piece;
import java.util.Collection;

import com.chess.engine.Alliance;
import com.chess.engine.Function.board.Board;
import com.chess.engine.Function.board.Move;


public abstract class Piece {
  protected final int piecePosition;
  protected final Alliance pieceAlliance;

  Piece(final int piecePosition, final Alliance pieceAlliance){
    this.piecePosition = piecePosition;
    this.pieceAlliance = pieceAlliance;
  }

  public Alliance getPieceAlliance(){
    return this.pieceAlliance;
  }

  public abstract Collection<Move> calculatedLegalMoves(final Board board);

}
