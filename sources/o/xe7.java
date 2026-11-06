package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class xe7 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public xe7(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        we7 we7Var = new we7(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    hk0.o("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                hk0.o("Unexpected end of document");
                return;
            }
            Menu menu2 = we7Var.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zz5.p);
                        we7Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        we7Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        we7Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        we7Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        we7Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        we7Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, zz5.q);
                        we7Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        we7Var.j = (typedArrayObtainStyledAttributes2.getInt(5, we7Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, we7Var.d) & 65535);
                        we7Var.k = typedArrayObtainStyledAttributes2.getText(7);
                        we7Var.l = typedArrayObtainStyledAttributes2.getText(8);
                        we7Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        we7Var.n = string == null ? (char) 0 : string.charAt(0);
                        we7Var.f2406o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        we7Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                        we7Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            we7Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            we7Var.r = we7Var.e;
                        }
                        we7Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        we7Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, we7Var.f);
                        we7Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, we7Var.g);
                        we7Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        we7Var.y = typedArrayObtainStyledAttributes2.getString(12);
                        we7Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        we7Var.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && we7Var.w == 0 && we7Var.x == null) {
                            we7Var.z = (qp4) we7Var.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                io.sentry.android.core.v0.j("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            we7Var.z = null;
                        }
                        we7Var.A = typedArrayObtainStyledAttributes2.getText(17);
                        we7Var.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            we7Var.D = h62.c(typedArrayObtainStyledAttributes2.getInt(19, -1), we7Var.D);
                        } else {
                            we7Var.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = hm3.m(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            we7Var.C = colorStateList;
                        } else {
                            we7Var.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        we7Var.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        we7Var.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(we7Var.b, we7Var.i, we7Var.j, we7Var.k);
                        we7Var.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        we7Var.b = 0;
                        we7Var.c = 0;
                        we7Var.d = 0;
                        we7Var.e = 0;
                        we7Var.f = true;
                        we7Var.g = true;
                    } else if (name3.equals("item")) {
                        if (!we7Var.h) {
                            qp4 qp4Var = we7Var.z;
                            if (qp4Var == null || !qp4Var.b.hasSubMenu()) {
                                we7Var.h = true;
                                we7Var.b(menu2.add(we7Var.b, we7Var.i, we7Var.j, we7Var.k));
                            } else {
                                we7Var.h = true;
                                we7Var.b(menu2.addSubMenu(we7Var.b, we7Var.i, we7Var.j, we7Var.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof jp4)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof jp4) {
                    jp4 jp4Var = (jp4) menu;
                    if (!jp4Var.p) {
                        jp4Var.y();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((jp4) menu).x();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((jp4) menu).x();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
