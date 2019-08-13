/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Test1.java 
 * @Prject: huangyoujie_day09
 * @Package: huangyoujie_day09 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月13日 上午8:16:07 
 * @version: V1.0   
 */
package huangyoujie_day09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

import java.util.Set;

import org.junit.Test;

/** 
 * @ClassName: Test1 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月13日 上午8:16:07  
 */


//1、自定义一个结构，利用hashMap 统计字符出现的次数。
public class Test1 {

//2、至少使用两种遍历方式打印每个字母出现的次数。
//3、统计每个单词出现的次数。然后遍历打印。
	@Test
	public void name() {
		String s = "Because TreeNodes are about twice the size of regular nodes, we use them only when bins contain enough nodes to warrant use (see TREEIFY_THRESHOLD). And when they become too small (due toremoval or resizing) they are converted back to plain bins";

		HashMap<Object, Object> map = new HashMap<Object, Object>();
		
		map.put("st", s);
		Set<Object> set = map.keySet();
		for (Object object : set) {
			System.out.println(object);
			
		}
		Set<Entry<Object, Object>> entrySet = map.entrySet();
//		forEach()
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
		}
	}
		@Test
		 public void name2() {
			String s = "Because TreeNodes are about twice the size of regular nodes, we use them only when bins contain enough nodes to warrant use (see TREEIFY_THRESHOLD). And when they become too small (due toremoval or resizing) they are converted back to plain bins";
			HashMap<Object, Object> map = new HashMap<Object, Object>();
			
			map.put("st", s);
			
			
			Set<Entry<Object, Object>> entrySet = map.entrySet();
			
			for (Entry<Object, Object> entry : entrySet) {
//4、打印出现次数超过3次的单词（大小写不敏感）。
				if(3<=map.size()) {
				System.out.println(entry);
				}
			}
		}
			
		
		

}
