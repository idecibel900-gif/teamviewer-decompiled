package io.sentry;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h4 {
    public final Serializable a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public h4(Boolean bool, Double d, Double d2, Boolean bool2, Double d3) {
        this.a = bool;
        this.b = d;
        this.c = d2;
        this.d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.e = d3;
    }

    public static h4 a(n7 n7Var, d dVar, g7 g7Var) {
        if (g7Var != null) {
            String effectiveOrgId = g7Var.getEffectiveOrgId();
            String strB = dVar.b("sentry-org_id");
            String strTrim = (strB == null || strB.trim().isEmpty()) ? null : strB.trim();
            if ((effectiveOrgId != null && strTrim != null && !effectiveOrgId.equals(strTrim)) || (g7Var.isStrictTraceContinuation() && ((effectiveOrgId != null || strTrim != null) && (effectiveOrgId == null || !effectiveOrgId.equals(strTrim))))) {
                g7Var.getLogger().g(f6.DEBUG, "Not continuing trace due to strict org ID validation failure.", new Object[0]);
                return new h4();
            }
        }
        return new h4(n7Var.a, new y7(), n7Var.b, dVar, n7Var.c);
    }

    public h4(Boolean bool, Double d, Double d2) {
        this(bool, d, d2, Boolean.FALSE, (Double) null);
    }

    public h4(Boolean bool, Double d) {
        this(bool, d, (Double) null, Boolean.FALSE, (Double) null);
    }

    public h4() {
        this(new io.sentry.protocol.w(), new y7(), (y7) null, (d) null, (Boolean) null);
    }

    public h4(io.sentry.protocol.w wVar, y7 y7Var, y7 y7Var2, d dVar, Boolean bool) {
        this.b = wVar;
        this.c = y7Var;
        this.d = y7Var2;
        this.e = io.sentry.util.b.i(dVar, bool, null, null);
        this.a = bool;
    }

    public h4(h4 h4Var) {
        this((io.sentry.protocol.w) h4Var.b, (y7) h4Var.c, (y7) h4Var.d, (d) h4Var.e, (Boolean) h4Var.a);
    }

    public h4(io.sentry.android.core.e0 e0Var) {
        this.b = e0Var;
        this.c = null;
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public h4(io.sentry.android.core.e0 e0Var, byte[] bArr) {
        this.b = e0Var;
        this.c = bArr;
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public h4(io.sentry.android.core.e0 e0Var, byte[] bArr, ArrayList arrayList, ArrayList arrayList2, io.sentry.protocol.c cVar) {
        this.b = e0Var;
        this.c = bArr;
        this.d = arrayList;
        this.a = arrayList2;
        this.e = cVar;
    }
}
