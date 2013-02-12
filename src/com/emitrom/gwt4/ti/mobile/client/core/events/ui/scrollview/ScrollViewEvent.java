/**************************************************************************
   ScrollViewEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 **************************************************************************/

package com.emitrom.gwt4.ti.mobile.client.core.events.ui.scrollview;

import com.emitrom.gwt4.ti.mobile.client.core.events.ui.UIEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class ScrollViewEvent extends UIEvent {

    public static final String EVENT_NAME = "scroll";

    protected ScrollViewEvent() {

    }

    private ScrollViewEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * boolean to indicate if the scroll is based on a dragging gesture
     */
    public final native boolean isDragging() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.dragging;
    }-*/;

    /**
     * boolean to indicate if the scroll is decelerating
     */
    public final native boolean isDecelerating() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.decelerating;
    }-*/;

}
