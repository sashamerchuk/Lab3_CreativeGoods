package ua.lviv.iot.main;

import java.util.ArrayList;

import java.util.List;
import ua.lviv.iot.creativity.model.CreativityGoods;

import ua.lviv.iot.creativity.model.Needle;
import ua.lviv.iot.creativity.model.Thread;
import ua.lviv.iot.creativity.model.Tissue;
import ua.lviv.iot.creativity.model.Type;
import ua.lviv.iot.creativity.manager.CreativityManager;
import ua.lviv.iot.creativity.manager.ICreativityManager;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreativityManager creativityManager= new CreativityManager();
		
		Needle neddle = new Needle("Tissue", 100 , Type.FISHING,1234);
		Tissue tissue = new Tissue("Needle",321,Type.WEAVING,23,53);
		Thread thread = new Thread("Thread",31,Type.WEAVING,100);
		
		List<CreativityGoods> creativityGoods = new ArrayList();
		creativityGoods.add(neddle);
		creativityGoods.add(tissue);
		creativityGoods.add(thread);
		
		creativityManager.sortByPrice(creativityGoods, false);
		System.out.println(creativityGoods);
		
		creativityManager.sortByName(creativityGoods, true);
		System.out.println(creativityGoods);
		
		
	}

}
