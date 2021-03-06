package com.emitrom.ti4j.mobile.modules.gmap.client;

import java.util.Arrays;
import java.util.List;

import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;

/**
 * Represents a path between two or more points of interest.
 * <p>
 * The Route object gives you low-level control over routes that can be added to
 * a map view. A route must have its points property set to appear on a map.
 */
public class GMapRoute extends EventDispatcher {

    public GMapRoute() {
        jsObj = GMap.get().createRoute();
    }

    public native String getColor()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.color;
    }-*/;

    public native void setColor(String value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.color = value;
    }-*/;

    public native double getWidth()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.width;
    }-*/;

    public native void setWidth(double value)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.width = value;
    }-*/;

    public native List<GMapPointType> getPoints()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.points;
		return @com.emitrom.ti4j.mobile.modules.gmap.client.GMapPointType::fromArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setPoints(List<GMapPointType> values)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.points = @com.emitrom.ti4j.mobile.modules.gmap.client.GMapPointType::fromList(Ljava/util/List;)(values);
    }-*/;

    public void setPoints(GMapPointType... mapPointTypes) {
        setPoints(Arrays.asList(mapPointTypes));
    }

}
