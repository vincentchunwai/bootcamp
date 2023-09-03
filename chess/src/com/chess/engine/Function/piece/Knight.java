package com.chess.engine.Function.piece;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.chess.engine.Alliance;
import com.chess.engine.Function.board.Board;
import com.chess.engine.Function.board.BoardUtils;
import com.chess.engine.Function.board.Move;
import com.chess.engine.Function.board.Tile;
import com.chess.engine.Function.board.Move.AttackMove;
import com.chess.engine.Function.board.Move.MajorMove;

public class Knight extends Piece{

  private final static int[] CANDIDATE_MOVE_COORDINATES = {-17, -15, -10, -6, 6, 10, 15, 17};

  Knight(int piecePosition, Alliance pieceAlliance) {
    super(piecePosition, pieceAlliance);
  }
  //write

  @Override
  public Collection<Move> calculatedLegalMoves(final Board board) {

    final List<Move> legalMoves = new ArrayList<>();

    for (final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATES){
      final int candidateDestinationCoordinate;
      candidateDestinationCoordinate = this.piecePosition + currentCandidateOffset;
      if(BoardUtils.isValidCoordinate(candidateDestinationCoordinate)){

        if (isFirstColumnExclusion(this.piecePosition, currentCandidateOffset) ||
              isSecondColumnExclusion(candidateDestinationCoordinate, currentCandidateOffset)||
                isSeventhColumnExclusion(candidateDestinationCoordinate, currentCandidateOffset)||
                  isEighthColumnExclusion(candidateDestinationCoordinate, currentCandidateOffset)){
          continue;
        }

        final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);

        if(!candidateDestinationTile.isTileOccupied()){
          legalMoves.add(new MajorMove(board, this, candidateDestinationCoordinate));
        } else {

          final Piece pieceAtDestination = candidateDestinationTile.getPiece();
          final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();

          if (this.pieceAlliance != pieceAlliance){
             legalMoves.add(new AttackMove(board, this, candidateDestinationCoordinate, pieceAtDestination));
          }
        }
      }
    }
    return List.copyOf(legalMoves);
  }

  private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset){
    return BoardUtils.FIRST_COLUMN[currentPosition] && ((candidateOffset== -17) || (candidateOffset == -10)
    || (candidateOffset == 6) || (candidateOffset == 15));
  }

  private static boolean isSecondColumnExclusion(final int currentPosition, final int candidateOffset){
    return BoardUtils.SECOND_COLUMN[currentPosition] && ((candidateOffset == -10) || candidateOffset == 6);
  }

  private static boolean isSeventhColumnExclusion(final int currentPosition, final int candidateOffset){
    return BoardUtils.SEVENTH_COLUMN[currentPosition] && ((candidateOffset == -6) || (candidateOffset == 10));
  }
  
  private static boolean isEighthColumnExclusion(final int currentPosition, final int candidateOffset){
    return BoardUtils.EIGHTH_COLUMN[currentPosition] && ((candidateOffset == -15) || (candidateOffset == -6)
  || (candidateOffset == 10) || (candidateOffset == 17));
  }
}
