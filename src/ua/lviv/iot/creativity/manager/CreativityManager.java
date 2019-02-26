package ua.lviv.iot.creativity.manager;

import ua.lviv.iot.creativity.model.CreativityGoods;
import ua.lviv.iot.creativity.model.Type;
import ua.lviv.iot.creativity.manager.ICreativityManager;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class CreativityManager implements ICreativityManager {
	private List<CreativityGoods> creativityGoods;

	public CreativityManager() {
		
	}
	
	public CreativityManager(List<CreativityGoods> creativityGoods) {
		this.creativityGoods=creativityGoods;
	}
	
	public List<CreativityGoods> getCreativityGoods(){
		return creativityGoods;
	}
	
	public void setCreativityGoods(List<CreativityGoods> creativityGoods) {
		this.creativityGoods=creativityGoods;
	}
	
	@Override
	public void sortByPrice(List<CreativityGoods> creativityGoods, boolean reverse) {
		if(reverse) {
			Collections.sort(creativityGoods, Comparator.comparing(CreativityGoods::getPrice).reversed());
		}else {
			Collections.sort(creativityGoods, Comparator.comparing(CreativityGoods::getPrice));
		}
	}
	
	@Override
	public void sortByName(List<CreativityGoods> creativityGoods, boolean reverse) {
		if(reverse) {
			Collections.sort(creativityGoods, Comparator.comparing(CreativityGoods::getName).reversed());
		}else {
			Collections.sort(creativityGoods, Comparator.comparing(CreativityGoods::getName));
		}
	}
	
	public List<CreativityGoods> findByType(Type type){
		List<CreativityGoods> creativityGoodsList = creativityGoods;
		List<CreativityGoods> findCreativityGoodsList = creativityGoodsList.stream().filter(creativityGood -> creativityGood.getType() == type).collect(Collectors.toList());
		return findCreativityGoodsList;
	}
	
	
}
