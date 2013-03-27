/**************************************************************************
   CloudChatsGroupResponse.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.chats;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.mobile.client.cloud.core.AbstractHandlerResponse;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Argument passed to the callback when a request finishes successfully or
 * erroneously.
 * 
 */
public class CloudChatsGroupResponse extends AbstractHandlerResponse {

    CloudChatsGroupResponse(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * 
     List of chat response objects, if any
     */
    public List<ChatGroup> getChatGroups() {
        List<ChatGroup> list = new ArrayList<ChatGroup>();
        JavaScriptObject chatGroups = _getChatsGroups();
        int size = JsoHelper.getJavaScriptObjectArraySize(chatGroups);
        for (int i = 0; i < size; i++) {
            JavaScriptObject chatGroup = JsoHelper.getValueFromJavaScriptObjectArray(chatGroups, i);
            list.add(new ChatGroup(chatGroup));
        }
        return list;
    }

    /**
     * 
     Array of chat response objects, if any
     */
    private native JavaScriptObject _getChatsGroups()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.chat_groups;
    }-*/;

}
