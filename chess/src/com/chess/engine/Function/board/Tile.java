package com.chess.engine.Function.board;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.chess.engine.Function.piece.Piece;

public abstract class Tile {
  protected final int tileCoordinate;

  private static final Map<Integer, EmptyTile> EMPTY_TILE_CACHE = createAllPossibleEmptyTile();

  private static Map<Integer,EmptyTile> createAllPossibleEmptyTile(){

    final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();

    for (int i = 0; i < BoardUtils.NUM_TILES; i++){
      emptyTileMap.put(i, new EmptyTile(i));
    }

    return Collections.unmodifiableMap(emptyTileMap);
  }
  public static Tile creatTile(final int tileCoordinate, final Piece piece){
    return piece != null ? new OccupiedTile(tileCoordinate, piece) : EMPTY_TILE_CACHE.get(tileCoordinate);
  }
  private Tile(final int tileCoordinate){
    this.tileCoordinate = tileCoordinate;
  }

  public abstract boolean isTileOccupied();

  public abstract Piece getPiece();

  public static final class EmptyTile extends Tile{

    private EmptyTile(int coordinate){
      super(coordinate);
    }

    @Override
    public Piece getPiece(){
      return null;
    }

    @Override
    public boolean isTileOccupied(){
      return false;
    }

  }

  public static final class OccupiedTile extends Tile{
    private Piece pieceOnTile;

    private OccupiedTile(int coordinate, Piece pieceOnTile){
      super(coordinate);
      this.pieceOnTile = pieceOnTile;
    }

    @Override
    public boolean isTileOccupied(){
      return true;
    }

    @Override
    public Piece getPiece(){
      return this.pieceOnTile;
    }
  }
}
