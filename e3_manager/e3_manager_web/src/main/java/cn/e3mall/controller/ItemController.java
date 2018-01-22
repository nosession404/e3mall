package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.serivce.ItemService;
@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@ResponseBody
	@RequestMapping("/item/{itemId}")
	public TbItem findProductById(@PathVariable Long itemId){
		TbItem tbItem=itemService.findProductById(itemId);
		return tbItem;
	}
}
