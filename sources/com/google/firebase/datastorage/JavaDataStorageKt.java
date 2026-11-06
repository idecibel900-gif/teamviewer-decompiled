package com.google.firebase.datastorage;

import java.util.Arrays;
import kotlin.Metadata;
import o.er5;
import o.fx4;
import o.gr5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lo/gr5;", "Lo/er5;", "key", "defaultValue", "getOrDefault", "(Lo/gr5;Lo/er5;Ljava/lang/Object;)Ljava/lang/Object;", "com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class JavaDataStorageKt {
    public static final <T> T getOrDefault(gr5 gr5Var, er5 er5Var, T t) {
        gr5Var.getClass();
        er5Var.getClass();
        Object obj = (T) ((fx4) gr5Var).a.get(er5Var);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = (T) Arrays.copyOf(bArr, bArr.length);
        }
        return obj == null ? t : (T) obj;
    }
}
