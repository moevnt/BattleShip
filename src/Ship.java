public class Ship {

	private int size;
	private int hits;
	private int positionX;
	private int positionY;
	private String orientation;
	private String type;

	public Ship(){
	}

	public Ship(int size, int positionX, int positionY, String type){
		this.hits=0;
		this.positionX=positionX;
		this.positionY=positionY;
		this.size=size;
		this.orientation="NORTH";
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getHits() {
		return hits;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public int Size() {
		return size;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
}
