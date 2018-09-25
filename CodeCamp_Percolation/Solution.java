import java.util.*;
// public class Percolation {
//    public Percolation(int n)                // create n-by-n grid, with all sites blocked
//    public    void open(int row, int col)    // open site (row, col) if it is not open already
//    public boolean isOpen(int row, int col)  // is site (row, col) open?
//    public boolean isFull(int row, int col)  // is site (row, col) full?
//    public     int numberOfOpenSites()       // number of open sites
//    public boolean percolates()              // does the system percolate?
// }


// You can implement the above API to solve the problem
class Solution{
	int n;
	int grid[];
	int top;
	int bottom;
	public Solution(int size)
	{
		n = (size*size)+2;
		grid = new int[n];
		top = 0;
		bottom = n-1;
	}
	public static root()
	{

	}
	public static find()
	{

	}
	public static union()
	{

	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int size = ip.nextInt();
		Solution per = new Solution(size);
		while(ip.hasNextLine())
		{
			int p = i.hasNext();
			int q = ip.hasNext();
			System.out.println(p+q);
		}
		System.out.println(per.top);
		System.out.println(per.bottom);
		System.out.println(Arrays.toString(per.grid));




	}
}