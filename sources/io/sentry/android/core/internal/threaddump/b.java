package io.sentry.android.core.internal.threaddump;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;
import o.k61;
import o.rz5;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public final ArrayList b;
    public int c;

    public b(Context context, XmlResourceParser xmlResourceParser) {
        this.b = new ArrayList();
        this.c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), rz5.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new k61().a(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public a a() {
        int i = this.c;
        if (i < 0 || i >= this.a) {
            return null;
        }
        this.c = i + 1;
        return (a) this.b.get(i);
    }

    public b(ArrayList arrayList) {
        this.b = arrayList;
        this.a = arrayList.size();
    }
}
