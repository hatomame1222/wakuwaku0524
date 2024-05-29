package com.example.demo.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.SampleDao;
import com.example.demo.entity.EntForm;


@Controller
public class FormController {
	//SampleDaoの用意
		private final SampleDao sampledao;

		@Autowired
		public FormController(SampleDao sampledao) {
			this.sampledao = sampledao;
		}
	@RequestMapping("/keijiban")
	public String keijiban(Form form) {
		return "form/keijiban";
	}


	@PostMapping ("/add")
	public String add(Model model,Form form){
		EntForm entform = new EntForm();
		entform.setName(form.getName());
		entform.setComment(form.getComment());
		sampledao.insertDb(entform);
		
		List<EntForm> list = sampledao.searchDb();
		model.addAttribute("dbList",list);
		model.addAttribute("title","一覧ページ");
		return "form/keijiban";
	}
		
//		@RequestMapping("/view")
//		public String view(Model model) {
//			
//			
//		return "redirect:/keijiban";
//	}
	
	@RequestMapping("/form")
	public String requestform(Form form1) {
		return "form/input";
	}
	
//			//削除(DELETE)
//			@RequestMapping("/del/{id}")
//			public String destory(@PathVariable Long id) {
//					sampledao.deleteDb(id);
//					return "redirect:/keijiban";
//				}
//			//更新画面の表示(SELECT)
//			@RequestMapping("/edit/{id}")
//			public String editView(@PathVariable Long id, Model model) {
//
//				//DBからデータを1件取ってくる(リストの形)
//				List<EntForm> list = sampledao.selectOne(id);

//				//リストから、オブジェクトだけをピックアップ
//				EntForm entformdb = list.get(0);
//
//				//スタンバイしているViewに向かって、データを投げる
//				model.addAttribute("form", entformdb);
//				model.addAttribute("title", "編集ページ");
//				return "form/edit";
//			}
//			//更新処理(UPDATE)
//			@RequestMapping("/edit/{id}/exe")
//			public String editExe(@PathVariable Long id, Model model, Form form) {
//				//フォームの値をエンティティに入れ直し
//				EntForm entform = new EntForm();
//				System.out.println(form.getName1());//取得できているかの確認
//				entform.setName(form.getName1());
//				//更新の実行
//				sampledao.updateDb(id,entform);
//				//一覧画面へリダイレクト
//				return "redirect:/view";
//			}
	
	

	 

	    

}
