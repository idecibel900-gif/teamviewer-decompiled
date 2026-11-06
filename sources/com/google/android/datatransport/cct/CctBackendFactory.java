package com.google.android.datatransport.cct;

import android.content.Context;
import o.g28;
import o.hm0;
import o.i00;
import o.ze1;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public g28 create(ze1 ze1Var) {
        Context context = ((i00) ze1Var).a;
        i00 i00Var = (i00) ze1Var;
        return new hm0(context, i00Var.b, i00Var.c);
    }
}
