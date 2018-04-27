package me.kamili.rachid.walmartapp.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseProducts{

	@SerializedName("nextPage")
	private String nextPage;

	@SerializedName("format")
	private String format;

	@SerializedName("items")
	private List<Product> items;

	public void setNextPage(String nextPage){
		this.nextPage = nextPage;
	}

	public String getNextPage(){
		return nextPage;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

	public void setItems(List<Product> items){
		this.items = items;
	}

	public List<Product> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"ResponseProducts{" + 
			"nextPage = '" + nextPage + '\'' + 
			",format = '" + format + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}