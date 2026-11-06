package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar5 extends cx2 implements iw2 {
    public static final ar5 n = new ar5(3, SharedPreferences.Editor.class, "putString", "putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", 0);

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        editor.getClass();
        return editor.putString((String) obj2, (String) obj3);
    }
}
