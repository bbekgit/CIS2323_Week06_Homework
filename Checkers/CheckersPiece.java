package Checkers;

public class CheckersPiece {
	
	// Class Attributes
	// public static enum Color {RED,BLACK};
	private static int numberOPieces = 0;
	
	// Instance Attributes
	private Color color;
	private int id;
	
	public Piece(){
		id=numberOPieces;
		numberOPieces++;
	}
	
	public void set(Color c){
		color = c;
	}
	
	public Color getColor(){
		return color;
	}
}