package com.hibernate.Third;
import javax.persistence.*;

@Entity
public class Tree {

	@Id
	private int t_Id;
	private String Tree_name;
	
	@OneToOne
	@JoinColumn
	private TreeBenefits treeBenfits;
	
	Tree(){
		super();
	}

	public int getT_Id() {
		return t_Id;
	}

	public void setT_Id(int t_Id) {
		this.t_Id = t_Id;
	}

	public String getTree_name() {
		return Tree_name;
	}

	public void setTree_name(String tree_name) {
		Tree_name = tree_name;
	}

	public TreeBenefits getTreeBenfits() {
		return treeBenfits;
	}

	public void setTreeBenfits(TreeBenefits treeBenfits) {
		this.treeBenfits = treeBenfits;
	}

	

	
}
