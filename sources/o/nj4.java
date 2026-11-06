package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public enum nj4 implements ph0 {
    /* JADX INFO: Fake field, exist only in values array */
    MSCmdEmpty((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    ModularSessionTypeCommandType((byte) 1);

    public final boolean m;

    static {
        Enum[] enumArr = (Enum[]) nj4.class.getEnumConstants();
        SparseArray sparseArray = new SparseArray(enumArr != null ? enumArr.length : 0);
        Object[] objArr = (Enum[]) nj4.class.getEnumConstants();
        if (objArr != null) {
            for (Object obj : objArr) {
                sparseArray.put(((ph0) obj).a(), obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    nj4(byte b) {
        this.m = b;
    }

    @Override // o.ph0
    public final byte a() {
        return this.m ? (byte) 1 : (byte) 0;
    }
}
