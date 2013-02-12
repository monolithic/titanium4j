package com.emitrom.gwt4.ti.mobile.client.core.handlers.ui;

import com.emitrom.gwt4.ti.mobile.client.ui.UIObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A callback registration object, created so that an event listener
 * can unregister.
 * @author mvniekerk
 *
 */
public class CallbackRegistration {
	
	private final UIObject uiObject;
	private final String actionString;
	private final JavaScriptObject functionJso;
	
	/**
	 * Constructor.
	 * @param uiObject		The object to which the listener was created against
	 * @param actionString	The name of the action
	 * @param jso			The function that needs to be removed on unregister
	 */
	public CallbackRegistration(UIObject uiObject, String actionString, JavaScriptObject jso) {
		this.uiObject = uiObject;
		this.actionString = actionString;
		this.functionJso = jso;
	}
	
	public UIObject getUiObject() {
		return uiObject;
	}
	
	public String getActionString() {
		return actionString;
	}
	
	public JavaScriptObject getJso() {
		return functionJso;
	}
	
	/**
	 * Unregisters the event listener from the object
	 */
	public native void unregister() /*-{
		var obj = this.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::getUiObject()();
		var objjso = obj.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var action = this.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::getActionString()();
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::getJso()();
		objjso.removeEventListener(action, jso);
	}-*/;
}
