import java.awt.Graphics;

public class Board {

	private Main m;
	private int numRow = 8;
	private int numCol = 8;

	int xLoc = 0;
	int yLoc = 0;

	Piece[] blackPieces = new Piece[16];

	Square[][] squares = new Square[8][8];

	int[][] fillArray = {
						  {1, 0, 1 ,0, 1, 0, 1, 0},
						  {0, 1, 0, 1, 0, 1, 0, 1},
						  {1, 0, 1 ,0, 1, 0, 1, 0},
						  {0, 1, 0, 1, 0, 1, 0, 1},
						  {1, 0, 1 ,0, 1, 0, 1, 0},
						  {0, 1, 0, 1, 0, 1, 0, 1},
						  {1, 0, 1 ,0, 1, 0, 1, 0},
						  {0, 1, 0, 1, 0, 1, 0, 1}
						};

	public Board(Main m){

		for(int x=0;x < numRow;x++){
			for(int y=0;y< numCol;y++){

				squares[x][y] = new Square(xLoc + (x * 64), yLoc + (y * 64), fillArray[x][y]);
			}
		}

		placePieces();

		m.repaint();
	}

	public void placePieces(){

		squares[0][0].setPiece(new Rook(0,0, "img/white_pieces/rookW2.png", "WHITE")); //White Rook
		squares[1][0].setPiece(new Knight(0,0, "img/white_pieces/knightW2.png", "WHITE")); //White Knight
		squares[2][0].setPiece(new Bishop(0,0, "img/white_pieces/bishopW2.png", "WHITE")); //White Bishop
		squares[3][0].setPiece(new King(0,0, "img/white_pieces/kingW2.png", "WHITE")); //White King
		squares[4][0].setPiece(new Queen(0,0, "img/white_pieces/queenW2.png", "WHITE")); //White Queen
		squares[5][0].setPiece(new Bishop(0,0, "img/white_pieces/bishopW2.png", "WHITE")); //White Bishop
		squares[6][0].setPiece(new Knight(0,0, "img/white_pieces/knightW2.png", "WHITE")); //White Knight
		squares[7][0].setPiece(new Rook(0,0, "img/white_pieces/rookW2.png", "WHITE")); //White Rook
		int startX = 0;
		for(int i=0;i < 8;i++){
			squares[startX++][1].setPiece(new Pawn(0,0, "img/white_pieces/pawnW2.png", "WHITE"));
		}


		squares[0][7].setPiece(new Rook(0,0, "img/black_pieces/rookB2.png", "BLACK"));//Black Rook
		squares[1][7].setPiece(new Knight(0,0, "img/black_pieces/knightB2.png", "BLACK"));//Black Knight
		squares[2][7].setPiece(new Bishop(0,0, "img/black_pieces/bishopB2.png", "BLACK"));//Black Bishop
		squares[3][7].setPiece(new King(0,0, "img/black_pieces/kingB2.png", "BLACK"));//Black King
		squares[4][7].setPiece(new Queen(0,0, "img/black_pieces/queenB2.png", "BLACK"));//Black Queen
		squares[5][7].setPiece(new Bishop(0,0, "img/black_pieces/bishopB2.png", "BLACK"));//Black Bishop
		squares[6][7].setPiece(new Knight(0,0, "img/black_pieces/knightB2.png", "BLACK"));//Black Knight
		squares[7][7].setPiece(new Rook(0,0, "img/black_pieces/rookB2.png", "BLACK"));//Black Rook
		startX = 0;
		for(int i=0;i < 8;i++){
			squares[startX++][6].setPiece(new Pawn(0,0, "img/black_pieces/pawnB2.png", "BLACK"));

		}
	}

	public void draw(Graphics g){

		for(int x=0;x < numRow;x++){
			for(int y=0;y< numCol;y++){

				squares[x][y].draw(g);
			}
		}
	}
}