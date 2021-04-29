
public class HanoiTower {
	private Peg peg1;
	private Peg peg2;
	private Peg peg3;
	private int numDiscs;
	
	public HanoiTower(int num)
	{
		peg1 = new Peg(1, num);
		peg2 = new Peg(2, num);
		peg3 = new Peg(3,num);
		numDiscs = num;
		for(int x = num; x > 0; x--)
		{
			peg1.addDisc(x);
		}
	}
	public void solveTower()
	{
		moveTower(peg1, peg3, peg2, numDiscs);
	}

	private void moveTower(Peg startPeg, Peg endPeg, Peg extraPeg, int numtoMove)
	{
		if(numtoMove > 0) {
			moveTower(startPeg, extraPeg, endPeg, numtoMove - 1 );
			startPeg.moveTopDisc(endPeg);
			moveTower(extraPeg, endPeg, startPeg, numtoMove - 1 );
		}

		
	}
	public static void main(String[] args) {

		HanoiTower ht = new HanoiTower(3);
		ht.solveTower();

	}

}
