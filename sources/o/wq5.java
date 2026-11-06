package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wq5 extends cx2 implements iw2 {
    public static final wq5 n = new wq5(3, SharedPreferences.class, "getBoolean", "getBoolean(Ljava/lang/String;Z)Z", 0);

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        sharedPreferences.getClass();
        return Boolean.valueOf(sharedPreferences.getBoolean((String) obj2, zBooleanValue));
    }
}
