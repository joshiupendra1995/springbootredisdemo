package com.springboot.app.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.app.model.Isin;
import com.springboot.app.model.IsinComposite;
import com.springboot.app.vo.IsinVO;

@Component
public class IsinMapper {

	public Isin getModel(IsinVO isinVO) {

		Isin isin = new Isin();
		isin.setIsin(isinVO.getIsin());
		IsinComposite isinComp = new IsinComposite();
		isinComp.setSecCode(isinVO.getSecCode());
		isinComp.setSecType(isinVO.getSecType());
		isin.setIsinComposite(isinComp);
		return isin;
	}

	public IsinVO getBO(Isin isin) {
		return new IsinVO(isin.getIsinComposite().getSecCode(), isin.getIsinComposite().getSecType(), isin.getIsin());

	}

	public List<IsinVO> getBOList(List<Isin> isin) {

		List<IsinVO> isinVOList = new ArrayList<>();

		isin.forEach(i -> {
			IsinVO isinVO = new IsinVO(i.getIsinComposite().getSecCode(), i.getIsinComposite().getSecType(),
					i.getIsin());
			isinVOList.add(isinVO);
		});

		return isinVOList;
	}

}
