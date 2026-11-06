package o;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class we6 {
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public ar h;
    public boolean i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2405o;
    public boolean p;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final og1 j = new og1((byte) 4);
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final ArrayList m = new ArrayList();
    public boolean n = true;
    public final wt3 a = w86.a.b(WorkDatabase.class);

    public we6(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public final void a(er4... er4VarArr) {
        for (er4 er4Var : er4VarArr) {
            Integer numValueOf = Integer.valueOf(er4Var.a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(er4Var.b));
        }
        for (er4 er4Var2 : (er4[]) Arrays.copyOf(er4VarArr, er4VarArr.length)) {
            this.j.b(er4Var2);
        }
    }
}
