package o;

import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f30 implements tm {
    public final /* synthetic */ byte a;
    public List b;

    public f30() {
        this.a = (byte) 1;
        this.b = new ArrayList();
    }

    public abstract void a();

    public boolean b(String str, String str2) {
        return false;
    }

    public boolean c(String str) {
        str.getClass();
        return false;
    }

    @Override // o.tm
    public List e() {
        return this.b;
    }

    @Override // o.tm
    public boolean f() {
        List list = this.b;
        return list.isEmpty() || (list.size() == 1 && ((dy3) list.get(0)).c());
    }

    public abstract String g();

    public String h(String str) {
        String parent;
        return (str == null || str.length() == 0 || im3.n(str, Environment.getExternalStorageDirectory().getAbsolutePath()) || (parent = new File(str).getParent()) == null || parent.length() == 0) ? "" : parent;
    }

    public boolean i() {
        String externalStorageState;
        try {
            externalStorageState = Environment.getExternalStorageState();
            externalStorageState.getClass();
        } catch (NullPointerException unused) {
            ye4.c("StorageHelper", "external storage check failed");
            externalStorageState = "unknown";
        }
        return "mounted".equals(externalStorageState);
    }

    public boolean j() {
        return true;
    }

    public abstract void k(String str, xk1 xk1Var);

    public abstract LinkedList l(String str);

    public abstract void m(String str, ct6 ct6Var);

    public boolean n(String str, String str2) {
        str.getClass();
        return false;
    }

    public abstract void o(String str);

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f30(List list) {
        this.a = (byte) 0;
        this.b = list;
    }
}
