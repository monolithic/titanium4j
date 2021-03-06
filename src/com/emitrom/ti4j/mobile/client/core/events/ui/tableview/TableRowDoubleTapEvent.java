package com.emitrom.ti4j.mobile.client.core.events.ui.tableview;

import com.emitrom.ti4j.mobile.client.core.events.ui.InteractionEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TableRowDoubleTapHandler;
import com.emitrom.ti4j.mobile.client.data.TableViewBaseModel;
import com.emitrom.ti4j.mobile.client.ui.Point;
import com.emitrom.ti4j.mobile.client.ui.TableViewRow;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TableRowDoubleTapEvent extends InteractionEvent {

    public static String EVENT_NAME = "doubletap";

    /**
     * UiBinder implementations
     */
    private static Type<TableRowDoubleTapHandler> TYPE = new Type<TableRowDoubleTapHandler>(EVENT_NAME, null);

    public static Type<TableRowDoubleTapHandler> getType() {
        return TYPE;
    }

    public static Type<TableRowDoubleTapHandler> getAssociatedType() {
        return TYPE;
    }

    protected TableRowDoubleTapEvent() {

    }

    private TableRowDoubleTapEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    public native TableViewRow getRow() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.row;
		return @com.emitrom.ti4j.mobile.client.ui.TableViewRow::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private native double _getGlobalX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.globalPoint.x;
    }-*/;

    private native double _getGlobalY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.globalPoint.y;
    }-*/;

    public Point getGlobalPoint() {
        return new Point(_getGlobalX(), _getGlobalY());
    }

    public native TableViewBaseModel getRowData() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.rowData;
		return @com.emitrom.ti4j.mobile.client.data.TableViewBaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native double getX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.x;
    }-*/;

    public native double getY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.y;
    }-*/;

}
