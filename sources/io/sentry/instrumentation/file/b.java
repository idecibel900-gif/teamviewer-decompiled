package io.sentry.instrumentation.file;

import io.sentry.a8;
import io.sentry.d6;
import io.sentry.g7;
import io.sentry.m7;
import io.sentry.s;
import io.sentry.util.r;
import io.sentry.v1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final v1 a;
    public final File b;
    public final g7 c;
    public a8 d = a8.OK;
    public long e;
    public final m7 f;

    public b(v1 v1Var, File file, g7 g7Var) {
        this.a = v1Var;
        this.b = file;
        this.c = g7Var;
        this.f = new m7(g7Var, (byte) 0);
        d6.d().a("FileIO");
    }

    public final void a(Closeable closeable) {
        try {
            try {
                closeable.close();
                b();
            } catch (IOException e) {
                this.d = a8.INTERNAL_ERROR;
                v1 v1Var = this.a;
                if (v1Var != null) {
                    v1Var.g(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    public final void b() {
        String strG;
        v1 v1Var = this.a;
        if (v1Var != null) {
            String strA = r.a(this.e);
            File file = this.b;
            g7 g7Var = this.c;
            if (file != null) {
                String strA2 = r.a(this.e);
                s dataCollectionResolver = g7Var.getDataCollectionResolver();
                g7 g7Var2 = dataCollectionResolver.a;
                Boolean bool = g7Var2.getDataCollection().f;
                boolean zIsSendDefaultPii = g7Var2.isSendDefaultPii();
                boolean zBooleanValue = true;
                if (bool != null) {
                    zIsSendDefaultPii = bool.booleanValue();
                } else if (dataCollectionResolver.b()) {
                    zIsSendDefaultPii = true;
                }
                if (zIsSendDefaultPii) {
                    strG = file.getName() + " (" + strA2 + ")";
                } else {
                    int iLastIndexOf = file.getName().lastIndexOf(46);
                    strG = (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() - 1) ? fx3.g("*** (", strA2, ")") : fx3.h("***", file.getName().substring(iLastIndexOf), " (", strA2, ")");
                }
                v1Var.q(strG);
                s dataCollectionResolver2 = g7Var.getDataCollectionResolver();
                g7 g7Var3 = dataCollectionResolver2.a;
                Boolean bool2 = g7Var3.getDataCollection().f;
                boolean zIsSendDefaultPii2 = g7Var3.isSendDefaultPii();
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else if (!dataCollectionResolver2.b()) {
                    zBooleanValue = zIsSendDefaultPii2;
                }
                if (zBooleanValue) {
                    v1Var.m(file.getAbsolutePath(), "file.path");
                }
            } else {
                v1Var.q(strA);
            }
            v1Var.m(Long.valueOf(this.e), "file.size");
            boolean zC = g7Var.getThreadChecker().c();
            v1Var.m(Boolean.valueOf(zC), "blocked_main_thread");
            if (zC) {
                v1Var.m(this.f.a(), "call_stack");
            }
            v1Var.h(this.d);
        }
    }

    public final Object c(a aVar) {
        try {
            Object objCall = aVar.call();
            if (objCall instanceof Integer) {
                int iIntValue = ((Integer) objCall).intValue();
                if (iIntValue != -1) {
                    this.e += (long) iIntValue;
                    return objCall;
                }
            } else if (objCall instanceof Long) {
                long jLongValue = ((Long) objCall).longValue();
                if (jLongValue != -1) {
                    this.e += jLongValue;
                }
            }
            return objCall;
        } catch (IOException e) {
            this.d = a8.INTERNAL_ERROR;
            v1 v1Var = this.a;
            if (v1Var != null) {
                v1Var.g(e);
            }
            throw e;
        }
    }
}
