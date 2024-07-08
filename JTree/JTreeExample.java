import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample extends JFrame {

	public JTree tree;
	
	    static DefaultMutableTreeNode html = new DefaultMutableTreeNode("html");
		static DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
		static DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");
		static DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
		static DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
		static DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
		static DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("h1");
		static DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");
		static DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("li");
		static DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("li");
		static DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");
		static DefaultMutableTreeNode depth = new DefaultMutableTreeNode("3");

	public JTreeExample() {
		html.add(head);
		html.add(body);
		head.add(meta);
		head.add(title);
		body.add(ul);
		body.add(h1);
		body.add(h2);
		ul.add(li1);
		ul.add(li2);
		h2.add(a);
	
		tree = new JTree(html);
		add(tree);
		this.setTitle("JTree Example");
		this.setSize(300,300);
		this.setVisible(true);
	}
	public static void getRoot()
	{	
		System.out.print("\n[4.1] Root node:");
		System.out.println(" ["+html+"]");
		getParentNode();
	}
	public static void getParentNode(){
		System.out.print("\n[4.2] Parent nodes:");
		System.out.println(" ["+html +", "+ head +", "+ body +", "+ ul +", & "+ h2+"]");
		getSiblings();
	}
	public static  void getSiblings()
	{
		System.out.print("\n[4.3] Siblings:");
		System.out.println(" ["+ head +" & "+ body +"]");
		getLevel();	
	}
	public static void getLevel(){
		System.out.print("\n[4.4] One-level subtrees:");
		System.out.println(" ["+html+" - "+meta+"/"+title+", "+body+" - "+ul+"/"+h1+"/"+h2+", "+ul+"-"+li1+"/"+li2+", & "+h2+" - "+a+"]");
		getNodesPerLevel();
	}
	public static  void getNodesPerLevel()
	{
		System.out.println("\n[4.5] Nodes per level:");
		System.out.println("Level 0 - " + html);
		System.out.println("Level 1 - " + head + " & " + body );
		System.out.println("Level 2 - " + meta + ", " + title +", "+ ul + ", " + h1 + ", & " + h2 );
		System.out.println("Level 3 - " + li1 + ", " + li2 + ", & " + a );	
		getDepth();
			
	}
	public static void getDepth(){
		System.out.print("\n[4.6] Depth:");
		System.out.println(" ["+depth+"]");
		getDegree();
	}
	public static  void getDegree()
	{
		System.out.println("\n[4.7] Degree of each one-level subtree:");
		System.out.println("2 for " + html);
		System.out.println("2 for " + head);
		System.out.println("3 for " + body);
		System.out.println("2 for " + ul);
		System.out.println("1 for " + h2);
		getList();
	}
	public static void getList(){
		System.out.println("\n[4.8] List of nodes based on breadth-first,  Preorder, and Postorder:");
		System.out.println("Breadth first - "+"["+html+", "+head+", "+body+", "+meta+", "+title+", "+ul+", "+h1+", "+h2+", "+li1+", "+li2+", & "+ a+"]");
		System.out.println("Preorder - "+"["+html+", "+head+", "+meta+", "+title+", "+body+", "+ul+", "+li1+", "+li2+", "+h1+", "+ h2+", & "+a+"]");
		System.out.println("Postorder - "+"["+meta+", "+title+", "+head+", "+li1+", "+li2+", "+ul+", "+h1+", "+a+", "+ h2+", "+body+", & "+html+"]");
	} 
	
	public static void main(String[] args) {
		new JTreeExample();
		getRoot();
		
		
		
		
		
		
		
	}
}



