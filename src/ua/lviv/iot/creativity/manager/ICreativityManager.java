package ua.lviv.iot.creativity.manager;

import java.util.List;
import ua.lviv.iot.creativity.model.CreativityGoods;

public interface ICreativityManager {
	
	public void sortByPrice(List<CreativityGoods> creativityGoods, boolean reverse);

	public void sortByName(List<CreativityGoods> creativityGoods, boolean reverse);

}
