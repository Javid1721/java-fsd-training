package javanewsample;

class Node
{
	int key;
	Node left,right;
	public Node(int item)
	{
		key=item;
		left=right=null;
	}

}

public class TreeSample {

	Node root;
	
	TreeSample(int key)
	{
		root = new Node(key);
	}
	
	TreeSample()
	{
		root = null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSample tr = new TreeSample();
		
		tr.root = new Node(10);
		
		tr.root.left = new Node(5);
		tr.root.right = new Node(12);
		
		
		tr.root.left.left = new Node(2);
		
		
	}

}
