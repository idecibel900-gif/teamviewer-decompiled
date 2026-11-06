package o;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nm implements tm, ew4 {
    public final ArrayList a;

    public nm(yc4 yc4Var) {
        yc4Var.getClass();
        String str = cm8.a;
        l61 l61Var = (l61) yc4Var.n;
        f35 f35Var = (f35) yc4Var.p;
        byte b = 3;
        byte b2 = 2;
        ArrayList arrayListN = qf0.N(new k50(l61Var, (byte) 0), new k50((l50) yc4Var.f2598o, (byte) 1), new k50((l61) yc4Var.q, (byte) 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Object systemService = ((Context) yc4Var.m).getSystemService("connectivity");
            systemService.getClass();
            arrayListN.add(new b35((ConnectivityManager) systemService));
        } else {
            f35Var.getClass();
            arrayListN.addAll(qf0.L(new k50(f35Var, b2), new k50(f35Var, b), new y25(f35Var), new x25(f35Var)));
        }
        this.a = arrayListN;
    }

    @Override // o.ew4
    public boolean a() {
        return false;
    }

    @Override // o.ew4
    public List b() {
        return this.a;
    }

    @Override // o.ew4
    public void c() {
    }

    @Override // o.tm
    public o30 d() {
        ArrayList arrayList = this.a;
        return ((dy3) arrayList.get(0)).c() ? new zz2(arrayList, (byte) 1) : new bh5(arrayList);
    }

    @Override // o.tm
    public List e() {
        return this.a;
    }

    @Override // o.tm
    public boolean f() {
        ArrayList arrayList = this.a;
        return arrayList.size() == 1 && ((dy3) arrayList.get(0)).c();
    }

    public void g(Object obj) {
        this.a.add(obj);
    }

    public void h(String str, String str2) {
        str.getClass();
        str2.getClass();
        i67.t(str);
        i67.u(str2, str);
        i67.h(this, str, str2);
    }

    public void i(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public void j(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f38 f38Var = (f38) arrayList.get(size);
            Matrix matrix = ta8.a;
            if (f38Var != null && !f38Var.a) {
                ta8.a(path, f38Var.d.i() / 100.0f, f38Var.e.i() / 100.0f, f38Var.f.i() / 360.0f);
            }
        }
    }

    public void k() {
        this.a.add(dh5.c);
    }

    public String l(String str) {
        Iterator it = this.a.iterator();
        String strG = "";
        while (it.hasNext()) {
            strG = fx3.g(strG, (String) it.next(), str);
        }
        return strG.length() > 1 ? strG.substring(0, strG.length() - 1) : strG;
    }

    public String m(String str) {
        if (str == null) {
            str = "";
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            str = fx3.g(str, (String) it.next(), "/");
        }
        return str;
    }

    public void n(float f, float f2) {
        this.a.add(new gh5(f, f2));
    }

    public void o(float f, float f2) {
        this.a.add(new oh5(f, f2));
    }

    public void p(float f, float f2) {
        this.a.add(new hh5(f, f2));
    }

    public void q(float f, float f2) {
        this.a.add(new ph5(f, f2));
    }

    public void r(float f, float f2, float f3, float f4) {
        this.a.add(new qh5(f, f2, f3, f4));
    }

    public void s(float f, float f2) {
        this.a.add(new kh5(f, f2));
    }

    public void t(float f, float f2) {
        this.a.add(new sh5(f, f2));
    }

    public void u(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void v(float f) {
        this.a.add(new th5(f));
    }

    public nm(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new it5(jSONObjectOptJSONObject));
                }
            }
        }
        this.a = arrayList;
    }

    public nm(ArrayList arrayList) {
        this.a = arrayList;
    }

    public nm(int i) {
        this.a = new ArrayList(i);
    }

    public nm(byte b) {
        switch (b) {
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = new ArrayList();
                break;
            case 4:
                this.a = new ArrayList();
                break;
            case 5:
                this.a = new ArrayList(20);
                break;
            case 6:
                this.a = new ArrayList(32);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public nm(ArrayList arrayList, Map map) {
        map.getClass();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            gj5 gj5Var = (gj5) map.get(str);
            if (gj5Var == null) {
                gj5Var = fj5.a;
            }
            arrayList2.add(new cs5(str, gj5Var));
        }
        this.a = arrayList2;
    }
}
