package com.hibernate.Third;
import javax.persistence.*;

@Entity
public class TreeBenefits {
	
	@Id
	private int flower_Id;
	private String flower;
	private String benefits;
	
	@OneToOne
	private Tree tree;
	
	TreeBenefits(){
		super();
	}

	public int getFlower_Id() {
		return flower_Id;
	}

	public void setFlower_Id(int flower_Id) {
		this.flower_Id = flower_Id;
	}
	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public Tree getTree() {
		return tree;
	}

	public void setTree(Tree tree) {
		this.tree = tree;
	}

	
}
