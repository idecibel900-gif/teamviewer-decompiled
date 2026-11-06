package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import io.sentry.android.core.v0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class DefaultsXmlParser {
    /* JADX WARN: Code duplicated, block: B:41:0x007e A[Catch: IOException -> 0x0013, XmlPullParserException -> 0x0016, TryCatch #2 {IOException -> 0x0013, XmlPullParserException -> 0x0016, blocks: (B:3:0x0007, B:5:0x000d, B:11:0x0019, B:16:0x002b, B:42:0x0083, B:19:0x0033, B:23:0x0043, B:24:0x0047, B:30:0x0055, B:41:0x007e, B:35:0x0064, B:37:0x006c, B:38:0x0071, B:40:0x0079), top: B:47:0x0007 }] */
    public static Map<String, String> getDefaultsFromXml(Context context, int i) {
        HashMap map = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                v0.c("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
                return map;
            }
            XmlResourceParser xml = resources.getXml(i);
            String name = null;
            String text = null;
            String text2 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    name = xml.getName();
                } else if (eventType == 3) {
                    if (xml.getName().equals("entry")) {
                        if (text == null || text2 == null) {
                            v0.j("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                        } else {
                            map.put(text, text2);
                        }
                        text = null;
                        text2 = null;
                    }
                    name = null;
                } else if (eventType == 4 && name != null) {
                    int iHashCode = name.hashCode();
                    if (iHashCode != 106079) {
                        if (iHashCode == 111972721 && name.equals("value")) {
                            text2 = xml.getText();
                        } else {
                            v0.j("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        }
                    } else if (name.equals("key")) {
                        text = xml.getText();
                    } else {
                        v0.j("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                    }
                }
            }
            return map;
        } catch (IOException e) {
            e = e;
            v0.d("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            return map;
        } catch (XmlPullParserException e2) {
            e = e2;
            v0.d("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
            return map;
        }
    }
}
