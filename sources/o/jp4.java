package o;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class jp4 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public hp4 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f1189o;
    public pp4 v;
    public boolean x;
    public boolean l = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public jp4(Context context) {
        boolean zV;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zV = dq.v(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zV = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zV) {
                z = true;
            }
        }
        this.d = z;
    }

    public pp4 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            hk0.g("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        pp4 pp4Var = new pp4(this, i, i2, i3, i6, charSequence, this.l ? 1 : 0);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((pp4) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, pp4Var);
                r(true);
                return pp4Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, pp4Var);
        r(true);
        return pp4Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            pp4 pp4VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            pp4VarA.setIcon(resolveInfo.loadIcon(packageManager));
            pp4VarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = pp4VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        pp4 pp4VarA = a(i, i2, i3, charSequence);
        gd7 gd7Var = new gd7(this.a, this, pp4VarA);
        pp4VarA.f1761o = gd7Var;
        gd7Var.setHeaderTitle(pp4VarA.e);
        return gd7Var;
    }

    public final void b(gq4 gq4Var, Context context) {
        this.u.add(new WeakReference(gq4Var));
        gq4Var.d(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gq4 gq4Var = (gq4) weakReference.get();
            if (gq4Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                gq4Var.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        pp4 pp4Var = this.v;
        if (pp4Var != null) {
            d(pp4Var);
        }
        this.f.clear();
        r(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.f1189o = null;
        r(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(pp4 pp4Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zM = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == pp4Var) {
            y();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                gq4 gq4Var = (gq4) weakReference.get();
                if (gq4Var != null) {
                    zM = gq4Var.m(pp4Var);
                    if (zM) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            x();
            if (zM) {
                this.v = null;
            }
        }
        return zM;
    }

    public boolean e(jp4 jp4Var, MenuItem menuItem) {
        hp4 hp4Var = this.e;
        return hp4Var != null && hp4Var.a(jp4Var, menuItem);
    }

    public final void f(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                gq4 gq4Var = (gq4) weakReference.get();
                if (gq4Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = gq4Var.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        gq4Var.h(parcelable);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pp4 pp4Var = (pp4) arrayList.get(i2);
            if (pp4Var.a == i) {
                return pp4Var;
            }
            if (pp4Var.hasSubMenu() && (menuItemFindItem = pp4Var.f1761o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final void g(Bundle bundle) {
        Parcelable parcelableL;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gq4 gq4Var = (gq4) weakReference.get();
            if (gq4Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = gq4Var.getId();
                if (id > 0 && (parcelableL = gq4Var.l()) != null) {
                    sparseArray.put(id, parcelableL);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public boolean h(pp4 pp4Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zJ = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gq4 gq4Var = (gq4) weakReference.get();
            if (gq4Var != null) {
                zJ = gq4Var.j(pp4Var);
                if (zJ) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        x();
        if (zJ) {
            this.v = pp4Var;
        }
        return zJ;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((pp4) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final pp4 i(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (pp4) arrayList.get(0);
        }
        boolean zP = p();
        for (int i2 = 0; i2 < size; i2++) {
            pp4 pp4Var = (pp4) arrayList.get(i2);
            char c = zP ? pp4Var.j : pp4Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zP && c == '\b' && i == 67))) {
                return pp4Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return i(i, keyEvent) != null;
    }

    public final void j(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zP = p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                pp4 pp4Var = (pp4) arrayList2.get(i2);
                if (pp4Var.hasSubMenu()) {
                    pp4Var.f1761o.j(arrayList, i, keyEvent);
                }
                char c = zP ? pp4Var.j : pp4Var.h;
                if ((modifiers & 69647) == ((zP ? pp4Var.k : pp4Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zP && c == '\b' && i == 67)) && pp4Var.isEnabled()) {
                        arrayList.add(pp4Var);
                    }
                }
            }
        }
    }

    public final void k() {
        ArrayList arrayListN = n();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zE = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                gq4 gq4Var = (gq4) weakReference.get();
                if (gq4Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= gq4Var.e();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zE) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListN.size();
                for (int i = 0; i < size; i++) {
                    pp4 pp4Var = (pp4) arrayListN.get(i);
                    if ((pp4Var.x & 32) == 32) {
                        arrayList.add(pp4Var);
                    } else {
                        arrayList2.add(pp4Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(n());
            }
            this.k = false;
        }
    }

    public String l() {
        return "android:menu:actionviewstates";
    }

    public jp4 m() {
        return this;
    }

    public final ArrayList n() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            pp4 pp4Var = (pp4) arrayList2.get(i);
            if (pp4Var.isVisible()) {
                arrayList.add(pp4Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean o() {
        return this.w;
    }

    public boolean p() {
        return this.c;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return s(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        pp4 pp4VarI = i(i, keyEvent);
        boolean zS = pp4VarI != null ? s(pp4VarI, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zS;
    }

    public boolean q() {
        return this.d;
    }

    public void r(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gq4 gq4Var = (gq4) weakReference.get();
            if (gq4Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                gq4Var.c(z);
            }
        }
        x();
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((pp4) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((pp4) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            r(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((pp4) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        r(true);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean s(MenuItem menuItem, gq4 gq4Var, int i) {
        qp4 qp4Var;
        boolean zExpandActionView;
        qp4 qp4Var2;
        boolean z;
        gd7 gd7Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        gq4 gq4Var2;
        pp4 pp4Var = (pp4) menuItem;
        boolean zF = false;
        if (pp4Var == null || !pp4Var.isEnabled()) {
            return false;
        }
        jp4 jp4Var = pp4Var.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = pp4Var.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(pp4Var)) && !jp4Var.e(jp4Var, pp4Var)) {
            Intent intent = pp4Var.g;
            if (intent != null) {
                try {
                    jp4Var.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    io.sentry.android.core.v0.d("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    qp4Var = pp4Var.A;
                    if (qp4Var == null) {
                    }
                    zExpandActionView = false;
                    qp4Var2 = pp4Var.A;
                    if (qp4Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (pp4Var.e()) {
                        zExpandActionView |= pp4Var.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (pp4Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!pp4Var.hasSubMenu()) {
                            gd7 gd7Var2 = new gd7(this.a, this, pp4Var);
                            pp4Var.f1761o = gd7Var2;
                            gd7Var2.setHeaderTitle(pp4Var.e);
                        }
                        gd7Var = pp4Var.f1761o;
                        if (z) {
                            qp4Var2.b.onPrepareSubMenu(gd7Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (gq4Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                gq4Var2 = (gq4) weakReference.get();
                                if (gq4Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zF) {
                                    zF = gq4Var2.f(gd7Var);
                                }
                            }
                        }
                        zExpandActionView |= zF;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!pp4Var.hasSubMenu()) {
                            gd7 gd7Var3 = new gd7(this.a, this, pp4Var);
                            pp4Var.f1761o = gd7Var3;
                            gd7Var3.setHeaderTitle(pp4Var.e);
                        }
                        gd7Var = pp4Var.f1761o;
                        if (z) {
                            qp4Var2.b.onPrepareSubMenu(gd7Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zF = gq4Var != null ? gq4Var.f(gd7Var) : false;
                            while (r8.hasNext()) {
                                gq4Var2 = (gq4) weakReference.get();
                                if (gq4Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zF) {
                                    zF = gq4Var2.f(gd7Var);
                                }
                            }
                        }
                        zExpandActionView |= zF;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                qp4Var = pp4Var.A;
                if (qp4Var == null && qp4Var.b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        qp4Var2 = pp4Var.A;
        if (qp4Var2 == null && qp4Var2.b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (pp4Var.e()) {
            zExpandActionView |= pp4Var.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (pp4Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!pp4Var.hasSubMenu()) {
                gd7 gd7Var4 = new gd7(this.a, this, pp4Var);
                pp4Var.f1761o = gd7Var4;
                gd7Var4.setHeaderTitle(pp4Var.e);
            }
            gd7Var = pp4Var.f1761o;
            if (z) {
                qp4Var2.b.onPrepareSubMenu(gd7Var);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (gq4Var != null) {
                }
                while (r8.hasNext()) {
                    gq4Var2 = (gq4) weakReference.get();
                    if (gq4Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zF) {
                        zF = gq4Var2.f(gd7Var);
                    }
                }
            }
            zExpandActionView |= zF;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pp4 pp4Var = (pp4) arrayList.get(i2);
            if (pp4Var.b == i) {
                pp4Var.f(z2);
                pp4Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pp4 pp4Var = (pp4) arrayList.get(i2);
            if (pp4Var.b == i) {
                pp4Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            pp4 pp4Var = (pp4) arrayList.get(i2);
            if (pp4Var.b == i) {
                int i3 = pp4Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                pp4Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            r(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        r(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(gq4 gq4Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            gq4 gq4Var2 = (gq4) weakReference.get();
            if (gq4Var2 == null || gq4Var2 == gq4Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void u(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(l());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((gd7) item.getSubMenu()).u(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void v(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((gd7) item.getSubMenu()).v(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(l(), sparseArray);
        }
    }

    public final void w(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f1189o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.f1189o = null;
        }
        r(false);
    }

    public final void x() {
        this.p = false;
        if (this.q) {
            this.q = false;
            r(this.r);
        }
    }

    public final void y() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
