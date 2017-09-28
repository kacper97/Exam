// setting the left branch to  be a yes answer and the right to be a no answer
public class Node {
	//private fields
	private int rules;
	private Node no;
	private Node yes;
	// node method takes in rules, sets rules and lets no and yes = null
	public Node(int rules) {
		// TODO Auto-generated constructor stub
		this.setRules(rules);
		no = null;// starting the tree is as null (RIGHT)
		yes= null;// starting the tree as null (LEFT)
	}

	public void setYes(Node yes){
		// TODO Auto-generated method stub
		this.yes=yes;
	}

	public void setNo(Node no) {
		// TODO Auto-generated method stub
		this.no =no;
	}
	
	// gets the rules
	public int getRules() {
		return rules;
	}
	// this was automatically added
	public void setRules(int rules) {
		this.rules = rules;
	}

}
