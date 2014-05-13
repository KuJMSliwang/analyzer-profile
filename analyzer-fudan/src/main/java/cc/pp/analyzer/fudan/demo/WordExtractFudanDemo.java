package cc.pp.analyzer.fudan.demo;

import cc.pp.analyzer.fudan.core.WordExtractFudan;

public class WordExtractFudanDemo {

	public static void main(String[] args) {

		//第一个参数是字符串 ，第三个参数是需要抽取多少个关键词
		//		long time1 = System.currentTimeMillis();
		WordExtractFudan keyword = new WordExtractFudan();
		//		long time2 = System.currentTimeMillis();
		//		System.out.println(mykeyword.extractKeyword("朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度的工作，"
		//				+ "完成了发射卫星的准备。朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫星的准备。"
		//				+ "朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫星的准备。朝鲜科技工作者深入进行"
		//				+ "分析今年4月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫星的准备。朝鲜科技工作者深入进行分析今年4月发射卫星时"
		//				+ "出现的问题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫星的准备。朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和"
		//				+ "运载火箭安全性和精确度的工作，完成了发射卫星的准备。朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度"
		//				+ "的工作，完成了发射卫星的准备。朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫"
		//				+ "星的准备。朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫星的准备。朝鲜科技工"
		//				+ "作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫星的准备。朝鲜科技工作者深入进行分析今年4"
		//				+ "月发射卫星时出现的问题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫星的准备。朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问"
		//				+ "题、改进卫星和运载火箭安全性和精确度的工作，完成了发射卫星的准备。朝鲜科技工作者深入进行分析今年4月发射卫星时出现的问题、改进卫星和运载火箭" + "安全性和精确度的工作，完成了发射卫星的准备。",
		//				"地名 省略词 机构名 事件名 名词 品牌名 人名 品牌 实体名", 50));
		//		long time3 = System.currentTimeMillis();
		//		System.out.println(mykeyword.extractKeyword("中国计算机学会合肥分部（简称合肥分部）将于上午在合肥工业大学（屯溪路校区学术报告中心一楼大报告厅）"
		//				+ "成立，邀请您届时参加成立大会和首次CCF分部会员学术活动，大会免费提供会后简餐。为加强CCF对会员的服务，方便会员就近参加CCF活动，促进会员间的交"
		//				+ "流和合作，CCF创建以城市为单位的CCF会员活动中心，称作CCF[城市名]会员活动中心，简称CCF[城市名]分部。", "", 20));
		//		long time4 = System.currentTimeMillis();
		//		System.out.println(time2 - time1);
		//		System.out.println(time3 - time2);
		//		System.out.println(time4 - time3);
		System.out.println(keyword.extractMap("我在淘宝网的聚划算上买了一件衣服。", "", 20));
		System.out.println(keyword.extractList("我在淘宝网的聚划算上买了一件衣服。", "", 20));

		System.out.println(keyword.extractList("这是需要分词的语句，淘宝特卖，中华名国", "", 20));

	}

}