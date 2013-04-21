/**************************************************************************
 * SwitchEvent.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/

package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.HideHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class HideEvent extends UIEvent {

    public static String HIDE = "hide";

    /**
     * UiBinder implementations
     */
    private static Type<HideHandler> TYPE = new Type<HideHandler>(HIDE, null);

    public static Type<HideHandler> getType() {
        return TYPE;
    }

    public static Type<HideHandler> getAssociatedType() {
        return TYPE;
    }

    protected HideEvent() {

    }

    private HideEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the index of the image that is now visible
     */
    public native boolean getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

}
