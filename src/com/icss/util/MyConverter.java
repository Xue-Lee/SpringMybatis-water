package com.icss.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MyConverter implements Converter<String, Timestamp> {

	@Override
	public Timestamp convert(String ds) {//将年月日（不含时分秒）格式转换为时间戳
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dt=sdf.parse(ds);
			Timestamp tm=new Timestamp(dt.getTime());
			return tm;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
