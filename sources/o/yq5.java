package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yq5 extends cx2 implements iw2 {
    public static final yq5 n = new yq5(3, SharedPreferences.class, "getInt", "getInt(Ljava/lang/String;I)I", 0);

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        int iIntValue = ((Number) obj3).intValue();
        sharedPreferences.getClass();
        return Integer.valueOf(sharedPreferences.getInt((String) obj2, iIntValue));
    }
}
