public class DecisionTree {
	public static Node root;
	 // creates a new tree that takes in rules parameter
	public DecisionTree(int rules)
	{
		root = new Node(rules);
	}
	// adds new parent and child roots the decision is either left or right
	public void add(Node parent, Node child, String decision){
		if ( decision== "left")
		{
			parent.setYes(child);
		}
		else
		{
			parent.setNo(child);
		}
	}
}
