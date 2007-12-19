package ar.com.fdvs.dj.domain.builders;

import java.awt.Color;

import ar.com.fdvs.dj.domain.Style;
import ar.com.fdvs.dj.domain.constants.Border;
import ar.com.fdvs.dj.domain.constants.Font;
import ar.com.fdvs.dj.domain.constants.HorizontalAlign;
import ar.com.fdvs.dj.domain.constants.Rotation;
import ar.com.fdvs.dj.domain.constants.Stretching;
import ar.com.fdvs.dj.domain.constants.Transparency;
import ar.com.fdvs.dj.domain.constants.VerticalAlign;

public class StyleBuilder {
	
	Style style = null;

	public StyleBuilder(boolean blank) {
		super();
		
		if (blank)
			style = Style.createBlankStyle(null);
		else
			style = new Style();
		
	}
	
	public Style build(){
		return style;
	}
	
	
	public StyleBuilder setName(String name){
		style.setName(name);
		return this;
	}
	
	public StyleBuilder setPattern(String pattern){
		style.setPattern(pattern);
		return this;
	}

	public StyleBuilder setFont(Font font){
		style.setFont(font);
		return this;
	}

	public StyleBuilder setHorizontalAlign(HorizontalAlign horizontalAlign){
		style.setHorizontalAlign(horizontalAlign);
		return this;
	}

	public StyleBuilder setVerticalAlign(VerticalAlign verticalAlign){
		style.setVerticalAlign(verticalAlign);
		return this;
	}

	public StyleBuilder setStretching(Stretching streching){
		style.setStreching(streching);
		return this;
	}
	
	public StyleBuilder setTextColor(Color textColor){
		style.setTextColor(textColor);
		return this;
	}
	
	public StyleBuilder setBackgroundColor(Color backgroundColor){
		style.setBackgroundColor(backgroundColor);
		return this;
	}

	public StyleBuilder setTransparency(Transparency transparency){
		style.setTransparency(transparency);
		return this;
	}

	public StyleBuilder setBorderBottom(Border borderBottom) {
		style.setBorderBottom(borderBottom);
		return this;
	}

	public StyleBuilder setBorderColor(Color borderColor) {
		style.setBorderColor(borderColor);
		return this;
	}

	public StyleBuilder setBorderLeft(Border borderLeft) {
		style.setBorderLeft(borderLeft);
		return this;
	}

	public StyleBuilder setBorderRight(Border borderRight) {
		style.setBorderRight(borderRight);
		return this;
	}

	public StyleBuilder setBorderTop(Border borderTop) {
		style.setBorderTop(borderTop);
		return this;
	}

	public StyleBuilder setPadding(Integer padding) {
		style.setPadding(padding);
		return this;
	}

	public StyleBuilder setPaddingBotton(Integer paddingBotton) {
		style.setPaddingBotton(paddingBotton);
		return this;
	}

	public StyleBuilder setPaddingLeft(Integer paddingLeft) {
		style.setPaddingLeft(paddingLeft);
		return this;
	}

	public StyleBuilder setPaddingRight(Integer paddingRight) {
		style.setPaddingRight(paddingRight);
		return this;
	}

	public StyleBuilder setPaddingTop(Integer paddingTop) {
		style.setPaddingTop(paddingTop);
		return this;
	}

	public StyleBuilder setParentStyleName(String parentStyleName) {
		style.setParentStyleName(parentStyleName);
		return this;
	}


	public StyleBuilder setRotation(Rotation rotation) {
		style.setRotation(rotation);
		return this;
	}


}