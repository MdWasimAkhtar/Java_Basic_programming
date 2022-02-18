package com.hibernate.Third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mappTreeBenefits {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");  
		SessionFactory sesfactory = cfg.buildSessionFactory();
		
        Tree tr1 = new Tree();
        tr1.setT_Id(1);
        tr1.setTree_name("Sun Flower");
 // not here       tr1.setTreeBenfits();
        
        TreeBenefits tb1 = new TreeBenefits();
        tb1.setFlower_Id(11);
        tb1.setFlower("sunFlower(Helianthus annuus)");
        tb1.setBenefits("edible oil & edible fruits");
        tb1.setTree(tr1);
        tr1.setTreeBenfits(tb1);
        
        //---------------2nd ----
        
        Tree tr2 = new Tree();
        tr2.setT_Id(2);
        tr2.setTree_name("Lavender");
 // not here       tr1.setTreeBenfits();
        
        TreeBenefits tb2 = new TreeBenefits();
        tb2.setFlower_Id(12);
        tb2.setFlower("lavender(Lavandula)");
        tb2.setBenefits("medicine herbs and aeroma");
        tb2.setTree(tr2);
        tr2.setTreeBenfits(tb2);
        
        
        
        
        
        
        
        Session session = sesfactory.openSession();
        Transaction trxx = session.beginTransaction();
//        session.save(tr1);
//        session.save(tb1);
//        
//        session.save(tr2);
//        session.save(tb2);
        
         Tree tree1=(Tree)session.get(Tree.class, 1);
         System.out.println(tree1.getTree_name());
         System.out.println(tree1.getTreeBenfits().getBenefits());
        
        trxx.commit();
        session.close();
        sesfactory.close();
		
		
	}

}
