package com.emitrom.ti4j.mobile.client.ui;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A gradient js object, used in backgrounds for views
 *
 * mvniekerk
 *
 */
public class Gradient extends JavaScriptObject {
	
	protected Gradient() {}

	/**
	 * Set the gradient type as linear
	 */
	public native final void setAsLinear() /*-{
		this.type = 'linear';
	}-*/;
	
	/**
	 * Set the gradient type as radial
	 */
	public native final void setAsRadial() /*-{
		this.type = 'radial';
	}-*/;
	
	/**
	 * Set the start point of the gradient
	 * @param x
	 * @param y
	 */
	public native final void setStartPoint(String x, String y) /*-{
		var sp = {};
		sp.x = x;
		sp.y = y;
		this.startPoint = sp;
	}-*/;
	
	/**
	 * Set the end point of the gradient
	 * @param x
	 * @param y
	 */
	public native final void setEndPoint(String x, String y) /*-{
		var sp = {};
		sp.x = x;
		sp.y = y;
		this.endPoint = sp;
	}-*/;
	
	/**
	 * Set the colors of gradient. See createColorOffset code
	 * for reference JSO
	 * @param colors
	 */
	public native final void setColors(JsArray<JavaScriptObject> colors) /*-{
		this.colors = colors;
	}-*/;
	
	/**
	 * Helper function creating a color and its offset.
	 * Used when setting
	 * @param color		The color
	 * @param offset	And its offset
	 * @return			The jso of this color + offset
	 */
	public native final JavaScriptObject createColorOffset(String color, double offset) /*-{
		var ret = {};
		ret.color = color;
		ret.offset = offset;
		return ret;
	}-*/;
	
	/**
	 * Set the colors of this gradient using an array of colors with equal amount
	 * offsets and colors.
	 * @param colors		The array of color strings
	 * @param offsets		The offsets
	 */
	public final void setColors(String[] colors, double[] offsets) {
		if (colors.length != offsets.length) {
			return; //Misfit between colors and offsets array length
		}
		@SuppressWarnings("unchecked")
		JsArray<JavaScriptObject> c = (JsArray<JavaScriptObject>) JavaScriptObject.createArray();
		c.setLength(colors.length);
		for (int i = 0; i < colors.length; ++i) {
			JavaScriptObject newColor = createColorOffset(colors[i], offsets[i]);
			c.set(i, newColor);
		}
		setColors(c);
	}
}
