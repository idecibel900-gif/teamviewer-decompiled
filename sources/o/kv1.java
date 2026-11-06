package o;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kv1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Serializable h;

    public kv1(AssetManager assetManager, Executor executor, lt5 lt5Var, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = lt5Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = mo8.r;
                    break;
                case 27:
                    bArr = mo8.q;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = mo8.p;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = mo8.f1494o;
        }
        this.d = bArr;
    }

    public void a(j04 j04Var) {
        yc4 yc4Var = (yc4) this.g;
        if (yc4Var == null || j04Var != ((j04) this.h) || yc4Var.b()) {
            this.h = j04Var;
            xo xoVar = (xo) this.b;
            ot7 ot7VarC = y57.C((ot7) this.c, j04Var);
            yc4Var = new yc4((List) this.f, xoVar, (in1) this.d, (mr2) this.e, ot7VarC, this.a);
        }
        this.g = yc4Var;
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((lt5) this.c).o();
            return null;
        }
    }

    public void c(final int i, final Serializable serializable) {
        ((Executor) this.b).execute(new Runnable() { // from class: o.jv1
            @Override // java.lang.Runnable
            public final void run() {
                ((lt5) this.m.c).q(i, serializable);
            }
        });
    }

    public kv1(List list, xo xoVar, in1 in1Var, mr2 mr2Var, ot7 ot7Var, boolean z) {
        this.b = xoVar;
        this.c = ot7Var;
        this.a = z;
        this.d = in1Var;
        this.e = mr2Var;
        this.f = list;
    }
}
